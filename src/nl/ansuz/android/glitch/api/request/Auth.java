package nl.ansuz.android.glitch.api.request;

import com.tinyspeck.android.Glitch;
import com.tinyspeck.android.GlitchRequest;

/**
 * Contains all request strings for Auth(entication).
 * 
 * @author Wijnand
 */
public class Auth {

	/**
	 * Simple listing of auction request methods.
	 * 
	 * @author Wijnand
	 */
	public class Method {
		public static final String CHECK = "auth.check";
	}
	
	/**
	 * Creates a GlitchRequest object to use to check the authentication scope.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!auth.check
	 * 
	 * @param glitch
	 *            Reference to the instance of the Glitch API object.
	 */
	public static GlitchRequest getCheckRequest(Glitch glitch) {
		return new GlitchRequest(Method.CHECK, glitch);
	}
	
}
