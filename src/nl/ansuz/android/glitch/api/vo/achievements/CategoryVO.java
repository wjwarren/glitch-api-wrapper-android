package nl.ansuz.android.glitch.api.vo.achievements;

import com.google.gson.annotations.SerializedName;

public class CategoryVO {

	@SerializedName("total")
	public int total;
	
	@SerializedName("got")
	public int got;
	
	/**
	 * CONSTRUCTOR
	 */
	public CategoryVO() {
		init();
	}

	/**
	 * Initializes this class.
	 */
	private void init() {
		got = 0;
	}
	
}
