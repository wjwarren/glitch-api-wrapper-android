package nl.ansuz.android.glitch.api.vo.economy;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a sale in Glitch.
 * 
 * @author Wijnand
 */
public class SaleVO {

	@SerializedName("id")
	public String id;
	
	@SerializedName("date_sold")
	public int dateSold;
	
	@SerializedName("source")
	public String source;
	
	@SerializedName("item_class_tsid")
	public String itemClassTsid;
	
	@SerializedName("qty")
	public int quantity;
	
	@SerializedName("total_price")
	public double totalPrice;
}
