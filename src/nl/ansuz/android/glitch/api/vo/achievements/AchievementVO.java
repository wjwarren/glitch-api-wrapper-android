package nl.ansuz.android.glitch.api.vo.achievements;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of an achievement in Glitch in the achievements responses.
 * 
 * @author Wijnand
 */
public class AchievementVO {

	@SerializedName("class_tsid")
	public String classTsid;
	
	@SerializedName("name")
	public String name;
	
	@SerializedName("desc")
	public String description;
	
	@SerializedName("url")
	public String url;
	
	@SerializedName("image_60")
	public String image60;
	
	@SerializedName("image_180")
	public String image180;
	
	@SerializedName("got")
	public boolean got;
	
	/**
	 * CONSTRUCTOR
	 */
	public AchievementVO() {
		init();
	}

	/**
	 * Initializes this class.
	 */
	private void init() {
		got = false;
	}
	
}
