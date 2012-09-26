package nl.ansuz.android.glitch.api.vo.players;

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
	
}
