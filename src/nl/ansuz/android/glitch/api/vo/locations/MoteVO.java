package nl.ansuz.android.glitch.api.vo.locations;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a Mote in Glitch.
 * 
 * @author Wijnand
 */
public class MoteVO {

	@SerializedName("name")
	public String name;
	
	@SerializedName("id")
	public int id;
	
	/**
	 * CONSTRUCTOR
	 */
	public MoteVO() {
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
