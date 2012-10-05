package nl.ansuz.android.glitch.api.response.snaps;

import nl.ansuz.android.glitch.api.response.snaps.base.SnapListBaseResponse;

/**
 * Response object for snaps.getForLocation.
 * 
 * Note: Deserialize using the GetForLocationDeserializer!
 * 
 * Seems like there is a huge data leak here as there is a ton of player info
 * returned by this API method call, especially in the SnapVO.owner.stats_cache 
 * property.
 * 
 * @see http://developer.glitch.com/api/explore/#!snaps.getForLocation
 * @author Wijnand
 */
public class GetForLocationResponse extends SnapListBaseResponse {

}
