package nl.ansuz.android.glitch.api.vo.snaps;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a Snap in Glitch.
 * 
 * @author Wijnand
 */
public class SnapVO {

	@SerializedName("id")
	public String id;
	
	@SerializedName("secret")
	public String secret;
	
	@SerializedName("shortlink")
	public String shortlink;
	
	@SerializedName("player_id")
	public String playerId;
	
	@SerializedName("player_tsid")
	public String playerTsid;
	
	@SerializedName("location_tsid")
	public String locationTsid;
	
	@SerializedName("location_x")
	public String locationX;
	
	@SerializedName("location_y")
	public String locationY;
	
	@SerializedName("date_create")
	public int creationDate;
	
	@SerializedName("caption")
	public String caption;
	
	@SerializedName("views")
	public String views;
	
	@SerializedName("count_likes")
	public String likeCount;
	
	@SerializedName("orig_h")
	public String originalHeight;
	
	@SerializedName("orig_w")
	public String originalWidth;
	
	@SerializedName("filter")
	public String filter;
	
	@SerializedName("is_processed")
	private String isProcessed;
	
	@SerializedName("is_published")
	private String isPublished;
	
	@SerializedName("posted_status")
	public String postedStatus;
	
	@SerializedName("posted_date")
	public String postedDate;
	
	@SerializedName("deleted")
	private String isDeleted;
	
	@SerializedName("date_deleted")
	public String date_deleted;
	
	@SerializedName("is_ok")
	private String isOk;
	
	@SerializedName("paths")
	public FilesVO paths;
	
	@SerializedName("urls")
	public FilesVO urls;
	
	@SerializedName("files")
	public FilesVO files;

	/**
	 * Whether or not this Snap has been processed.
	 */
	public boolean getIsProcessed() {
		return Integer.parseInt(isProcessed) > 0;
	}

	/**
	 * Whether or not this Snap is published
	 */
	public boolean getIsPublished() {
		return Integer.parseInt(isPublished) > 0;
	}

	/**
	 * Whether or not this Snap has been deleted.
	 */
	public boolean getIsDeleted() {
		return Integer.parseInt(isDeleted) > 0;
	}

	/**
	 * Whether or not this Snap is OK.
	 */
	public boolean getIsOk() {
		return Integer.parseInt(isOk) > 0;
	}
	
}
