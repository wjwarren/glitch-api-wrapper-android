package nl.ansuz.android.glitch.api.request;

import java.util.HashMap;

import com.tinyspeck.android.Glitch;
import com.tinyspeck.android.GlitchRequest;

/**
 * Locations request helper that contains all methods and parameters.
 * 
 * Provides a couple of static helper methods to generate a GlitchRequest for a 
 * particular method call.
 * 
 * @author Wijnand
 */
public class Locations {

	/**
	 * Simple listing of locations request methods.
	 * 
	 * @author Wijnand
	 */
	public class Method {
		public static final String GET_HUBS = "locations.getHubs";
		public static final String GET_MAP = "locations.getMap";
		public static final String GET_STREETS = "locations.getStreets";
		public static final String STREET_INFO = "locations.streetInfo";
	}
	
	/**
	 * Simple listing of locations request parameters.
	 * 
	 * @author Wijnand
	 */
	public class Parameter {
		public static final String HUB_ID = "hub_id";
		public static final String STREET_TSID = "street_tsid";
	}
	
	/**
	 * Creates a GlitchRequest object to retrieve a list of hubs.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!locations.getHubs
	 * 
	 * @param glitch Reference to the instance of the Glitch API object.
	 */
	public static GlitchRequest createGetHubsRequest(Glitch glitch) {
		return new GlitchRequest(Method.GET_HUBS, glitch);
	}
	
	/**
	 * Creates a GlitchRequest object to retrieve details to build a hub map.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!locations.getMap
	 * 
	 * @param glitch Reference to the instance of the Glitch API object.
	 * @param hubId ID of a hub.
	 */
	public static GlitchRequest createGetMapRequest(Glitch glitch, String hubId) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put(Parameter.HUB_ID, hubId);
		
		return new GlitchRequest(Method.GET_MAP, params, glitch);
	}
	
	/**
	 * Creates a GlitchRequest object to retrieve a list of streets in a hub.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!locations.getStreets
	 * 
	 * @param glitch Reference to the instance of the Glitch API object.
	 * @param hubId ID of a hub.
	 */
	public static GlitchRequest createGetStreetsRequest(Glitch glitch, String hubId) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put(Parameter.HUB_ID, hubId);
		
		return new GlitchRequest(Method.GET_STREETS, params, glitch);
	}
	
	/**
	 * Creates a GlitchRequest object to retrieve info about a single street.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!locations.streetInfo
	 * 
	 * @param glitch Reference to the instance of the Glitch API object.
	 * @param hubId TSID of a street.
	 */
	public static GlitchRequest createStreetInfoRequest(Glitch glitch, String streetTsid) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put(Parameter.STREET_TSID, streetTsid);
		
		return new GlitchRequest(Method.STREET_INFO, params, glitch);
	}
	
}
