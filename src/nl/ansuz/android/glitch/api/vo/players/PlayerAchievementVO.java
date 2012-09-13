package nl.ansuz.android.glitch.api.vo.players;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of an achievement in Glitch in the player responses.
 * 
 * @author Wijnand
 */
public class PlayerAchievementVO {

	@SerializedName("id")
	public String id;
	
	@SerializedName("name")
	public String name;
	
	@SerializedName("icon_urls")
	public IconUrlsVO iconUrls;
	
}
