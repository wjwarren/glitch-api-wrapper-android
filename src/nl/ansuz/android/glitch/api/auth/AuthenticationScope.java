package nl.ansuz.android.glitch.api.auth;

/**
 * Simple "enumeration" of Glitch Authentication Scopes.<br>
 * <br>
 * The lowest scope is identity which is used for simple login representation. 
 * Beyond that is the read scope, which allows you to fetch state information about the player. 
 * The final regular scope is write, which allows you to make modifications to a player. 
 * The read scope implicitly includes the identity scope, while the write scope implicitly includes read. 
 * Asking for write is the same as asking for identity,read,write.
 * 
 * @see http://developer.glitch.com/docs/scopes/
 * @author Wijnand
 */
public class AuthenticationScope {

	public final static String IDENTITY	= "identity";
	public final static String READ		= "read";
	public final static String WRITE	= "write";
	
}
