package nl.ansuz.android.glitch.api.vo.players;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a player's Clothing.
 * 
 * @author Wijnand
 */
public class ClothingListVO {

	@SerializedName("hat")
	public ClothingItemVO hat;
	
	@SerializedName("coat")
	public ClothingItemVO coat;
	
	@SerializedName("shirt")
	public ClothingItemVO shirt;
	
	@SerializedName("pants")
	public ClothingItemVO pants;
	
	@SerializedName("dress")
	public ClothingItemVO dress;
	
	@SerializedName("skirt")
	public ClothingItemVO skirt;
	
	@SerializedName("shoes")
	public ClothingItemVO shoes;
	
}
