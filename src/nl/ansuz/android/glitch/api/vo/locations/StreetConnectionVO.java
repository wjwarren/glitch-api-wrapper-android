package nl.ansuz.android.glitch.api.vo.locations;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a Street connection in Glitch.
 * 
 * @author Wijnand
 */
public class StreetConnectionVO {

	public String streetTsid;
	
	@SerializedName("name")
	public String name;
	
	@SerializedName("hub")
	public HubVO hub;
	
	@SerializedName("mote")
	public MoteVO mote;
	
}
