package nl.ansuz.android.glitch.api.response.skills;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.players.SkillVO;

/**
 * Response object for skills.getInfo.
 * 
 * NOTE: Damn!!! this response is ugly!!! It contains most of the data that a 
 * 	SkillVO contains. Use the custom SkillsGetInfoDeserializer to deserialize 
 * 	the API response.
 * 
 * @see http://developer.glitch.com/api/explore/#!skills.getInfo
 * @author Wijnand
 */
public class GetInfoResponse extends GlitchResponse {
	
	public SkillVO skillInfo;
	
}
