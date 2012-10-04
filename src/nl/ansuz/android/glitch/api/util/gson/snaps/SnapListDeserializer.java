package nl.ansuz.android.glitch.api.util.gson.snaps;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.response.PagedResponse;
import nl.ansuz.android.glitch.api.response.snaps.base.SnapListBaseResponse;
import nl.ansuz.android.glitch.api.util.gson.GlitchDeserializer;
import nl.ansuz.android.glitch.api.vo.snaps.SnapVO;

/**
 * GSON deserializer base for Snaps API responses that contain a list of snaps.
 *  
 * @author Wijnand
 */
public class SnapListDeserializer extends GlitchDeserializer {

	protected SnapListBaseResponse deserialize(SnapListBaseResponse target, JsonElement json, JsonDeserializationContext context) throws JsonParseException {
		
		JsonObject jsonObject = json.getAsJsonObject();
		
		// Deserialize defaults.
		GlitchResponse defaults = context.deserialize(json, GlitchResponse.class);
		target = copyDefaults(defaults, target);
		
		// Deserialize pagination.
		if(jsonObject.has("pagination")) {
			JsonElement paginationElement = jsonObject.get("pagination");
			
			PagedResponse pagination = context.deserialize(paginationElement, PagedResponse.class);
			
			// Copying manually to avoid overwriting defaults.
			target.page = pagination.page;
			target.perPage = pagination.perPage;
			target.pages = pagination.pages;
			target.total = pagination.total;
		}
		
		// Deserialize snaps list.
		if(jsonObject.has("photos")) {
			JsonElement photosElement = jsonObject.get("photos");
			
			if(photosElement.isJsonArray()) {
				// Only parse photos when it is an array.
				JsonArray photoList = photosElement.getAsJsonArray();
				target.snaps = new SnapVO[photoList.size()];
				
				for(int i = 0; i < photoList.size(); i++) {
					target.snaps[i] = (SnapVO)context.deserialize(photoList.get(i), SnapVO.class);
				}
			} else {
				target.snaps = null;
			}
		}
		
		return target;
	}

	/**
	 * Copies the values from the base to the actual GetForLocationResponse.
	 * 
	 * @param from The base object to copy the values from.
	 * @param to The actual GetForLocationResponse to copy the values to.
	 */
	protected SnapListBaseResponse copyDefaults(GlitchResponse from, SnapListBaseResponse to) {
		return (SnapListBaseResponse)copyFromTo(from, to);
	}
	
}
