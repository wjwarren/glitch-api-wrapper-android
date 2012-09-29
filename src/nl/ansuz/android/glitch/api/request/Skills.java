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
		public static final String CATEGORY = "category";
		public static final String PAGE = "page";
		public static final String PER_PAGE = "per_page";
		public static final String SKILL_ID = "skill_id";
		public static final String SKILL_CLASS = "skill_class";
	}
	
	/**
	 * Generic Skills request generator.
	 * 
	 * @param glitch
	 *            Reference to the instance of the Glitch API object.
	 * @param method
	 *            The Skills method to invoke.
	 * @param parameters The parameters to send with the API request.
	 */
	private static GlitchRequest createGenericSkillsRequest(Glitch glitch, String method, HashMap<String, String> parameters) {
		return new GlitchRequest(method, parameters, glitch);
	}
	
	/**
	 * Creates a Glitch request with a single parameter added.
	 * 
	 * @param glitch Reference to the instance of the Glitch API object.
	 * @param method The Skills method to invoke.
	 * @param parameterName The name of the parameter to send.
	 * @param parameterValue The value of the parameter to send.
	 */
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
	 * Creates a GlitchRequest object to retrieve a paginated list of all skills. This data should be cached.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!skills.listAll
	 * @see createGenericSkillsRequest(glitch, method, parameters)
	 * 
	 * @param page The page of results to return.
	 * @param perPage Number of results to return per page.
	 */
	public static GlitchRequest createListAllRequest(Glitch glitch, int page, int perPage) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put(Parameter.PAGE, "" + page);
		params.put(Parameter.PER_PAGE, "" + perPage);
		
		return createGenericSkillsRequest(glitch, Method.LIST_ALL, params);
	}
	
	/**
	 * @see createListAllRequest(glitch, page, perPage)
	 */
	public static GlitchRequest createListAllRequest(Glitch glitch) {
		return createGenericSkillsRequest(glitch, Method.LIST_ALL, null);
	}
	
	/**
	 * Creates a GlitchRequest object to retrieve a list of all skill categories. This data should be cached.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!skills.listAllCategories
	 * @see createGenericSkillsRequest(glitch, method, parameters)
	 */
	public static GlitchRequest createListAllCategoriesRequest(Glitch glitch) {
		return createGenericSkillsRequest(glitch, Method.LIST_ALL_CATEGORIES, null);
	}
	
	/**
	 * Creates a GlitchRequest object to retrieve a list of all skill categories. This data should be cached.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!skills.listAllInCategory
	 * @see createGenericSkillsRequest(glitch, method, parameters)
	 * 
	 * @param category The name of the skill category.
	 */
	public static GlitchRequest createListAllInCategoryRequest(Glitch glitch, String category) {
		return createSingleParameterRequest(glitch, Method.LIST_ALL_IN_CATEGORY, Parameter.CATEGORY, category);
	}
	
	/**
	 * Creates a GlitchRequest object to retrieve a list of skills that the authenticated player can learn next.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!skills.listAvailable
	 * @see createGenericSkillsRequest(glitch, method, parameters)
	 */
	public static GlitchRequest createListAvailableRequest(Glitch glitch) {
		return createGenericSkillsRequest(glitch, Method.LIST_AVAILABLE, null);
	}
	
	/**
	 * Creates a GlitchRequest object to retrieve a list of skills that the authenticated player has learned.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!skills.listLearned
	 * @see createGenericSkillsRequest(glitch, method, parameters)
	 */
	public static GlitchRequest createListLearnedRequest(Glitch glitch) {
		return createGenericSkillsRequest(glitch, Method.LIST_LEARNED, null);
	}
	
	/**
	 * Creates a GlitchRequest object to retrieve the authenticated player's currently-training skill, if any, and when it is currently scheduled to finish.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!skills.listLearning
	 * @see createGenericSkillsRequest(glitch, method, parameters)
	 */
	public static GlitchRequest createListLearningRequest(Glitch glitch) {
		return createGenericSkillsRequest(glitch, Method.LIST_LEARNING, null);
	}
	
	/**
	 * Creates a GlitchRequest object to retrieve a list of skills that the authenticated player can unlearn next.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!skills.listUnlearnable
	 * @see createGenericSkillsRequest(glitch, method, parameters)
	 */
	public static GlitchRequest createListUnlearnableRequest(Glitch glitch) {
		return createGenericSkillsRequest(glitch, Method.LIST_UNLEARNABLE, null);
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
