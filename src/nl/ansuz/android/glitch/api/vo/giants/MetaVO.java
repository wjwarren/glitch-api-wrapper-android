package nl.ansuz.android.glitch.api.vo.giants;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of Giants meta data.
 * 
 * @author Wijnand
 */
public class MetaVO {
	
	@SerializedName("cur_daily_img")
	public int currentDailyImagination;
	
	@SerializedName("max_daily_img")
	public int maxDailyImagination;
	
}
