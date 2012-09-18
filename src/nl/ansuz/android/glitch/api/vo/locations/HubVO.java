package nl.ansuz.android.glitch.api.vo.locations;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a Hub in Glitch.
 * 
 * @author Wijnand
 */
public class HubVO {

	@SerializedName("name")
	public String name;
	
	@SerializedName("id")
	public int id;
	
	/**
	 * CONSTRUCTOR
	 */
	public HubVO() {
		init();
	}

	/**
	 * Initializes this class.
	 */
	private void init() {
		name = "";
		id = -1;
	}
	
}
