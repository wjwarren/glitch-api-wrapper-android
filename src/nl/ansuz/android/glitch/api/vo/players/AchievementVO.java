package nl.ansuz.android.glitch.api.vo.players;

import java.util.HashMap;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of an achievement in Glitch.
 * 
 * @author Wijnand
 */
public class AchievementVO {

	@SerializedName("id")
	public String id;
	
	@SerializedName("name")
	public String name;
	
	@SerializedName("icon_urls")
	public IconUrlsVO iconUrls;
	
}
