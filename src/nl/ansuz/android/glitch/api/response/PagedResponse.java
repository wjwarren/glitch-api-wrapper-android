package nl.ansuz.android.glitch.api.response;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a paged Glitch API response.
 * 
 * @author Wijnand
 */
public class PagedResponse extends GlitchResponse {

	@SerializedName("pages")
	public int pages;
	
	@SerializedName("per_page")
	public int perPage;
	
	@SerializedName("page")
	public int page;
	
	@SerializedName("total")
	public int total;
	
}
