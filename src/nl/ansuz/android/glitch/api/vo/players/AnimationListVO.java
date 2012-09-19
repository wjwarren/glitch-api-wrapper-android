package nl.ansuz.android.glitch.api.vo.players;

import com.google.gson.annotations.SerializedName;

/**
 * List of player animations.
 * 
 * @author Wijnand
 */
public class AnimationListVO {

	@SerializedName("angry")
	public int[] angry;
	
	@SerializedName("climb")
	public int[] climb;
	
	@SerializedName("happy")
	public int[] happy;
	
	@SerializedName("hit1")
	public int[] hit1;
	
	@SerializedName("hit2")
	public int[] hit2;
	
	@SerializedName("idle0")
	public int[] idle0;
	
	@SerializedName("idle1")
	public int[] idle1;
	
	@SerializedName("idle2")
	public int[] idle2;
	
	@SerializedName("idle3")
	public int[] idle3;
	
	@SerializedName("idle4")
	public int[] idle4;
	
	@SerializedName("idleSleepyEnd")
	public int[] idleSleepyEnd;
	
	@SerializedName("idleSleepyLoop")
	public int[] idleSleepyLoop;
	
	@SerializedName("idleSleepyStart")
	public int[] idleSleepyStart;
	
	@SerializedName("jumpOver_fall")
	public int[] jumpOverFall;
	
	@SerializedName("jumpOver_land")
	public int[] jumpOverLand;
	
	@SerializedName("jumpOver_lift")
	public int[] jumpOverLift;
	
	@SerializedName("jumpOver_test_sequence")
	public int[] jumpOverTestSequence;
	
	@SerializedName("surprise")
	public int[] surprise;
	
	@SerializedName("walk1x")
	public int[] walkNormalSpeed;
	
	@SerializedName("walk2x")
	public int[] walkDoubleSpeed;
	
	@SerializedName("walk3x")
	public int[] walkTripleSpeed;
	
}
