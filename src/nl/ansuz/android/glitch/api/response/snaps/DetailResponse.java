package nl.ansuz.android.glitch.api.response.snaps;

import nl.ansuz.android.glitch.api.response.snaps.base.DetailBaseResponse;
import nl.ansuz.android.glitch.api.vo.snaps.CommentVO;

import com.google.gson.annotations.SerializedName;

/**
 * Response object for snaps.comment.
 * 
 * @see http://developer.glitch.com/api/explore/#!snaps.detail
 * @author Wijnand
 */
public class DetailResponse extends DetailBaseResponse {

	@SerializedName("comments")
	public CommentVO[] comments;
	
}
