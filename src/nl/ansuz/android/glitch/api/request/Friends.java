package nl.ansuz.android.glitch.api.request;

import java.util.HashMap;

import com.tinyspeck.android.Glitch;
import com.tinyspeck.android.GlitchRequest;

/**
 * Contains all request strings for Friends.
 * 
 * @author Wijnand
 */
public class Friends {

	/**
	 * Simple listing of friends request methods.
	 * 
	 * @author Wijnand
	 */
	public class Method {
		public static final String ADD = "friends.add";
		public static final String LIST = "friends.list";
		public static final String REMOVE = "friends.remove";
	}
	
	/**
	 * Simple listing of friends request parameters.
	 * 
	 * @author Wijnand
	 */
	public class Parameter {
		public static final String TSID = "tsid";
	}
	
	/**
	 * Creates a GlitchRequest object to add a player to your buddy list.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!friends.add
	 * 
	 * @param glitch Reference to the instance of the Glitch API object.
	 * @param tsid TSID of the player to add.
	 */
	public static GlitchRequest createAddRequest(Glitch glitch, String tsid) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put(Parameter.TSID, tsid);

		return new GlitchRequest(Method.ADD, params, glitch);
	}
	
	/**
	 * Creates a GlitchRequest object to remove a player from your buddy list.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!friends.remove
	 * 
	 * @param glitch Reference to the instance of the Glitch API object.
	 * @param tsid TSID of the player to remove.
	 */
	public static GlitchRequest createRemoveRequest(Glitch glitch, String tsid) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put(Parameter.TSID, tsid);

		return new GlitchRequest(Method.REMOVE, params, glitch);
	}
	
	/**
	 * Creates a GlitchRequest object to list all your friends.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!friends.list
	 * 
	 * @param glitch Reference to the instance of the Glitch API object.
	 */
	public static GlitchRequest createListRequest(Glitch glitch) {
		return new GlitchRequest(Method.LIST, glitch);
	}
	
}
