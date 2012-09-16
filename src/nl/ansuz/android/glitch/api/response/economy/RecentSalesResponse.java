package nl.ansuz.android.glitch.api.response.economy;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.PagedResponse;
import nl.ansuz.android.glitch.api.vo.economy.SaleVO;

/**
 * Response object for economy.recentSales.
 * The items Map has the sale id as key.
 * 
 * @see http://developer.glitch.com/api/explore/#!economy.recentSales
 * @author Wijnand
 */
public class RecentSalesResponse extends PagedResponse {

	@SerializedName("items")
	public Map<String, SaleVO> items;
	
}
