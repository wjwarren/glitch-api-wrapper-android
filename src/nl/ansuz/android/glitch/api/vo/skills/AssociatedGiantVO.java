package nl.ansuz.android.glitch.api.vo.skills;

import com.google.gson.annotations.SerializedName;

/**
 * Simple representation of a Giant associated with a skill.
 * 
 * @author Wijnand
 */
public class AssociatedGiantVO {

	@SerializedName("id")
	public String id;
	
	@SerializedName("is_primary")
	private int isPrimary;
	
	/**
	 * Whether or not this is the primary Giant associated with this skill.
	 */
	public boolean getIsPrimary() {
		return isPrimary > 0;
	}
	
}
