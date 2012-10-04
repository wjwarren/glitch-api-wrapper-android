package nl.ansuz.android.glitch.api.util.gson.skills;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import nl.ansuz.android.glitch.api.response.skills.ListUnlearningResponse;
import nl.ansuz.android.glitch.api.util.gson.GlitchDeserializer;
import nl.ansuz.android.glitch.api.vo.players.SkillVO;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * GSON deserializer for the Glitch skills.listUnlearning API response.<br>
 * <br>
 * Usage:<br>
 * <code>
 * GsonBuilder builder = new GsonBuilder();<br>
 * builder.registerTypeAdapter(ListUnlearningResponse.class, new ListUnlearningDeserializer());<br>
 * Gson gson = builder.create();<br>
 * ListUnlearningResponse info = gson.fromJson(jsonString, ListUnlearningResponse.class);<br>
 * </code>
 * 
 * @author Wijnand
 */
public class ListUnlearningDeserializer extends GlitchDeserializer implements
		JsonDeserializer<ListUnlearningResponse> {

	/**
	 * @see JsonDeserializer(arg0, arg1, arg2)
	 * @see https
	 *      ://sites.google.com/site/gson/gson-user-guide#TOC-Custom-Serialization
	 *      -and-Deserialization
	 */
	@Override
	public ListUnlearningResponse deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {

		ListUnlearningResponse result = new ListUnlearningResponse();
		JsonObject jsonObject = json.getAsJsonObject();

		// Deserialize defaults.
		result = (ListUnlearningResponse)deserializeResponseDefaults(result, jsonObject);

		// Get unlearning list if it is available.
		if (jsonObject.has("unlearning")) {
			JsonElement unlearningElement = jsonObject.get("unlearning");

			if (unlearningElement.isJsonObject()) {
				// Only parse the unlearning object if it is an actual object.
				result.unlearning = new HashMap<String, SkillVO>();

				for (Map.Entry<String, JsonElement> skillElement : unlearningElement
						.getAsJsonObject().entrySet()) {
					result.unlearning.put(
							skillElement.getKey(),
							(SkillVO) context.deserialize(
									skillElement.getValue(), SkillVO.class));
				}
			} else {
				// When an int is returned, just set the unlearning object to
				// null.
				result.unlearning = null;
			}
		}

		return result;
	}

}
