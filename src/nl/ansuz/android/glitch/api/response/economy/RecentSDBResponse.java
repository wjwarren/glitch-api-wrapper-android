package nl.ansuz.android.glitch.api.response.economy;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.PagedResponse;
import nl.ansuz.android.glitch.api.vo.economy.StorageDisplayBoxVO;

/**
 * Response object for economy.recentSDBs.
 * The items Map has the SDB TSID as key.
 * 
 * @see http://developer.glitch.com/api/explore/#!economy.recentSDBs
 * @author Wijnand
 */
public class RecentSDBResponse extends PagedResponse {

	@SerializedName("items")
	public Map<String, StorageDisplayBoxVO> items;
	
}
