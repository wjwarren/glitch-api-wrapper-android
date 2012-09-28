package nl.ansuz.android.glitch.api.vo.skills;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a skill that is being "(un)learned".
 * 
 * @author Wijnand
 */
public class UnlearningVO {

	// This is either the Skill id or class.
	public String name;
	
	@SerializedName("start")
	public int start;
	
	@SerializedName("end")
	public int end;
	
	@SerializedName("unlearn_quest_removal")
	public int unlearnQuestRemoval;
	
}
