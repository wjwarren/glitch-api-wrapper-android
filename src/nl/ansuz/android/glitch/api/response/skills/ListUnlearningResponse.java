package nl.ansuz.android.glitch.api.response.skills;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.players.SkillVO;

/**
 * Response object for skills.listUnlearning.
 * 
 * @see http://developer.glitch.com/api/explore/#!skills.listUnlearning
 * @author Wijnand
 */
public class ListUnlearningResponse extends GlitchResponse {

	// The skill class TSID is used as key.
	@SerializedName("unlearning")
	public Map<String, SkillVO> unlearning;
	
}
