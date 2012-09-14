package nl.ansuz.android.glitch.api.response.achievements;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.achievements.CategoryVO;

/**
 * Response object for achievements.getInfo.
 * 
 * @see http://developer.glitch.com/api/explore/#!achievements.listAllCategories
 * @author Wijnand
 */
public class ListAllCategoriesResponse extends GlitchResponse {

	@SerializedName("categories")
	public Map<String, CategoryVO> categories;
	
}
