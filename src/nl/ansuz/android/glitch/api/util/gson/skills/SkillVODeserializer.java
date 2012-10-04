package nl.ansuz.android.glitch.api.util.gson.skills;

import java.lang.reflect.Type;

import nl.ansuz.android.glitch.api.util.gson.GlitchDeserializer;
import nl.ansuz.android.glitch.api.vo.players.SkillVO;
import nl.ansuz.android.glitch.api.vo.players.SkillVOBase;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;

/**
 * GSON deserializer for Glitch Skills.
 * 
 * @author Wijnand
 */
public class SkillVODeserializer extends GlitchDeserializer implements JsonDeserializer<SkillVO> {
	
	/**
	 * @see super.deserialize(json, typeOfT, context)
	 */
	@Override
	public SkillVO deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {

		JsonObject jsonObject = json.getAsJsonObject();
		
		// Deserialize base info.
		SkillVO skill = new SkillVO();
		SkillVOBase skillBase = (SkillVOBase)context.deserialize(json, SkillVOBase.class);
		skill = copyFromSkillBase(skillBase, skill);
		
		// Deserialize unlearn quest removal.
		if(jsonObject.has("unlearn_quest_removal")) {
			JsonElement questRemovalElement = jsonObject.get("unlearn_quest_removal");
			JsonPrimitive questRemovalPrimitive = questRemovalElement.getAsJsonPrimitive();
			
			if(questRemovalPrimitive.isString()) {
				skill.unlearnQuestRemoval = questRemovalPrimitive.getAsString();
			} else {
				skill.unlearnQuestRemoval = null;
			}
		}
		
		// Deserialize required skills.
		if(jsonObject.has("required_skills")) {
			JsonElement requiredSkillsElement = jsonObject.get("required_skills");
			if(requiredSkillsElement.isJsonArray()) {
				// Only parse required skills when it is an array.
				JsonArray skillsList = requiredSkillsElement.getAsJsonArray();
				skill.requiredSkills = new String[skillsList.size()];
				
				for(int i = 0; i < skillsList.size(); i++) {
					skill.requiredSkills[i] = skillsList.get(i).getAsString();
				}
			} else {
				skill.requiredSkills = null;
			}
		}
		
		return skill;
	}

	/**
	 * Copies the values from the base to the actual SkillVO.
	 * 
	 * @param from The base object to copy the values from.
	 * @param to The actual SkillVO to copy the values to.
	 */
	private SkillVO copyFromSkillBase(SkillVOBase from, SkillVO to) {
		return (SkillVO)copyFromTo(from, to);
	}

}
