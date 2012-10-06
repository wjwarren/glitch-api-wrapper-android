package nl.ansuz.android.glitch.api.util.gson.snaps;

import java.lang.reflect.Type;
import java.util.Map;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.response.snaps.GetRecentForPlayerResponse;
import nl.ansuz.android.glitch.api.util.gson.GlitchDeserializer;
import nl.ansuz.android.glitch.api.vo.snaps.SnapVO;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class GetRecentForPlayerDeserializer extends GlitchDeserializer
		implements JsonDeserializer<GetRecentForPlayerResponse> {

	@Override
	public GetRecentForPlayerResponse deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		
		JsonObject jsonObject = json.getAsJsonObject();
		GetRecentForPlayerResponse result = new GetRecentForPlayerResponse();
		
		// Deserialize defaults.
		GlitchResponse defaults = context.deserialize(json, GlitchResponse.class);
		result = copyFromTo(defaults, result);
		
		// Count the Number of Snaps.
		int snapCount = 0;
		for(Map.Entry<String, JsonElement> jsonElement : jsonObject.entrySet()) {
			if(!isDefaultProperty(jsonElement.getKey())) {
				// When it isn't a default API response element, it must be a
				// Snap. Again, gotta love this well structured JSON!!! :S
				snapCount++;
			}
		}
		
		// Deserialize Snaps.
		result.snaps = new SnapVO[snapCount];
		snapCount = 0;
		for(Map.Entry<String, JsonElement> jsonElement : jsonObject.entrySet()) {
			if(!isDefaultProperty(jsonElement.getKey())) {
				result.snaps[snapCount] = context.deserialize(jsonElement.getValue(), SnapVO.class);
				snapCount++;
			}
		}
		
		return result;
	}

}
