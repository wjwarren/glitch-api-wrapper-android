package nl.ansuz.android.glitch.api.response.achievements;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.achievements.AchievementVO;

/**
 * Response object for achievements.getInfo.
 * 
 * @see http://developer.glitch.com/api/explore/#!achievements.getInfo
 * @author Wijnand
 */
public class GetInfoResponse extends GlitchResponse {

	@SerializedName("achievement")
	public AchievementVO achievement;
	
	@SerializedName("series")
	public String[] series;
	
}
