package nl.ansuz.android.glitch.api.request;

import com.tinyspeck.android.Glitch;
import com.tinyspeck.android.GlitchRequest;

/**
 * Contains all request strings for the Avatar.
 * 
 * @author Wijnand
 */
public class Avatar {

	/**
	 * Simple listing of avatar request methods.
	 * 
	 * @author Wijnand
	 */
	public class Method {
		public static final String GET_DETAILS = "avatar.getDetails";
	}
	
	/**
	 * Creates a GlitchRequest object to use to retreive the user's avatar details.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!avatar.getDetails
	 * 
	 * @param glitch
	 *            Reference to the instance of the Glitch API object.
	 */
	public static GlitchRequest getDetailsRequest(Glitch glitch) {
		return new GlitchRequest(Method.GET_DETAILS, glitch);
	}
	
}
