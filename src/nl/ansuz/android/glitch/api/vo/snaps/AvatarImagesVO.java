package nl.ansuz.android.glitch.api.vo.snaps;

import com.google.gson.annotations.SerializedName;

/**
 * List of Avatar images from a player.
 * This includes various sizes of still images as well as various animation 
 * sheets.
 * 
 * @author Wijnand
 */
public class AvatarImagesVO extends SnapOwnerAvatarVO {

	@SerializedName("sheet_base")
	public String sheetBase;
	
	@SerializedName("sheet_angry")
	public String sheetAngry;
	
	@SerializedName("sheet_climb")
	public String sheetClimb;
	
	@SerializedName("sheet_happy")
	public String sheetHappy;
	
	@SerializedName("sheet_idle1")
	public String sheetIdle1;
	
	@SerializedName("sheet_idle2")
	public String sheetIdle2;
	
	@SerializedName("sheet_idle3")
	public String sheetIdle3;
	
	@SerializedName("sheet_idle4")
	public String sheetIdle4;
	
	@SerializedName("sheet_idleSleepy")
	public String sheetIdleSleepy;
	
	@SerializedName("sheet_jump")
	public String sheetJump;
	
	@SerializedName("sheet_surprise")
	public String sheetSurprise;
	
}
