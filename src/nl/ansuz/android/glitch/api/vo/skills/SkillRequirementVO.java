package nl.ansuz.android.glitch.api.vo.skills;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a requirement for a Skill.
 * 
 * @author Wijnand
 */
public class SkillRequirementVO {

	@SerializedName("type")
	public String type;
	
	@SerializedName("class_tsid")
	public String class_tsid;
	
	@SerializedName("name")
	public String name;
	
	@SerializedName("url")
	public String url;
	
	@SerializedName("event")
	public String event;
	
	@SerializedName("got")
	private int got;
	
	/**
	 * Whether or not the requirement has already been met.
	 */
	public boolean getRequirementMet() {
		return got > 0;
	}
	
}
