package nl.ansuz.android.glitch.api.response.players;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.players.AnimationListVO;
import nl.ansuz.android.glitch.api.vo.players.AnimationSheetVO;

/**
 * Response object for players.getAnimations.
 * 
 * @see http://developer.glitch.com/api/explore/#!players.getAnimations
 * @author Wijnand
 */
public class GetAnimationsResponse extends GlitchResponse {

	// Uses the animation name as key.
	@SerializedName("sheets")
	public Map<String, AnimationSheetVO> sheets;
	
	@SerializedName("anims")
	public AnimationListVO animations;
	
}
