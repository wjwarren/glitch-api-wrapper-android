package nl.ansuz.android.glitch.api.vo.players;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a location in Glitch.
 * 
 * @author Wijnand
 */
public class LocationVO {

	@SerializedName("name")
	public String name;
	
	@SerializedName("tsid")
	public String tsid;
	
	@SerializedName("is_pol")
	public boolean isPol;
	
}
