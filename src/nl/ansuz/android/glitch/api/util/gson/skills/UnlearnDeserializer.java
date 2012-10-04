package nl.ansuz.android.glitch.api.util.gson.skills;

import java.lang.reflect.Type;
import java.util.Map;

import nl.ansuz.android.glitch.api.response.skills.UnlearnResponse;
import nl.ansuz.android.glitch.api.util.gson.GlitchDeserializer;
import nl.ansuz.android.glitch.api.vo.skills.UnlearningVO;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * GSON deserializer for the Glitch skills.unlearn API response.
 * 
 * @author Wijnand
 */
public class UnlearnDeserializer extends GlitchDeserializer implements JsonDeserializer<UnlearnResponse> {

	/**
	 * @see super.deserialize(json, typeOfT, context)
	 */
	@Override
	public UnlearnResponse deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		
		UnlearnResponse result = new UnlearnResponse();
		JsonObject jsonObject = json.getAsJsonObject();
		
		// Deserialize defaults.
		result = (UnlearnResponse)deserializeResponseDefaults(result, jsonObject);
		
		if(result.getSuccess()) {
			// Deserialize unlearning info.
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
