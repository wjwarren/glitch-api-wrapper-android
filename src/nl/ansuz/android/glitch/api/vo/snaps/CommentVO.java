package nl.ansuz.android.glitch.api.vo.snaps;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a comment on a Snap.
 * 
 * @author Wijnand
 */
public class CommentVO {

	@SerializedName("who_tsid")
	public String ownerTsid;
	
	@SerializedName("who_name")
	public String ownerName;
	
	@SerializedName("who_urls")
	public AvatarImagesVO ownerAvatarUrls;
	
	@SerializedName("date_create")
	public String dateCreated;
	
	@SerializedName("text")
	public String text;
	
}
