package nl.ansuz.android.glitch.api.request;

import java.util.HashMap;

import com.tinyspeck.android.Glitch;
import com.tinyspeck.android.GlitchRequest;

/**
 * Contains all request strings for Auctions.
 * 
 * @author Wijnand
 */
public class Auctions {

	/**
	 * Simple listing of auction request methods.
	 * 
	 * @author Wijnand
	 */
	public class Method {
		public static final String CREATE = "auctions.create";
		public static final String LIST = "auctions.list";
	}

	/**
	 * Simple listing of auction request parameters.
	 * 
	 * @author Wijnand
	 */
	public class Parameter {
		// Create
		public static final String STACK_TSID = "stack_tsid";
		public static final String COUNT = "count";
		public static final String COST = "cost";

		// List
		public static final String CATEGORY = "category";
		public static final String DEFS = "defs";
		public static final String PAGE = "page";
		public static final String PER_PAGE = "per_page";
	}

	/**
	 * Listing of possible values for the "category" parameter.
	 * 
	 * @author Wijnand
	 */
	public class Category {
		public static final String ADVANCED_RESOURCE = "advanced_resource";
		public static final String ALCHEMY = "alchemy";
		public static final String BASIC_RESOURCE = "basic_resource";
		public static final String FURNITURE_BEDS = "furniture-beds";
		public static final String COLLECTIBLE = "collectible";
		public static final String CROPPERY_GARDENING_SUPPLIES = "croppery_gardening_supplies";
		public static final String FURNITURE_DECORATIONS = "furniture-decorations";
		public static final String FURNITURE_DOORS = "furniture-doors";
		public static final String DRINK = "drink";
		public static final String EMBLEMS_ICONS = "emblems_icons";
		public static final String FOOD = "food";
		public static final String GASSES_BUBBLES = "gassesbubbles";
		public static final String HERBALISM_SUPPLIES = "herbalism_supplies";
		public static final String HERDKEEPING_SUPPLIES = "herdkeepingsupplies";
		public static final String KEY = "key";
		public static final String BUREAUCRACY = "bureaucracy";
		public static final String FURNITURE_LIGHTS = "furniture-lights";
		public static final String MACHINEPARTS_PRODUCTS = "machineparts_products";
		public static final String OTHER = "other";
		public static final String FURNITURE_RUGS = "furniture-rugs";
		public static final String FURNITURE_SEATING = "furniture-seating";
		public static final String FURNITURE_SHELVES = "furniture-shelves";
		public static final String SPICE = "spice";
		public static final String FURNITURE_STORAGE = "furniture-storage";
		public static final String FURNITURE_TABLES = "furniture-tables";
		public static final String TINCTURES_POTIONS = "tinctures_potions";
		public static final String TOOL = "tool";
		public static final String TOYS = "toys";
		public static final String UPGRADE_CARD = "upgrade_card";
		public static final String FURNITURE_WALLS = "furniture-walls";
	}

	/**
	 * Creates a GlitchRequest object to use to create an auction.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!auctions.create
	 * 
	 * @param glitch
	 *            Reference to the instance of the Glitch API object.
	 * @param stackTsid
	 *            TSID of item stack to auction. Must be somewhere in the
	 *            player's pack.
	 * @param count
	 *            Number of items to auction. Should be equal or less than the
	 *            size of the stack.
	 * @param cost
	 *            Total list price of auction.
	 */
	public static GlitchRequest getCreateRequest(Glitch glitch,
			String stackTsid, int count, double cost) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put(Parameter.STACK_TSID, stackTsid);
		params.put(Parameter.COUNT, "" + count);
		params.put(Parameter.COST, "" + cost);

		return new GlitchRequest(Method.CREATE, params, glitch);
	}

	/**
	 * Creates a GlitchRequest object to list auctions.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!auctions.list
	 * 
	 * @param glitch
	 *            Reference to the instance of the Glitch API object.
	 * @param category
	 *            (optional) - Only list items in a specific category. Current
	 *            categories are listed in the Category class.
	 * @param getDefinitions
	 *            (optional) - When true, returns item definitions.
	 * @param page
	 *            (optional, default 1) - The page of results to return.
	 * @param perPage
	 *            (optional, default 10) - Number of results to return per page.
	 */
	public static GlitchRequest getListRequest(Glitch glitch, String category,
			boolean getDefinitions, int page, int perPage) {
		HashMap<String, String> params = new HashMap<String, String>();
		if (category != null) {
			params.put(Parameter.CATEGORY, category);
		}
		if (getDefinitions) {
			params.put(Parameter.DEFS, "1");
		}
		if (page > 0) {
			params.put(Parameter.PAGE, "" + page);
		}
		if (perPage > 0) {
			params.put(Parameter.PER_PAGE, "" + perPage);
		}

		return new GlitchRequest(Method.LIST, params, glitch);
	}

	/**
	 * @see getListRequest(Glitch glitch, String category, boolean
	 *      getDefinitions, int page, int perPage)
	 */
	public static GlitchRequest getListRequest(Glitch glitch) {
		return getListRequest(glitch, null, false, -1, -1);
	}

}
