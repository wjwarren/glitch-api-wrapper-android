package nl.ansuz.android.glitch.api.response.snaps;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;

/**
 * Response object for snaps.comment.
 * 
 * @see http://developer.glitch.com/api/explore/#!snaps.comment
 * @author Wijnand
 */
public class CommentResponse extends GlitchResponse {

	@SerializedName("id")
	public String id;
	
	@SerializedName("date_create")
	public int date_create;
	
	@SerializedName("comment")
	public String comment;
	
}
