package nl.ansuz.android.glitch.api.vo.locations;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a hub exchange point.
 * 
 * @author Wijnand
 */
public class ExchangeVO {

	@SerializedName("x")
	public int x;
	
	@SerializedName("y")
	public int y;
	
	@SerializedName("arrow")
	public int arrow;
	
	@SerializedName("label")
	public int label;
	
	@SerializedName("hub_id")
	public String hub_id;
	
	@SerializedName("tsid")
	public String tsid;
	
	@SerializedName("hub")
	public String hub;
	
	// Beware! Sometimes this property contains a "#", sometimes it doesn't!
	@SerializedName("color")
	public String color;
	
}
