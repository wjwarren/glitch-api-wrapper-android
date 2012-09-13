package nl.ansuz.android.glitch.api.response;

import com.google.gson.annotations.SerializedName;

public class GlitchResponse {

	@SerializedName("ok")
	private int ok;
	
	@SerializedName("error")
	public String error;
	
	/**
	 * Whether or not the request was successful.
	 * If not, the error String is set with an error message.
	 */
	public boolean getSuccess() {
		return ok > 0;
	}
	
}
