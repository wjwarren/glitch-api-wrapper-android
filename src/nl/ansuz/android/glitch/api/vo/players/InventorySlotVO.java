package nl.ansuz.android.glitch.api.vo.players;

import java.util.Map;

import nl.ansuz.android.glitch.api.vo.auctions.ItemDefinition;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of an Inventory slot in Glitch.
 * 
 * @author Wijnand
 */
public class InventorySlotVO {
	
	public String slotName;

	@SerializedName("tsid")
	public String tsid;
	
	@SerializedName("path_tsid")
	public String pathTsid;
	
	@SerializedName("class_tsid")
	public String classTsid;
	
	@SerializedName("label")
	public String label;
	
	@SerializedName("count")
	public int count;
	
	@SerializedName("item_def")
	public ItemDefinition itemDefinition;
	
	@SerializedName("contents")
	public Map<String, InventorySlotVO> contents;
	
	/**
	 * CONSTRUCTOR
	 */
	public InventorySlotVO() {
		init();
	}

	/**
	 * Initializes this class.
	 */
	private void init() {
		contents = null;
	}
	
}
