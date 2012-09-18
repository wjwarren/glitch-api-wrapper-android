package nl.ansuz.android.glitch.api.response.locations;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.locations.HubVO;

/**
 * Response object for locations.getHubs.
 * The hubs Map contains the hub id as key.
 * 
 * @see http://developer.glitch.com/api/explore/#!locations.getHubs
 * @author Wijnand
 */
public class GetHubsResponse extends GlitchResponse {

	@SerializedName("hubs")
	public Map<String, HubVO> hubs;
	
}
