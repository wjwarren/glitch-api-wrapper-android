package nl.ansuz.android.glitch.api.vo.players;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a pol (wtf is a pol??) in Glitch.
 * 
 * @author Wijnand
 */
public class PolVO {

	@SerializedName("tsid")
	public String tsid;
	
	@SerializedName("name")
	public String name;
	
	@SerializedName("street_tsid")
	public String streetTsid;
	
	@SerializedName("street_hub_id")
	public int streetHubId;
	
	@SerializedName("street_name")
	public String streetName;
	
}
