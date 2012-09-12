package nl.ansuz.android.glitch.api.vo.players;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of an update (message) in Glitch.
 * 
 * @author Wijnand
 */
public class UpdateVO {

	@SerializedName("id")
	public String id;
	
	@SerializedName("time")
	public int time;
	
	@SerializedName("time_ago")
	public int timeAgo;
	
	@SerializedName("text")
	public String text;
	
}
