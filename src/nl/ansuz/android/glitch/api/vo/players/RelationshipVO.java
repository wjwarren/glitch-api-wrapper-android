package nl.ansuz.android.glitch.api.vo.players;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of a relationship in Glitch.
 * 
 * @author Wijnand
 */
public class RelationshipVO {

	@SerializedName("is_me")
	public boolean isMe;
	
	@SerializedName("is_contact")
	public boolean isContact;
	
	@SerializedName("is_rev_contact")
	public boolean isRevContact;
	
	@SerializedName("can_contact")
	public boolean canContact;
	
	@SerializedName("im_blocking_them")
	public boolean iAmBlockingThem;
	
	@SerializedName("is_blocking_me")
	public boolean isBlockingMe;
	
}
