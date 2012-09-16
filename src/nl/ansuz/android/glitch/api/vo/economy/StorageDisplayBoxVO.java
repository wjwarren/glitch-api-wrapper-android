package nl.ansuz.android.glitch.api.vo.economy;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a Storage Display Box (SDB) in Glitch.
 * 
 * @author Wijnand
 */
public class StorageDisplayBoxVO {

	@SerializedName("sdb_tsid")
	public String sdbTsid;
	
	@SerializedName("date_updated")
	public String dateUpdated;
	
	@SerializedName("owner_tsid")
	public String ownerTsid;
	
	@SerializedName("location_tsid")
	public String locationTsid;
	
	@SerializedName("location_type")
	public String locationType;
	
	@SerializedName("item_class_tsid")
	public String itemClassTsid;
	
	@SerializedName("qty")
	public int quantity;
	
	@SerializedName("price_per_unit")
	public double pricePerUnit;
}
