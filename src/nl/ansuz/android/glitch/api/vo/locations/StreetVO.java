package nl.ansuz.android.glitch.api.vo.locations;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a Street in Glitch.
 * 
 * @author Wijnand
 */
public class StreetVO {

	@SerializedName("x1")
	public int x1;
	
	@SerializedName("y1")
	public int y1;
	
	@SerializedName("x2")
	public int x2;
	
	@SerializedName("y2")
	public int y2;
	
	@SerializedName("tsid")
	public String tsid;
	
	@SerializedName("name")
	public String name;
	
	/**
	 * CONSTRUCTOR
	 */
	public StreetVO() {
		init();
	}

	/**
	 * Initializes this class.
	 */
	private void init() {
		x1 = -1;
		y1 = -1;
		x2 = -1;
		x2 = -1;
		
		tsid = "";
		name = "";
	}
}
