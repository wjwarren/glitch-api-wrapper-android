package nl.ansuz.android.glitch.api.vo.players;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of an animation sheet in Glitch.
 * 
 * @author Wijnand
 */
public class AnimationSheetVO {

	@SerializedName("name")
	public String name;
	
	@SerializedName("cols")
	public String columns;
	
	@SerializedName("rows")
	public String rows;
	
	@SerializedName("frames")
	public int[] frames;
	
	@SerializedName("url")
	public String url;
	
}
