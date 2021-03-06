package nl.ansuz.android.glitch.api.response.achievements;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.PagedResponse;
import nl.ansuz.android.glitch.api.vo.achievements.AchievementVO;

/**
 * Response object for achievements.getInfo.
 * 
 * @see http://developer.glitch.com/api/explore/#!achievements.listAll
 * @author Wijnand
 */
public class ListAllResponse extends PagedResponse {

	@SerializedName("items")
	public Map<String, AchievementVO> items;
	
}
