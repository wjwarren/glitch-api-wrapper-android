package nl.ansuz.android.glitch.api.response.snaps;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.snaps.AvatarImagesVO;
import nl.ansuz.android.glitch.api.vo.snaps.CommentVO;
import nl.ansuz.android.glitch.api.vo.snaps.FilesVO;

/**
 * Response object for snaps.comment.
 * 
 * @see http://developer.glitch.com/api/explore/#!snaps.detail
 * @author Wijnand
 */
public class DetailBaseResponse extends GlitchResponse {

	@SerializedName("id")
	public String id;
	
	@SerializedName("caption")
	public String caption;
	
	@SerializedName("who_tsid")
	public String ownerTsid;
	
	@SerializedName("who_name")
	public String ownerName;
	
	@SerializedName("who_urls")
	public AvatarImagesVO ownerAvatarUrls;
	
	@SerializedName("date_create")
	public String dateCreated;
	
	@SerializedName("views")
	public String views;
	
	@SerializedName("location_name")
	public String locationName;
	
	@SerializedName("location_hub")
	public String locationHub;
	
	@SerializedName("location_tsid")
	public String locationTsid;
	
	@SerializedName("short_url")
	public String shortUrl;
	
	@SerializedName("images")
	public FilesVO images;
	
	// TODO: Custom Deserializer!
	@SerializedName("comments")
	public CommentVO[] comments;
	
}
