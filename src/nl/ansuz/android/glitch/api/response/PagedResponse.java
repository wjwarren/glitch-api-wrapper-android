package nl.ansuz.android.glitch.api.response;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a paged Glitch API response.
 * 
 * @author Wijnand
 */
public class PagedResponse extends GlitchResponse {

	@SerializedName("page_count")
	private int pageCount;
	
	@SerializedName("pages")
	private int pages;
	
	@SerializedName("per_page")
	public int perPage;
	
	@SerializedName("page")
	public int page;
	
	@SerializedName("total")
	private int total;
	
	@SerializedName("total_count")
	private int totalCount;
	
	/**
	 * CONSTRUCTOR
	 */
	public PagedResponse() {
		pageCount = 0;
		pages = 0;
		
		total = 0;
		totalCount = 0;
	}
	
	/**
	 * The total number of entries.
	 * 
	 * Sometimes the JSON contains "total", sometimes it is "total_count".
	 */
	public int getTotal() {
		return total + totalCount;
	}
	/**
	 * Stores the total number of entries.
	 */
	public void setTotal(int total) {
		this.total = total;
		totalCount = 0;
	}
	
	/**
	 * The total number of pages.
	 * 
	 * Sometimes the JSON contains "pages", sometimes it is "page_count".
	 */
	public int getPageCount() {
		return pages + pageCount;
	}
	/**
	 * Stores the total number of pages.
	 */
	public void setPageCount(int pages) {
		this.pages = pages;
		pageCount = 0;
	}
	
}
