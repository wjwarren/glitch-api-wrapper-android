package nl.ansuz.android.glitch.api.util.gson.snaps;

import java.lang.reflect.Type;

import nl.ansuz.android.glitch.api.response.snaps.GetRecentResponse;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

/**
 * GSON deserializer for Glitch Snaps.getRecent API response.
 * 
 * @author Wijnand
 */
public class GetRecentDeserializer extends SnapListDeserializer implements
		JsonDeserializer<GetRecentResponse> {

	@Override
	public GetRecentResponse deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {

		return (GetRecentResponse)deserialize(new GetRecentResponse(), json, context);
	}

}
