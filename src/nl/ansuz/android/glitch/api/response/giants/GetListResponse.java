package nl.ansuz.android.glitch.api.response.giants;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.giants.SimpleGiantListVO;

/**
 * Response object for giants.getFavor.
 * 
 * @see http://developer.glitch.com/api/explore/#!giants.getFavor
 * @author Wijnand
 */
public class GetListResponse extends GlitchResponse {

	@SerializedName("giants")
	public SimpleGiantListVO giants;
	
}
