package nl.ansuz.android.glitch.api.util.gson.players;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

import nl.ansuz.android.glitch.api.response.GlitchResponse;
import nl.ansuz.android.glitch.api.response.players.InventoryResponse;
import nl.ansuz.android.glitch.api.util.gson.GlitchDeserializer;
import nl.ansuz.android.glitch.api.vo.players.FurnitureSlotVO;
import nl.ansuz.android.glitch.api.vo.players.InventorySlotVO;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * GSON deserializer for Glitch Players.inventory API response.
 * 
 * @author Wijnand
 */
public class InventoryDeserializer extends GlitchDeserializer implements
		JsonDeserializer<InventoryResponse> {

	@Override
	public InventoryResponse deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {

		JsonObject jsonObject = json.getAsJsonObject();
		InventoryResponse result = new InventoryResponse();
		
		GlitchResponse defaults = context.deserialize(json, GlitchResponse.class);
		result = copyFromTo(defaults, result);
		
		// Contents
		if (jsonObject.has("contents")) {
			JsonElement contentListElement = jsonObject.get("contents");
			Set<Entry<String, JsonElement>> contentsEntries = contentListElement.getAsJsonObject().entrySet();
			
			if(contentsEntries.isEmpty()) {
				result.contents = null;
			} else {
				result.contents = new HashMap<String, InventorySlotVO>();
				
				for (Map.Entry<String, JsonElement> contentElement : contentsEntries) {
					result.contents.put(contentElement.getKey(), (InventorySlotVO) context.deserialize(contentElement.getValue(), InventorySlotVO.class) );
				}
			}
			
		} else {
			result.contents = null;
		}
		
		// Furniture
		if (jsonObject.has("furniture")) {
			JsonElement furnitureElement = jsonObject.get("furniture");
			
			if(furnitureElement.isJsonObject()) {
				Set<Entry<String, JsonElement>> furnitureEntries = furnitureElement.getAsJsonObject().entrySet();
				result.furniture = new HashMap<String, FurnitureSlotVO[]>();
				
				// Loop over all categories
				for (Map.Entry<String, JsonElement> furnitureListElement : furnitureEntries) {
					//result.contents.put(furnitureListElement.getKey(), (InventorySlotVO) context.deserialize(furnitureListElement.getValue(), InventorySlotVO.class) );
					if(furnitureListElement.getValue().isJsonArray()) {
						JsonArray furnitureList = furnitureListElement.getValue().getAsJsonArray();
						FurnitureSlotVO[] parsedFurnitureList = new FurnitureSlotVO[furnitureList.size()];
						
						// Loop over all entries
						for(int i = 0; i < furnitureList.size(); i++) {
							parsedFurnitureList[i] = (FurnitureSlotVO) context.deserialize(furnitureList.get(i), FurnitureSlotVO.class);
						}
						
						result.furniture.put(furnitureListElement.getKey(), parsedFurnitureList);
					}
				}
			} else {
				// Empty Object as response.
				result.furniture = null;
			}
			
		} else {
			result.furniture = null;
		}
		
		return result;
	}

}
