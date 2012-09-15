package nl.ansuz.android.glitch.api.vo.avatar;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a detailed Avatar configuration.
 * 
 * @author Wijnand
 */
public class AvatarHashVO {

	@SerializedName("ver")
	public String version;
	
	@SerializedName("articles")
	public AvatarArticlesVO articles;
	
}
