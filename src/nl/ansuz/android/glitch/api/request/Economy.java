package nl.ansuz.android.glitch.api.request;

import java.util.HashMap;

import com.tinyspeck.android.Glitch;
import com.tinyspeck.android.GlitchRequest;

/**
 * Contains all request strings for the Economy.
 * 
 * @author Wijnand
 */
public class Economy {

	/**
	 * Simple listing of economy request methods.
	 * 
	 * @author Wijnand
	 */
	public class Method {
		public static final String RECENT_SDBS = "economy.recentSDBs";
		public static final String RECENT_SALES = "economy.recentSales";
	}

	/**
	 * Simple listing of economy request parameters.
	 * 
	 * @author Wijnand
	 */
	public class Parameter {
		public static final String SINCE = "since";
		public static final String PAGE = "page";
		public static final String PER_PAGE = "per_page";
	}

	/**
	 * Creates a GlitchRequest object for economy requests.
	 * 
	 * @param glitch
	 *            Reference to the instance of the Glitch API object.
	 * @param since
	 *            (optional) Only return updates after this timestamp.
	 * @param page
	 *            (optional, default 1) - The page of results to return.
	 * @param perPage
	 *            (optional, default 10) - Number of results to return per page.
	 */
	private static GlitchRequest createEconomyRequest(Glitch glitch,
			String method, int since, int page, int perPage) {
		HashMap<String, String> params = new HashMap<String, String>();
		if (since > 0) {
			params.put(Parameter.SINCE, "" + since);
		}
		if (page > 0) {
			params.put(Parameter.PAGE, "" + page);
		}
		if (perPage > 0) {
			params.put(Parameter.PER_PAGE, "" + perPage);
		}

		return new GlitchRequest(method, params, glitch);
	}

	/**
	 * Creates a GlitchRequest object to list the recent SDB (sales?).
	 * 
	 * @see createEconomyRequest(Glitch glitch, String method, int since, int
	 *      page, int perPage)
	 * @see http://developer.glitch.com/api/explore/#!economy.recentSDBs
	 */
	public static GlitchRequest getResentSDB(Glitch glitch, int since,
			int page, int perPage) {
		return createEconomyRequest(glitch, Method.RECENT_SDBS, since, page,
				perPage);
	}

	/**
	 * @see getResentSDB(Glitch glitch, int since, int page, int perPage)
	 */
	public static GlitchRequest getResentSDB(Glitch glitch) {
		return getResentSDB(glitch, -1, -1, -1);
	}

	/**
	 * Creates a GlitchRequest object to list recent sales.
	 * 
	 * @see createEconomyRequest(Glitch glitch, String method, int since, int
	 *      page, int perPage)
	 * @see http://developer.glitch.com/api/explore/#!economy.recentSales
	 */
	public static GlitchRequest getResentSales(Glitch glitch, int since,
			int page, int perPage) {
		return createEconomyRequest(glitch, Method.RECENT_SALES, since, page,
				perPage);
	}

	/**
	 * @see getResentSDB(Glitch glitch, int since, int page, int perPage)
	 */
	public static GlitchRequest getResentSales(Glitch glitch) {
		return getResentSales(glitch, -1, -1, -1);
	}

}
