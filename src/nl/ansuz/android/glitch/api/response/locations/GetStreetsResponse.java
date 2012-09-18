package nl.ansuz.android.glitch.api.response.locations;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.locations.StreetVO;

/**
 * Response object for locations.getStreets.
 * 
 * @see http://developer.glitch.com/api/explore/#!locations.getStreets
 * @author Wijnand
 */
public class GetStreetsResponse extends GlitchResponse {

	@SerializedName("hub_id")
	public String hub_id;
	
	@SerializedName("name")
	public String name;
	
	// Using street TSID as key.
	@SerializedName("streets")
	public Map<String, StreetVO> streets;
}
