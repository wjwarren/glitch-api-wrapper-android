package nl.ansuz.android.glitch.api.vo.auctions;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of an auction in Glitch.
 * 
 * @author Wijnand
 */
public class AuctionVO {

	@SerializedName("player")
	public PlayerVO player;
	
	@SerializedName("created")
	public int created;
	
	@SerializedName("expires")
	public int expires;
	
	@SerializedName("class_tsid")
	public String classTsid;
	
	@SerializedName("category")
	public String category;
	
	@SerializedName("count")
	public int count;
	
	@SerializedName("cost")
	public double cost;
	
	@SerializedName("cost_per")
	public double costPerItem;
	
	@SerializedName("url")
	public String url;
	
	@SerializedName("item_def")
	public ItemDefinition item_def;
	
}
