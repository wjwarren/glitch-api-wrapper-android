package nl.ansuz.android.glitch.api.response.avatar;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.avatar.AvatarBaseHashVO;
import nl.ansuz.android.glitch.api.vo.avatar.AvatarHashVO;

/**
 * Response object for avatar.getDetails.
 * 
 * @see http://developer.glitch.com/api/explore/#!avatar.getDetails
 * @author Wijnand
 */
public class GetDetailsResponse extends GlitchResponse {

	@SerializedName("hash")
	public AvatarHashVO hash;
	
	@SerializedName("base_hash")
	public AvatarBaseHashVO baseHash;
	
	@SerializedName("checksum")
	public String checksum;
	
}
