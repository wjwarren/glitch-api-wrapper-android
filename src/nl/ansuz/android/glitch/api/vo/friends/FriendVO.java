package nl.ansuz.android.glitch.api.vo.friends;

import nl.ansuz.android.glitch.api.vo.players.AvatarVO;
import com.google.gson.annotations.SerializedName;

/**
 * Representation of a friend in Glitch.
 * 
 * @author Wijnand
 */
public class FriendVO {

	public String tsid;

	@SerializedName("player_name")
	public String playerName;

	@SerializedName("user_name")
	public String userName;

	@SerializedName("is_reverse")
	public boolean isReverse;

	@SerializedName("avatar")
	public AvatarVO avatar;

	@SerializedName("friends")
	public String friends;

}
