package nl.ansuz.android.glitch.api.util.gson;

import java.lang.reflect.Type;
import java.util.Map;

import nl.ansuz.android.glitch.api.response.skills.LearnResponse;
import nl.ansuz.android.glitch.api.vo.skills.UnlearningVO;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * GSON deserializer for the Glitch skills.learn API response.
 * 
 * @author Wijnand
 */
public class LearnDeserializer extends GlitchDeserializer implements
		JsonDeserializer<LearnResponse> {

	/**
	 * @see super.deserialize(json, typeOfT, context)
	 */
	@Override
	public LearnResponse deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		
		LearnResponse result = new LearnResponse();
		JsonObject jsonObject = json.getAsJsonObject();
		
		// Deserialize defaults.
		result = (LearnResponse)deserializeResponseDefaults(result, jsonObject);
		
		// Check success.
		if(!result.getSuccess()) {
			// Fetch error details.
			if (jsonObject.has("id")) {
				result.id = jsonObject.getAsJsonPrimitive("id").getAsString();
			}
			if (jsonObject.has("busyUnlearning")) {
				result.busyUnlearning = jsonObject.getAsJsonPrimitive("busyUnlearning").getAsInt();
			}
			if (jsonObject.has("learn")) {
				result.learn = jsonObject.getAsJsonPrimitive("learn").getAsInt();
			}
			if (jsonObject.has("fullname")) {
				result.fullName = jsonObject.getAsJsonPrimitive("fullname").getAsString();
			}
		} else {
			// Deserialize learning info.
			for(Map.Entry<String, JsonElement> jsonElement : jsonObject.entrySet()) {
				if(!isDefaultProperty(jsonElement.getKey())) {
					// When it isn't a default API response element, it must be the
					// Skill info. Gotta love this well structured JSON!!! :S
					result.skill = context.deserialize(jsonElement.getValue(), UnlearningVO.class);
					result.skill.name = jsonElement.getKey();
					
					// Stop as soon as we've found the Skill info.
					break;
				}
			}
		}
		
		return result;
		
	}

}
