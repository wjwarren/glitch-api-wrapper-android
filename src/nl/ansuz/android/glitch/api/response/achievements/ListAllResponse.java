package nl.ansuz.android.glitch.api.response.achievements;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.achievements.AchievementVO;

/**
 * Response object for achievements.getInfo.
 * 
 * @see http://developer.glitch.com/api/explore/#!achievements.listAll
 * @author Wijnand
 */
public class ListAllResponse extends GlitchResponse {

	@SerializedName("pages")
	public int pages;
	
	@SerializedName("per_page")
	public int per_page;
	
	@SerializedName("page")
	public int page;
	
	@SerializedName("total")
	public int total;
	
	@SerializedName("items")
	public Map<String, AchievementVO> items;
	
}
