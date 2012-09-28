package nl.ansuz.android.glitch.api.request;

import java.util.HashMap;

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
		public static final String SKILL_ID = "skill_id";
		public static final String SKILL_CLASS = "skill_class";
	}
	
	/**
	 * Generic SKills request generator.
	 * 
	 * @param glitch
	 *            Reference to the instance of the Glitch API object.
	 * @param method
	 *            The Players method to invoke.
	 * @param parameters The parameters to send with the API request.
	 */
	private static GlitchRequest createGenericSkillsRequest(Glitch glitch, String method, HashMap<String, String> parameters) {
		return new GlitchRequest(method, parameters, glitch);
	}
	
	private static GlitchRequest createSingleParameterRequest(Glitch glitch, String method, String parameterName, String parameterValue) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put(parameterName, parameterValue);
		
		return createGenericSkillsRequest(glitch, method, params);
	}
	
	/**
	 * Creates a GlitchRequest object to retrieve information about a skill. Includes state information if authenticated.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!skills.getInfo
	 * @see createGenericSkillsRequest(glitch, method, parameters)
	 * 
	 * @param parameterName Use either Parameter.SKILL_ID or Parameter.SKILL_CLASS
	 * @param parameterValue The value of the parameter to pass.
	 */
	public static GlitchRequest createGetInfoRequest(Glitch glitch, String parameterName, String parameterValue) {
		return createSingleParameterRequest(glitch, Method.GET_INFO, parameterName, parameterValue);
	}
	
	/**
	 * Creates a GlitchRequest object to start learning a new skill for the authenticated player.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!skills.learn
	 * @see createGenericSkillsRequest(glitch, method, parameters)
	 * 
	 * @param parameterName Use either Parameter.SKILL_ID or Parameter.SKILL_CLASS
	 * @param parameterValue The value of the parameter to pass.
	 */
	public static GlitchRequest createLearnRequest(Glitch glitch, String parameterName, String parameterValue) {
		return createSingleParameterRequest(glitch, Method.LEARN, parameterName, parameterValue);
	}
	
	/**
	 * Creates a GlitchRequest object to retrieve the authenticated player's currently unlearning skill, if any, and when it is currently scheduled to finish.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!skills.listUnlearning
	 * @see createGenericSkillsRequest(glitch, method, parameters)
	 */
	public static GlitchRequest createListUnlearningRequest(Glitch glitch) {
		return createGenericSkillsRequest(glitch, Method.LIST_UNLEARNING, null);
	}
	
	/**
	 * Creates a GlitchRequest object to start unlearning a skill for the authenticated player.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!skills.unlearn
	 * @see createGenericSkillsRequest(glitch, method, parameters)
	 * 
	 * @param parameterName Use either Parameter.SKILL_ID or Parameter.SKILL_CLASS
	 * @param parameterValue The value of the parameter to pass.
	 */
	public static GlitchRequest createUnlearnRequest(Glitch glitch, String parameterName, String parameterValue) {
		return createSingleParameterRequest(glitch, Method.UNLEARN, parameterName, parameterValue);
	}

}
