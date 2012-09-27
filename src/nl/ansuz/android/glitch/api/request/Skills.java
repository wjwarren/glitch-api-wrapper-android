package nl.ansuz.android.glitch.api.request;

import com.tinyspeck.android.Glitch;
import com.tinyspeck.android.GlitchRequest;

/**
 * Contains all request strings for Skills.
 * 
 * @author Wijnand
 */
public class Skills {

	/**
	 * Simple listing of Skills request methods.
	 * 
	 * @author Wijnand
	 */
	public class Method {
		public static final String CANCEL_UNLEARNING = "skills.cancelUnlearning";
		public static final String GET_INFO = "skills.getInfo";
		public static final String LEARN = "skills.learn";
		public static final String LIST_ALL = "skills.listAll";
		public static final String LIST_ALL_CATEGORIES = "skills.listAllCategories";
		public static final String LIST_ALL_IN_CATEGORY = "skills.listAllInCategory";
		public static final String LIST_AVAILABLE = "skills.listAvailable";
		public static final String LIST_LEARNED = "skills.listLearned";
		public static final String LIST_LEARNING = "skills.listLearning";
		public static final String LIST_UNLEARNABLE = "skills.listUnlearnable";
		public static final String LIST_UNLEARNING = "skills.listUnlearning";
		public static final String UNLEARN = "skills.unlearn";
	}
	
	/**
	 * Simple listing of Skills request parameters.
	 * 
	 * @author Wijnand
	 */
	public class Parameter {
		
	}
	
	/**
	 * Generic SKills request generator.
	 * 
	 * @param glitch
	 *            Reference to the instance of the Glitch API object.
	 * @param method
	 *            The Players method to invoke.
	 */
	private static GlitchRequest createGenericSkillsRequest(Glitch glitch, String method) {
		return new GlitchRequest(method, glitch);
	}
	
	/**
	 * Creates a GlitchRequest object to retrieve the authenticated player's currently unlearning skill, if any, and when it is currently scheduled to finish.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!skills.listUnlearning
	 * @see createGenericSkillsRequest(Glitch glitch, String method)
	 */
	public static GlitchRequest createListUnlearningRequest(Glitch glitch) {
		return createGenericSkillsRequest(glitch, Method.LIST_UNLEARNING);
	}

}
