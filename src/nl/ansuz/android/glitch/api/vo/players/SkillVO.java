package nl.ansuz.android.glitch.api.vo.players;

import nl.ansuz.android.glitch.api.vo.skills.AssociatedGiantVO;
import nl.ansuz.android.glitch.api.vo.skills.SkillRequirementVO;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a skill in Glitch.
 * 
 * @author Wijnand
 */
public class SkillVO {

	@SerializedName("id")
	public String id;
	
	@SerializedName("name")
	public String name;
	
	@SerializedName("class_tsid")
	public String classTsid;
	
	@SerializedName("url")
	public String url;
	
	@SerializedName("description")
	public String description;
	
	@SerializedName("icon_44")
	public String icon44;
	
	@SerializedName("icon_100")
	public String icon100;
	
	@SerializedName("icon_460")
	public String icon460;
	
	@SerializedName("total_time")
	public int totalTime;
	
	@SerializedName("time_remaining")
	public int timeRemaining;
	
	@SerializedName("required_level")
	public String requiredLevel;
	
	// List of skill class TSIDs that are required before learning this skill.
	@SerializedName("required_skills")
	public String[] requiredSkills;
	
	@SerializedName("unlearn_quest_removal")
	public int unlearnQuestRemoval;
	
	@SerializedName("unlearn_time")
	public int unlearnTime;
	
	@SerializedName("time_start")
	public int timeStart;
	
	@SerializedName("time_complete")
	public int timeComplete;
	
	@SerializedName("giants")
	public AssociatedGiantVO[] giants;
	
	@SerializedName("reqs")
	public SkillRequirementVO[] detailedRequirements;
	
	@SerializedName("post_reqs")
	public SkillRequirementVO[] postRequirements;
	
	@SerializedName("learning")
	private int learning;
	
	@SerializedName("got")
	private int got;
	
	@SerializedName("paused")
	private int paused;
	
	@SerializedName("can_learn")
	private int canLearn;
	
	@SerializedName("can_unlearn")
	private int canUnlearn;
	
	@SerializedName("unlearning")
	private int unlearning;
	
	/**
	 * Whether or not this Skill is currently being taught.
	 */
	public boolean getLearning() {
		return learning > 0;
	}
	
	/**
	 * Whether or not this Skill has already been acquired.
	 */
	public boolean getAcquired() {
		return got > 0;
	}
	
	/**
	 * Whether or not learning this Skill has been paused.
	 */
	public boolean getPaused() {
		return paused > 0;
	}
	
	/**
	 * Whether or not this Skill can be taught.
	 */
	public boolean getCanLearn() {
		return canLearn > 0;
	}
	
	/**
	 * Whether or not this Skill can be "unlearned".
	 * 
	 * (NOTE: Why not call this "forget"?)
	 */
	public boolean getCanUnlearn() {
		return canUnlearn > 0;
	}
	
	/**
	 * Whether or not this Skill is being "unlearned".
	 */
	public boolean getUnlearning() {
		return unlearning > 0;
	}
}
