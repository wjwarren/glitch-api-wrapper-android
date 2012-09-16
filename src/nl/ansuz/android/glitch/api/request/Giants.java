package nl.ansuz.android.glitch.api.request;

import com.tinyspeck.android.Glitch;
import com.tinyspeck.android.GlitchRequest;

/**
 * Contains all request strings for Giants.
 * 
 * @author Wijnand
 */
public class Giants {

	/**
	 * Simple listing of friends request methods.
	 * 
	 * @author Wijnand
	 */
	public class Method {
		public static final String GET_FAVOR = "giants.getFavor";
		public static final String LIST = "giants.list";
	}
	
	/**
	 * Creates a GlitchRequest object to list your favour with the Giants.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!giants.getFavor
	 * 
	 * @param glitch Reference to the instance of the Glitch API object.
	 */
	public static GlitchRequest createGetFavourRequest(Glitch glitch) {
		return new GlitchRequest(Method.GET_FAVOR, glitch);
	}
	
	/**
	 * Creates a GlitchRequest object to list all Giants.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!giants.list
	 * 
	 * @param glitch Reference to the instance of the Glitch API object.
	 */
	public static GlitchRequest createListRequest(Glitch glitch) {
		return new GlitchRequest(Method.LIST, glitch);
	}
	
}
