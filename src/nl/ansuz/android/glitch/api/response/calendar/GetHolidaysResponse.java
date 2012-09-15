package nl.ansuz.android.glitch.api.response.calendar;

import com.google.gson.annotations.SerializedName;

import nl.ansuz.android.glitch.api.response.PagedResponse;
import nl.ansuz.android.glitch.api.vo.calendar.HolidayVO;

/**
 * Response object for calendar.getHolidays.
 * 
 * @see http://developer.glitch.com/api/explore/#!calendar.getHolidays
 * @author Wijnand
 */
public class GetHolidaysResponse extends PagedResponse {

	@SerializedName("days")
	public HolidayVO[] holidays;
	
}
