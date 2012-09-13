package nl.ansuz.android.glitch.api.response.players;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.players.PlayerAchievementVO;
import nl.ansuz.android.glitch.api.vo.players.AvatarVO;
import nl.ansuz.android.glitch.api.vo.players.LocationVO;
import nl.ansuz.android.glitch.api.vo.players.PolVO;
import nl.ansuz.android.glitch.api.vo.players.RelationshipVO;
import nl.ansuz.android.glitch.api.vo.players.SkillVO;
import nl.ansuz.android.glitch.api.vo.players.StatisticsVO;
import nl.ansuz.android.glitch.api.vo.players.UpdateVO;

import com.google.gson.annotations.SerializedName;

/**
 * Response object for players.fullInfo.
 * 
 * @see http://developer.glitch.com/api/explore/#!players.fullInfo
 * @author Wijnand
 */
public class FullInfoResponse extends GlitchResponse {

	@SerializedName("player_name")
	public String name;

	@SerializedName("player_tsid")
	public String tsid;

	@SerializedName("is_online")
	public boolean isOnline;

	@SerializedName("last_online")
	public int lastOnline;

	@SerializedName("avatar")
	public AvatarVO avatar;

	@SerializedName("stats")
	public StatisticsVO statistics;

	@SerializedName("latest_skill")
	public SkillVO latestSkill;

	@SerializedName("num_skills")
	public int numberOfSkills;

	@SerializedName("latest_achievement")
	public PlayerAchievementVO latestAchievement;

	@SerializedName("num_achievements")
	public int numberOfAchievements;

	@SerializedName("num_upgrades")
	public int numberOfUpgrades;

	@SerializedName("location")
	public LocationVO location;

	@SerializedName("pol")
	public PolVO pol;

	@SerializedName("relationship")
	public RelationshipVO relationship;

	@SerializedName("last_update")
	public UpdateVO lastUpdate;

	@SerializedName("home_street_image")
	public String homeStreetImage;

	@SerializedName("is_subscriber")
	public boolean isSubscriber;

	/**
	 * CONSTRUCTOR
	 */
	public FullInfoResponse() {
		init();
	}

	/**
	 * Initializes this class.
	 */
	private void init() {
		tsid = "";
	}
	
}
