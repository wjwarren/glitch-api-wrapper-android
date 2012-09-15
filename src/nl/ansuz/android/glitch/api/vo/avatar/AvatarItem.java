package nl.ansuz.android.glitch.api.vo.avatar;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class AvatarItem {

	@SerializedName("package_swf_url")
	public String packageSwfUrl;
	
	@SerializedName("article_class_name")
	public String articleClassName;
	
	@SerializedName("colors")
	public Map<String, ColourVO> colors;
	
}
