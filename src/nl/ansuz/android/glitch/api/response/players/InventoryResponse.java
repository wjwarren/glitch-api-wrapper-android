package nl.ansuz.android.glitch.api.response.players;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.players.FurnitureSlotVO;
import nl.ansuz.android.glitch.api.vo.players.InventorySlotVO;

/**
 * Response object for players.inventory.
 * 
 * NOTE: Use the InventoryDeserializer to deserialize the API response.
 * 
 * @see http://developer.glitch.com/api/explore/#!players.inventory
 * @author Wijnand
 */
public class InventoryResponse extends GlitchResponse {

	// Using slot name as key.
	@SerializedName("contents")
	public Map<String, InventorySlotVO> contents;
	
	// Map key is the furniture category.
	@SerializedName("furniture")
	public Map<String, FurnitureSlotVO[]> furniture;
	
}
