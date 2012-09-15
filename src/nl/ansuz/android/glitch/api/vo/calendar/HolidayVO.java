package nl.ansuz.android.glitch.api.vo.calendar;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a holiday in Glitch.
 * 
 * @author Wijnand
 */
public class HolidayVO {
	
	@SerializedName("month")
	public int month;
	
	@SerializedName("day")
	public int day;
	
	@SerializedName("name")
	public String name;

}
