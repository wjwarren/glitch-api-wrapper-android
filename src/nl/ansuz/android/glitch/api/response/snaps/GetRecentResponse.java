package nl.ansuz.android.glitch.api.response.snaps;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.PagedResponse;
import nl.ansuz.android.glitch.api.vo.snaps.SnapVO;

/**
 * Response object for snaps.getRecent.
 * 
 * @see http://developer.glitch.com/api/explore/#!snaps.getRecent
 * @author Wijnand
 */
public class GetRecentResponse extends PagedResponse {

	// TODO: Create custom Deserializer to deal with pagination.
	
	@SerializedName("photos")
	public SnapVO[] snaps;
	
}
