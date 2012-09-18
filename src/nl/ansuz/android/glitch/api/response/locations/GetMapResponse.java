package nl.ansuz.android.glitch.api.response.locations;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.locations.ExchangeVO;
import nl.ansuz.android.glitch.api.vo.locations.StreetVO;

/**
 * Response object for locations.getMap.
 * 
 * @see http://developer.glitch.com/api/explore/#!locations.getMap
 * @author Wijnand
 */
public class GetMapResponse extends GlitchResponse {

	@SerializedName("bg_image")
	public String backgroundImage;
	
	// Using street TSID as key.
	@SerializedName("streets")
	public Map<String, StreetVO> streets;
	
	@SerializedName("exchanges")
	public ExchangeVO[] exchanges;
	
}
