package nl.ansuz.android.glitch.api.response;

import com.google.gson.annotations.SerializedName;

public class GlitchResponse {

	@SerializedName("ok")
	public boolean success;
	
	@SerializedName("error")
	public String error;
	
}
