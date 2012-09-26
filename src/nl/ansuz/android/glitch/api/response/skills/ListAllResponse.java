package nl.ansuz.android.glitch.api.response.skills;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.PagedResponse;
import nl.ansuz.android.glitch.api.vo.players.SkillVO;

/**
 * Response object for skills.listAll.
 * 
 * @see http://developer.glitch.com/api/explore/#!skills.listAll
 * @author Wijnand
 */
public class ListAllResponse extends PagedResponse {

	// The skill class TSID is used as key.
	@SerializedName("items")
	public Map<String, SkillVO> skills;
	
}
