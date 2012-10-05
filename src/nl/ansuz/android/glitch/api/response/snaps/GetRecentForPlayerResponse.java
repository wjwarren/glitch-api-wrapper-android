package nl.ansuz.android.glitch.api.response.snaps;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.snaps.SnapVO;

/**
 * Response object for snaps.getRecentForPlayer.
 * 
 * Note: Deserialize using the GetRecentForPlayerDeserializer!
 * 
 * @see http://developer.glitch.com/api/explore/#!snaps.getRecentForPlayer
 * @author Wijnand
 */
public class GetRecentForPlayerResponse extends GlitchResponse {

	@SerializedName("photos")
	public SnapVO[] snaps;
	
}
