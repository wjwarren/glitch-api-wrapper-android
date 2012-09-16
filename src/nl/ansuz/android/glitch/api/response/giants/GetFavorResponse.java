package nl.ansuz.android.glitch.api.response.giants;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.giants.DetailedGiantListVO;
import nl.ansuz.android.glitch.api.vo.giants.MetaVO;

/**
 * Response object for giants.getFavor.
 * 
 * @see http://developer.glitch.com/api/explore/#!giants.getFavor
 * @author Wijnand
 */
public class GetFavorResponse extends GlitchResponse {

	@SerializedName("meta")
	public MetaVO meta;
	
	@SerializedName("giants")
	public DetailedGiantListVO giants;
	
}
