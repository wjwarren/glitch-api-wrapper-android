package nl.ansuz.android.glitch.api.response.snaps;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.PagedResponse;
import nl.ansuz.android.glitch.api.vo.snaps.SnapVO;

/**
 * Response object for snaps.getForLocation.
 * 
 * Seems like there is a huge data leak here as there is a ton of player info
 * returned by this API method call, especially in the SnapVO.owner.stats_cache 
 * property.
 * 
 * @see http://developer.glitch.com/api/explore/#!snaps.getForLocation
 * @author Wijnand
 */
public class GetForLocationResponse extends PagedResponse {

	// TODO: Create custom Deserializer to deal with pagination.
	
	@SerializedName("photos")
	public SnapVO[] snaps;
	
}
