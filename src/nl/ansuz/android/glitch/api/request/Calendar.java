package nl.ansuz.android.glitch.api.request;

import java.util.HashMap;

import com.tinyspeck.android.Glitch;
import com.tinyspeck.android.GlitchRequest;

/**
 * Contains all request strings for the Calendar.
 * 
 * @author Wijnand
 */
public class Calendar {

	/**
	 * Simple listing of auction request methods.
	 * 
	 * @author Wijnand
	 */
	public class Method {
		public static final String GET_HOLIDAYS = "calendar.getHolidays";
	}

	/**
	 * Simple listing of auction request parameters.
	 * 
	 * @author Wijnand
	 */
	public class Parameter {
		public static final String PAGE = "page";
		public static final String PER_PAGE = "per_page";
	}

	/**
	 * Creates a GlitchRequest object to list the holidays.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!calendar.getHolidays
	 * 
	 * @param glitch
	 *            Reference to the instance of the Glitch API object.
	 * @param page
	 *            (optional, default 1) - The page of results to return.
	 * @param perPage
	 *            (optional, default 10) - Number of results to return per page.
	 */
	public static GlitchRequest getHolidaysRequest(Glitch glitch, int page,
			int perPage) {
		HashMap<String, String> params = new HashMap<String, String>();
		if (page > 0) {
			params.put(Parameter.PAGE, "" + page);
		}
		if (perPage > 0) {
			params.put(Parameter.PER_PAGE, "" + perPage);
		}

		return new GlitchRequest(Method.GET_HOLIDAYS, params, glitch);
	}

	/**
	 * @see getHolidaysRequest(Glitch glitch, int page, int perPage)
	 */
	public static GlitchRequest getHolidaysRequest(Glitch glitch) {
		return getHolidaysRequest(glitch, -1, -1);
	}

}
