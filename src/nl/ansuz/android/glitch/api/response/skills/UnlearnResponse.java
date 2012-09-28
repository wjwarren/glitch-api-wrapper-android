package nl.ansuz.android.glitch.api.response.skills;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.skills.UnlearningVO;

/**
 * Response object for skills.unlearn.
 * 
 * @see http://developer.glitch.com/api/explore/#!skills.unlearn
 * @author Wijnand
 */
public class UnlearnResponse extends GlitchResponse {

	public UnlearningVO skill;
	
}
