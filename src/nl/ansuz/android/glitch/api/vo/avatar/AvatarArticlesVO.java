package nl.ansuz.android.glitch.api.vo.avatar;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a list of articles an Avatar is made of.
 * 
 * @author Wijnand
 */
public class AvatarArticlesVO {

	@SerializedName("hat")
	public AvatarItem hat;
	
	@SerializedName("coat")
	public AvatarItem coat;
	
	@SerializedName("shirt")
	public AvatarItem shirt;
	
	@SerializedName("pants")
	public AvatarItem pants;
	
	@SerializedName("dress")
	public AvatarItem dress;
	
	@SerializedName("skirt")
	public AvatarItem skirt;
	
	@SerializedName("shoes")
	public AvatarItem shoes;
	
	@SerializedName("eyes")
	public AvatarItem eyes;
	
	@SerializedName("ears")
	public AvatarItem ears;
	
	@SerializedName("nose")
	public AvatarItem nose;
	
	@SerializedName("mouth")
	public AvatarItem mouth;
	
	@SerializedName("hair")
	public AvatarItem hair;
	
}
