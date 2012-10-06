package nl.ansuz.android.glitch.api.util.gson.snaps;

import java.lang.reflect.Type;

import nl.ansuz.android.glitch.api.response.snaps.GetForLocationResponse;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

/**
 * GSON deserializer for Glitch Snaps.getForLocation API response.
 * 
 * @author Wijnand
 */
public class GetForLocationDeserializer extends SnapListDeserializer implements
		JsonDeserializer<GetForLocationResponse> {

	@Override
	public GetForLocationResponse deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		
		return deserialize(new GetForLocationResponse(), json, context);
	}

}
