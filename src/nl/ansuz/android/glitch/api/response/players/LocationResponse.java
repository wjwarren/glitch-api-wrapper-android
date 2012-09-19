package nl.ansuz.android.glitch.api.response.players;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.players.LocationVO;
import nl.ansuz.android.glitch.api.vo.players.PolVO;

/**
 * Response object for players.location.
 * 
 * @see http://developer.glitch.com/api/explore/#!players.location
 * @author Wijnand
 */
public class LocationResponse extends GlitchResponse {

	@SerializedName("is_online")
	public boolean is_online;
	
	@SerializedName("last_online")
	public int last_online;
	
	@SerializedName("location")
	public LocationVO location;
	
	@SerializedName("pol")
	public PolVO pol;
	
}
