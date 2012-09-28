package nl.ansuz.android.glitch.api.util.gson;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonObject;

import nl.ansuz.android.glitch.api.response.GlitchResponse;

public class GlitchDeserializer {

	protected final static String OK = "ok";
	protected final static String ERROR = "error";
	protected final static String REQUIRED_SCOPE = "required_scope";
	
	/**
	 * Deserializes the default Glitch API response properties.
	 * 
	 * @param response The response to update the properties for.
	 * @param jsonObject The JSON Object to use for deserialization.
	 */
	protected GlitchResponse deserializeResponseDefaults(GlitchResponse response, JsonObject jsonObject) {
		// Get response status.
		response.ok = jsonObject.getAsJsonPrimitive(OK).getAsInt();

		// Get error message if it is available.
		if (jsonObject.has(ERROR)) {
			response.error = jsonObject.getAsJsonPrimitive(ERROR).getAsString();
		}

		// Get required scope if it is available.
		if (jsonObject.has(REQUIRED_SCOPE)) {
			response.requiredScope = jsonObject.getAsJsonPrimitive(REQUIRED_SCOPE).getAsString();
		}
		
		return response;
	}
	
	/**
	 * Determines whether or not a property name is a default one.
	 * 
	 * @param propertyName The property name to evaluate.
	 */
	protected boolean isDefaultProperty(String propertyName) {
		List<String> defaultProperties = new ArrayList<String>();
		defaultProperties.add(OK);
		defaultProperties.add(ERROR);
		defaultProperties.add(REQUIRED_SCOPE);
		
		return defaultProperties.contains(propertyName);
	}
}
