package nl.ansuz.android.glitch.api.response.skills;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.players.SkillVO;

/**
 * Response object for skills.listLearning.
 * 
 * @see http://developer.glitch.com/api/explore/#!skills.listLearning
 * @author Wijnand
 */
public class ListLearningResponse extends GlitchResponse {

	// The skill class TSID is used as key.
	@SerializedName("learning")
	public Map<String, SkillVO> learning;
	
}
