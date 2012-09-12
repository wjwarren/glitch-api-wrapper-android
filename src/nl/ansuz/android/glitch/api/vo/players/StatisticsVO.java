package nl.ansuz.android.glitch.api.vo.players;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of the user's statistics in Glitch.
 * 
 * @author Wijnand
 */
public class StatisticsVO {
	
	@SerializedName("level")
	public int level;
	
	@SerializedName("xp")
	public int xp;
	
	@SerializedName("xp_max")
	public int xpMax;
	
	@SerializedName("currants")
	public int currants;
	
	@SerializedName("energy")
	public int energy;
	
	@SerializedName("energy_max")
	public int energyMax;
	
	@SerializedName("mood")
	public int mood;
	
	@SerializedName("mood_max")
	public int moodMax;
	
	@SerializedName("quoin_multiplier")
	public double quoinMultiplier;
	
	@SerializedName("imagination")
	public int imagination;

}
