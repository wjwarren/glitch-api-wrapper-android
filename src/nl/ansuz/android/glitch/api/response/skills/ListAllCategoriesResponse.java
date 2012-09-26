package nl.ansuz.android.glitch.api.response.skills;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;

/**
 * Response object for skills.listAllCategories.
 * 
 * @see http://developer.glitch.com/api/explore/#!skills.listAllCategories
 * @author Wijnand
 */
public class ListAllCategoriesResponse extends GlitchResponse {

	// TODO: What does the key represent?
	@SerializedName("categories")
	public Map<String, String> categories;
	
}
