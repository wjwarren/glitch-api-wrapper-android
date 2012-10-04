package nl.ansuz.android.glitch.api.response.snaps;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.PagedResponse;
import nl.ansuz.android.glitch.api.vo.snaps.SnapVO;

/**
 * Base class for Snaps API responses that contain a list of snaps.
 * 
 * @author Wijnand
 */
public class SnapListBaseResponse extends PagedResponse {

	@SerializedName("photos")
	public SnapVO[] snaps;
	
}
