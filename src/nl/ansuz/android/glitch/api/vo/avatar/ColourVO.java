package nl.ansuz.android.glitch.api.vo.avatar;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a colour for an item of an Avatar.
 */
public class ColourVO {

	@SerializedName("tintColor")
	public String tintColor;
	
	@SerializedName("brightness")
	public String brightness;
	
	@SerializedName("saturation")
	public String saturation;
	
	@SerializedName("contrast")
	public String contrast;
	
	@SerializedName("tintAmount")
	public String tintAmount;
	
	@SerializedName("alpha")
	public String alpha;
	
}
