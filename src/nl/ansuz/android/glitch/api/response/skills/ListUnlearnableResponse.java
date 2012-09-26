package nl.ansuz.android.glitch.api.response.skills;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.players.SkillVO;

/**
 * Response object for skills.listUnlearnable.
 * 
 * @see http://developer.glitch.com/api/explore/#!skills.listUnlearnable
 * @author Wijnand
 */
public class ListUnlearnableResponse extends GlitchResponse {

	// The skill class TSID is used as key.
	@SerializedName("skills")
	public Map<String, SkillVO> skills;
	
}
