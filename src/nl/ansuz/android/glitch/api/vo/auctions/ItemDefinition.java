package nl.ansuz.android.glitch.api.vo.auctions;

import com.google.gson.annotations.SerializedName;

/**
 * Detailed description of an auction item.
 * 
 * @author Wijnand
 */
public class ItemDefinition {

	@SerializedName("class_tsid")
	public String classTsid;
	
	@SerializedName("name_single")
	public String nameSingular;
	
	@SerializedName("name_plural")
	public String namePlural;
	
	@SerializedName("category")
	public String category;
	
	@SerializedName("max_stack")
	public String maxStack;
	
	@SerializedName("desc")
	public String description;
	
	@SerializedName("base_cost")
	public String baseCost;
	
	@SerializedName("swf_url")
	public String swfUrl;
	
	@SerializedName("iconic_url")
	public String iconicUrl;
	
}
