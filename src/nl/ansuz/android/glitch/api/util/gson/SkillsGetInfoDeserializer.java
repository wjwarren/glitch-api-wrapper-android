package nl.ansuz.android.glitch.api.util.gson;

import java.lang.reflect.Type;

import nl.ansuz.android.glitch.api.response.skills.GetInfoResponse;
import nl.ansuz.android.glitch.api.vo.players.SkillVO;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * GSON deserializer for the Glitch skills.getInfo API response.
 * 
 * @author Wijnand
 */
public class SkillsGetInfoDeserializer extends GlitchDeserializer implements
		JsonDeserializer<GetInfoResponse> {

	/**
	 * @see super.deserialize(json, typeOfT, context)
	 */
	@Override
	public GetInfoResponse deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {

		GetInfoResponse result = new GetInfoResponse();
		JsonObject jsonObject = json.getAsJsonObject();

		// Deserialize defaults.
		result = (GetInfoResponse)deserializeResponseDefaults(result, jsonObject);
		
		// Parse actual Skill info.
		result.skillInfo = (SkillVO)context.deserialize(json, SkillVO.class);
		
		return result;
	}

}
