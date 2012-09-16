package nl.ansuz.android.glitch.api.vo.giants;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a Giant in Glitch.
 * 
 * @author Wijnand
 */
public class GiantVO {

	@SerializedName("name")
	public String name;
	
	@SerializedName("cur_favor")
	public int currentFavour;
	
	@SerializedName("max_favor")
	public int maxFavour;
	
	@SerializedName("cur_daily_favor")
	public int currentDailyFavour;
	
	@SerializedName("max_daily_favor")
	public int maxDailyFavour;
	
}
