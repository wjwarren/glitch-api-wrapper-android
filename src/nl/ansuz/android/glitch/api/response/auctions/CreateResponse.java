package nl.ansuz.android.glitch.api.response.auctions;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;

/**
 * Response object for auctions.create.
 * 
 * @see http://developer.glitch.com/api/explore/#!auctions.create
 * @author Wijnand
 */
public class CreateResponse extends GlitchResponse {

	@SerializedName("id")
	public String id;

}
