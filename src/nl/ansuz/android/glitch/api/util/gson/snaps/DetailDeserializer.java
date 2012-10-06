package nl.ansuz.android.glitch.api.util.gson.snaps;

import java.lang.reflect.Type;

import nl.ansuz.android.glitch.api.response.snaps.DetailResponse;
import nl.ansuz.android.glitch.api.response.snaps.base.DetailBaseResponse;
import nl.ansuz.android.glitch.api.util.gson.GlitchDeserializer;
import nl.ansuz.android.glitch.api.vo.snaps.CommentVO;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * GSON deserializer for Glitch Snaps.detail API response.
 * 
 * @author Wijnand
 */
public class DetailDeserializer extends GlitchDeserializer implements JsonDeserializer<DetailResponse> {

	/**
	 * @see super.deserialize(json, typeOfT, context)
	 */
	@Override
	public DetailResponse deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {

		JsonObject jsonObject = json.getAsJsonObject();
		
		// Deserialize base info.
		DetailResponse details = new DetailResponse();
		DetailBaseResponse detailsBase = (DetailBaseResponse)context.deserialize(json, DetailBaseResponse.class);
		details = copyFromTo(detailsBase, details);
		
		// Deserialize comments
		if(jsonObject.has("comments")) {
			JsonElement commentsElement = jsonObject.get("comments");
			
			if(commentsElement.isJsonArray()) {
				// Only parse comments when it is an array.
				JsonArray commentList = commentsElement.getAsJsonArray();
				details.comments = new CommentVO[commentList.size()];
				
				for(int i = 0; i < commentList.size(); i++) {
					details.comments[i] = (CommentVO)context.deserialize(commentList.get(i), CommentVO.class);
				}
			} else {
				details.comments = null;
			}
		}
		
		return details;
	}

}
