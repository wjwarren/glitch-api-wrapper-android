package nl.ansuz.android.glitch.api.vo.auctions;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a player in an auction.
 * 
 * @author Wijnand
 */
public class PlayerVO {

	@SerializedName("tsid")
	public String tsid;
	
	@SerializedName("name")
	public String name;
	
}
