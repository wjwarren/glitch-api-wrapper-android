package nl.ansuz.android.glitch.api.response.friends;

import java.util.Map;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.friends.FriendVO;

import com.google.gson.annotations.SerializedName;

/**
 * Response object for friends.list. 
 * The friends Map contains the friend TSID as key.
 * 
 * @see http://developer.glitch.com/api/explore/#!friends.list
 * @author Wijnand
 */
public class ListResponse extends GlitchResponse {

	@SerializedName("friends")
	public Map<String, FriendVO> friends;

}
