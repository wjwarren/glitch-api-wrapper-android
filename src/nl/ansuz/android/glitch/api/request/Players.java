package nl.ansuz.android.glitch.api.request;

import java.util.HashMap;

import com.tinyspeck.android.Glitch;
import com.tinyspeck.android.GlitchRequest;

/**
 * Players request helper that contains all methods and parameters.
 * 
 * Provides a couple of static helper methods to generate a GlitchRequest for a
 * particular method call.
 * 
 * @author Wijnand
 */
public class Players {

	/**
	 * Simple listing of Players request methods.
	 * 
	 * @author Wijnand
	 */
	public class Method {
		public static final String FULL_INFO = "players.fullInfo";
		public static final String GET_ANIMATIONS = "players.getAnimations";
		public static final String GET_CLOTHING = "players.getClothing";
		public static final String INFO = "players.info";
		public static final String INVENTORY = "players.inventory";
		public static final String LOCATION = "players.location";
		public static final String STATS = "players.stats";
	}

	/**
	 * Simple listing of Players request parameters.
	 * 
	 * @author Wijnand
	 */
	public class Parameter {
		public static final String PLAYER_TSID = "player_tsid";
		public static final String VIEWER_TSID = "viewer_tsid";
		public static final String DEFS = "defs";
	}

	/**
	 * Generic Player request generator.
	 * 
	 * @param glitch
	 *            Reference to the instance of the Glitch API object.
	 * @param playerTsid
	 *            The TSID of the player to get info about.
	 * @param method
	 *            The Players method to invoke.
	 */
	private static GlitchRequest createGenericPlayerRequest(Glitch glitch,
			String playerTsid, String method) {
		HashMap<String, String> params = new HashMap<String, String>();
		if (playerTsid != null) {
			params.put(Parameter.PLAYER_TSID, playerTsid);
		}

		return new GlitchRequest(method, params, glitch);
	}

	/**
	 * Creates a GlitchRequest object to retrieve lots of info about a player.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!players.fullInfo
	 * 
	 * @param glitch
	 *            Reference to the instance of the Glitch API object.
	 * @param playerTsid
	 *            The TSID of the player to get info about.
	 * @param viewerTsid
	 *            (optional) The TSID of a viewing player (to get correct
	 *            contact status etc). If authed, this defaults to you
	 */
	public static GlitchRequest createFullInfoRequest(Glitch glitch,
			String playerTsid, String viewerTsid) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put(Parameter.PLAYER_TSID, playerTsid);
		if (viewerTsid != null) {
			params.put(Parameter.VIEWER_TSID, viewerTsid);
		}

		return new GlitchRequest(Method.FULL_INFO, params, glitch);
	}

	/**
	 * @see createGetFullInfoRequest(Glitch glitch, String playerTsid, String
	 *      viewerTsid)
	 */
	public static GlitchRequest createFullInfoRequest(Glitch glitch,
			String playerTsid) {
		return createFullInfoRequest(glitch, playerTsid, null);
	}

	/**
	 * Creates a GlitchRequest object to retrieve information for displaying
	 * avatar animations.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!players.getAnimations
	 * @see createGenericPlayerRequest(Glitch glitch, String playerTsid, String
	 *      method)
	 */
	public static GlitchRequest createGetAnimationsRequest(Glitch glitch,
			String playerTsid) {
		return createGenericPlayerRequest(glitch, playerTsid,
				Method.GET_ANIMATIONS);
	}

	/**
	 * Creates a GlitchRequest object to retrieve the player's current outfit.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!players.getClothing
	 * @see createGenericPlayerRequest(Glitch glitch, String playerTsid, String
	 *      method)
	 */
	public static GlitchRequest createGetClothingRequest(Glitch glitch,
			String playerTsid) {
		return createGenericPlayerRequest(glitch, playerTsid,
				Method.GET_CLOTHING);
	}

	/**
	 * Creates a GlitchRequest object to retrieve info about the authenticated
	 * player. This data is pretty cachable.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!players.info
	 * @see createGenericPlayerRequest(Glitch glitch, String playerTsid, String
	 *      method)
	 */
	public static GlitchRequest createInfoRequest(Glitch glitch,
			String playerTsid) {
		return createGenericPlayerRequest(glitch, playerTsid, Method.INFO);
	}

	/**
	 * Creates a GlitchRequest object to retrieve the inventory for the
	 * authenticated player.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!players.info
	 * @see createGenericPlayerRequest(Glitch glitch, String playerTsid, String
	 *      method)
	 */
	public static GlitchRequest createInventoryRequest(Glitch glitch,
			boolean getDefinitions) {
		HashMap<String, String> params = new HashMap<String, String>();
		if (getDefinitions) {
			params.put(Parameter.DEFS, "1");
		}

		return new GlitchRequest(Method.INVENTORY, params, glitch);
	}

	/**
	 * Creates a GlitchRequest object to retrieve the current location of a
	 * player (and also pointers to their house).
	 * 
	 * @see http://developer.glitch.com/api/explore/#!players.location
	 * @see createGenericPlayerRequest(Glitch glitch, String playerTsid, String
	 *      method)
	 */
	public static GlitchRequest createLocationRequest(Glitch glitch,
			String playerTsid) {
		return createGenericPlayerRequest(glitch, playerTsid, Method.LOCATION);
	}

	/**
	 * Creates a GlitchRequest object to retrieve various stats about the
	 * authenticated player, including metabolics and currants. This data is not
	 * very cachable.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!players.stats
	 * @see createGenericPlayerRequest(Glitch glitch, String playerTsid, String
	 *      method)
	 */
	public static GlitchRequest createStatsRequest(Glitch glitch) {
		return createGenericPlayerRequest(glitch, null, Method.STATS);
	}

}
