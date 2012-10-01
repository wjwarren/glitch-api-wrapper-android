package nl.ansuz.android.glitch.api.vo.snaps;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a Snap owner's avatar.
 * 
 * TODO: Besides the SerializedName this is the same as players.AvatarVO.
 * @author Wijnand
 */
public class SnapOwnerAvatarVO {

	@SerializedName("singles_172")
	public String image172;
	
	@SerializedName("singles_100")
	public String image100;
	
	@SerializedName("singles_50")
	public String image50;
	
}
