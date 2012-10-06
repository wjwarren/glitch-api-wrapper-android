package nl.ansuz.android.glitch.api.vo.players;

import nl.ansuz.android.glitch.api.vo.auctions.ItemDefinition;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a furniture slot in Glitch.
 * 
 * @author Wijnand
 */
public class FurnitureSlotVO {
	
	public String slotName;

	@SerializedName("tsid")
	public String tsid;
	
	@SerializedName("class_tsid")
	public String classTsid;
	
	@SerializedName("label")
	public String label;
	
	@SerializedName("is_soulbound")
	private int soulbound;
	
	@SerializedName("upgrades_count")
	public int upgradesCount;
	
	@SerializedName("item_def")
	public ItemDefinition itemDefinition;
	
	public boolean isSoulbound() {
		return soulbound > 0;
	}
	
}
