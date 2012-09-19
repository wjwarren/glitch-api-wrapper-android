package nl.ansuz.android.glitch.api.response.players;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.vo.players.InventorySlotVO;

/**
 * Response object for players.inventory.
 * 
 * @see http://developer.glitch.com/api/explore/#!players.inventory
 * @author Wijnand
 */
public class InventoryResponse extends GlitchResponse {

	// Using slot name as key.
	@SerializedName("contents")
	public Map<String, InventorySlotVO> contents;
	
	// TODO: Figure out what the contents of this Object is.
	@SerializedName("furniture")
	public Object furniture;
	
}
