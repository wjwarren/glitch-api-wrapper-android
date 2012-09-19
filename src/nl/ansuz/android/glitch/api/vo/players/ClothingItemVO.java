package nl.ansuz.android.glitch.api.vo.players;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a single Clothing item in Glitch.
 * 
 * @author Wijnand
 */
public class ClothingItemVO {

	@SerializedName("id")
	public int id;
	
	@SerializedName("name")
	public String name;
	
	@SerializedName("image")
	public String imageMedium;
	
	@SerializedName("image_small")
	public String imageSmall;
	
	@SerializedName("image_large")
	public String imageLarge;
	
	@SerializedName("url")
	public String url;
	
	@SerializedName("sub_only")
	public boolean subscribersOnly;
	
	@SerializedName("credits")
	public int credits;
	
}
