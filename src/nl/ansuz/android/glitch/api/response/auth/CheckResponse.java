package nl.ansuz.android.glitch.api.response.auth;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.auth.ScopeVO;

/**
 * Response object for auth.check.
 * 
 * @see http://developer.glitch.com/api/explore/#!auth.check
 * @author Wijnand
 */
public class CheckResponse extends GlitchResponse {

	@SerializedName("player_tsid")
	public String playerTsid;
	
	@SerializedName("player_name")
	public String playerName;
	
	@SerializedName("scope")
	public ScopeVO scope;
	
}
