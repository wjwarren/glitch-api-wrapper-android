package nl.ansuz.android.glitch.api.response.players;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;

/**
 * Response object for players.info.
 * 
 * @see http://developer.glitch.com/api/explore/#!players.info
 * @author Wijnand
 */
public class InfoResponse extends GlitchResponse {

	@SerializedName("user_name")
	public String userName;
	
	@SerializedName("player_name")
	public String playerName;
	
	@SerializedName("player_tsid")
	public String playerTsid;
	
	@SerializedName("avatar_url")
	public String avatarUrl;
	
	@SerializedName("is_subscriber")
	public boolean isSubscriber;
	
}
