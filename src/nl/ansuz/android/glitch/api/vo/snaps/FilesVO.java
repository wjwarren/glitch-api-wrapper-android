package nl.ansuz.android.glitch.api.vo.snaps;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of file (paths) for a Snap.
 * 
 * @author Wijnand
 */
public class FilesVO {

	@SerializedName("root")
	public String root;
	
	@SerializedName("page")
	public String page;
	
	@SerializedName("orig")
	public String original;
	
	@SerializedName("thumb")
	public String thumbnail;
	
	@SerializedName("tinythumb")
	public String tinyThumbnail;
	
	@SerializedName("standard")
	public String standard;
	
}
