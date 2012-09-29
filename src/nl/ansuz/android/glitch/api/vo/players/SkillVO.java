package nl.ansuz.android.glitch.api.vo.players;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a skill in Glitch.
 * Split into this class and the SkillVOBase it extends due to the Glitch API
 * returning an empty object when there are no required skills.
 * 
 * @author Wijnand
 */
public class SkillVO extends SkillVOBase {

	// List of skill class TSIDs that are required before learning this skill.
	// When empty, the API responds with an empty Object.
	@SerializedName("required_skills")
	public String[] requiredSkills;
	
	// Sometimes the API responds with an int.
	@SerializedName("unlearn_quest_removal")
	public String unlearnQuestRemoval;
	
}
