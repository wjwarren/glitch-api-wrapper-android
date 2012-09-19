package nl.ansuz.android.glitch.api.response.players;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.players.ClothingListVO;

/**
 * Response object for players.getClothing.
 * 
 * @see http://developer.glitch.com/api/explore/#!players.getClothing
 * @author Wijnand
 */
public class GetClothingResponse extends GlitchResponse {

	@SerializedName("avatar_172")
	public String avatar_172;
	
	@SerializedName("avatar_100")
	public String avatar_100;
	
	@SerializedName("avatar_50")
	public String avatar_50;
	
	@SerializedName("clothing")
	public ClothingListVO clothing;
	
	
}
