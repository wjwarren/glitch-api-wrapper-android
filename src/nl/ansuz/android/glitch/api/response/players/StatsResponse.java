package nl.ansuz.android.glitch.api.response.players;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;

/**
 * Response object for players.stats.
 * 
 * @see http://developer.glitch.com/api/explore/#!players.stats
 * @author Wijnand
 */
public class StatsResponse extends GlitchResponse {

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
	
}
