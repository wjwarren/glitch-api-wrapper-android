package nl.ansuz.android.glitch.api.vo.snaps;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a Snap owner.
 * 
 * NOTE: For a lot of these properties I have no idea what they mean.
 * 
 * @author Wijnand
 */
public class SnapOwnerVO {

	@SerializedName("id")
	public String id;
	
	@SerializedName("tsid")
	public String tsid;
	
	@SerializedName("name")
	public String name;
	
	@SerializedName("user_id")
	public String user_id;
	
	@SerializedName("user_shard")
	public String user_shard;
	
	@SerializedName("is_primary")
	private String isPrimary;
	
	@SerializedName("name_norm")
	public String nameNormalized;
	
	@SerializedName("date_create")
	public String dateCreated;
	
	@SerializedName("date_last_client")
	public String dateLastClient;
	
	@SerializedName("date_last_lb")
	public String dateLastLb;
	
	@SerializedName("date_last_active")
	public String dateLastActive;
	
	@SerializedName("is_dormant")
	private String isDormant;
	
	@SerializedName("seen_intro")
	private String seenIntro;
	
	@SerializedName("stats_cache")
	public String stats_cache;
	
	@SerializedName("needs_avatar_set")
	private String needsAvatarSet;
	
	@SerializedName("forced_rename")
	private String forcedRename;
	
	@SerializedName("av_singles")
	public String avatarSingles;
	
	@SerializedName("av_sheets")
	public String avatarSheets;
	
	@SerializedName("av_needs_update")
	private String avatarNeedsUpdate;
	
	@SerializedName("is_deleted")
	private String isDeleted;
	
	@SerializedName("affected_by_evil")
	private String affectedByEvil;
	
	@SerializedName("abuse_level")
	public String abuseLevel;
	
	@SerializedName("is_in_timeout")
	private String isInTimeout;
	
	@SerializedName("help_silenced")
	private String helpSilenced;
	
	// NOTE: These urls result in a 401, so not deserializing them further (for
	// now).
	@SerializedName("base_urls")
	public Map<String, String> baseUrls;
	
	@SerializedName("urls")
	public AvatarImagesVO avatarUrls;
	
	/**
	 * Whether or not this is the primary (account?).
	 */
	public boolean getIsPrimary() {
		return Integer.parseInt(isPrimary) > 0;
	}
	
	/**
	 * Whether or not this player is dormant.
	 */
	public boolean getIsDormant() {
		return Integer.parseInt(isDormant) > 0;
	}
	
	/**
	 * Whether or not this player has seen the intro.
	 */
	public boolean getSeenIntro() {
		return Integer.parseInt(seenIntro) > 0;
	}
	
	/**
	 * Whether or not still needs to create an avatar?
	 */
	public boolean getNeedsAvatarSet() {
		return Integer.parseInt(needsAvatarSet) > 0;
	}
	
	/**
	 * Whether or not has been forced to rename his/her character?
	 */
	public boolean getForcedRename() {
		return Integer.parseInt(forcedRename) > 0;
	}
	
	/**
	 * Whether or not the Avatar needs to be updated?
	 */
	public boolean getAvatarNeedsUpdate() {
		return Integer.parseInt(avatarNeedsUpdate) > 0;
	}
	
	/**
	 * Whether or not the player has been deleted?
	 */
	public boolean getIsDeleted() {
		return Integer.parseInt(isDeleted) > 0;
	}
	
	/**
	 * Whether or not the player is affected by evil?
	 */
	public boolean getAffectedByEvil() {
		return Integer.parseInt(affectedByEvil) > 0;
	}
	
	/**
	 * Whether or not the player is in a timeout?
	 */
	public boolean getIsInTimeout() {
		return Integer.parseInt(isInTimeout) > 0;
	}
	
	/**
	 * Whether or not the help has been silenced?
	 */
	public boolean getHelpSilenced() {
		return Integer.parseInt(helpSilenced) > 0;
	}
	
}
