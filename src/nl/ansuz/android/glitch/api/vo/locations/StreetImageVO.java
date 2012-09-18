package nl.ansuz.android.glitch.api.vo.locations;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a Street image in Glitch.
 * 
 * @author Wijnand
 */
public class StreetImageVO {

	@SerializedName("url")
	public String url;
	
	@SerializedName("w")
	public int width;
	
	@SerializedName("h")
	public int height;
	
}
