package nl.ansuz.android.glitch.api.response.skills;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.skills.UnlearningVO;

/**
 * Response object for skills.learn.
 * 
 * @see http://developer.glitch.com/api/explore/#!skills.learn
 * @author Wijnand
 */
public class LearnResponse extends GlitchResponse {

	// Success data.
	public UnlearningVO skill;
	
	// Error data.
	public String id;
	public int busyUnlearning;
	public int learn;
	public String fullName;
	
	/**
	 * Whether or not the user is busy unlearning a Skill.
	 */
	public boolean getBusyUnlearning() {
		return busyUnlearning > 0;
	}
	
}