package nl.ansuz.android.glitch.api.vo.auth;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of the authentication scope.
 * 
 * @author Wijnand
 */
public class ScopeVO {

	@SerializedName("write")
	private int write;
	
	@SerializedName("read")
	private int read;
	
	@SerializedName("identity")
	private int identity;
	
	/**
	 * Whether or not we have "write" rights.
	 */
	public boolean getWrite() {
		return write > 0;
	}
	
	/**
	 * Whether or not we have "read" rights.
	 */
	public boolean getRead() {
		return read > 0;
	}
	
	/**
	 * Whether or not we have "identity" rights.
	 */
	public boolean getIdentity() {
		return identity > 0;
	}
	
}
