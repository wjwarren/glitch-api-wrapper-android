package nl.ansuz.android.glitch.api.response.auctions;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.PagedResponse;
import nl.ansuz.android.glitch.api.vo.auctions.AuctionVO;

/**
 * Response object for auctions.list.
 * The key in the auctions Map is the auction id.
 * 
 * @see http://developer.glitch.com/api/explore/#!auctions.list
 * @author Wijnand
 */
public class ListResponse extends PagedResponse {

	@SerializedName("items")
	public Map<String, AuctionVO> auctions;
	
}
