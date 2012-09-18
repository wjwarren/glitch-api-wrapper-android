package nl.ansuz.android.glitch.api.response.locations;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.locations.HubVO;
import nl.ansuz.android.glitch.api.vo.locations.MoteVO;
import nl.ansuz.android.glitch.api.vo.locations.StreetConnectionVO;
import nl.ansuz.android.glitch.api.vo.locations.StreetImageVO;

/**
 * Response object for locations.streetInfo.
 * 
 * @see http://developer.glitch.com/api/explore/#!locations.streetInfo
 * @author Wijnand
 */
public class StreetInfoResponse extends GlitchResponse {

	@SerializedName("tsid")
	public String tsid;
	
	@SerializedName("name")
	public String name;
	
	@SerializedName("hub")
	public HubVO hub;
	
	@SerializedName("mote")
	public MoteVO mote;
	
	@SerializedName("active_project")
	public boolean activeProject;
	
	// TODO: Figure out what could be in this Object...
	@SerializedName("features")
	public Object features;
	
	// Uses the street TSID as key.
	@SerializedName("connections")
	public Map<String, StreetConnectionVO> connections;
	
	@SerializedName("image")
	public StreetImageVO image;
	
}
