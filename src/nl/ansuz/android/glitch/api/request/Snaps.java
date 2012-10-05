package nl.ansuz.android.glitch.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.HashMap;

import android.util.Log;

import com.tinyspeck.android.Glitch;
import com.tinyspeck.android.GlitchRequest;

/**
 * Contains all request strings for Snaps.
 * 
 * @author Wijnand
 */
public class Snaps {

	/**
	 * Simple listing of Snaps request methods.
	 * 
	 * @author Wijnand
	 */
	public class Method {
		public static final String COMMENT = "snaps.comment";
		public static final String DELETE_COMMENT = "snaps.deleteComment";
		public static final String DETAIL = "snaps.detail";
		public static final String GET_FOR_LOCATION = "snaps.getForLocation";
		public static final String GET_RECENT = "snaps.getRecent";
		public static final String GET_RECENT_FOR_PLAYER = "snaps.getRecentForPlayer";
		public static final String LIKE = "snaps.like";
		public static final String UNLIKE = "snaps.unlike";
	}

	/**
	 * Simple listing of Snaps request parameters.
	 * 
	 * @author Wijnand
	 */
	public class Parameter {
		public static final String OWNER_TSID = "owner_tsid";
		public static final String SNAP_ID = "snap_id";
		public static final String COMMENT = "comment";
		public static final String COMMENT_ID = "comment_id";
		public static final String SECRET = "secret";
		public static final String LOCATION_TSID = "location_tsid";
		public static final String PAGE = "page";
		public static final String PER_PAGE = "per_page";
		public static final String COUNT = "count";
	}

	private static final String LOG_TAG = "Snaps";

	/**
	 * Generic Snaps request generator.
	 * 
	 * @param glitch
	 *            Reference to the instance of the Glitch API object.
	 * @param method
	 *            The Skills method to invoke.
	 * @param parameters
	 *            The parameters to send with the API request.
	 */
	private static GlitchRequest createGenericSnapsRequest(Glitch glitch,
			String method, HashMap<String, String> parameters) {
		return new GlitchRequest(method, parameters, glitch);
	}

	/**
	 * Creates a GlitchRequest object to add a comment to a snapshot as the
	 * currently-authenticated player.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!snaps.comment
	 * @see createGenericSnapsRequest(glitch, method, parameters)
	 * 
	 * @param ownerTsid
	 *            TSID of the snapshot owner.
	 * @param snapId
	 *            ID of the snapshot.
	 * @param comment
	 *            Text of the comment to post.
	 */
	public static GlitchRequest createCommentRequest(Glitch glitch,
			String ownerTsid, String snapId, String comment) {
		
		try {
			comment = URLEncoder.encode(comment, Charset.defaultCharset().name());
		} catch (UnsupportedEncodingException e) {
			Log.e(LOG_TAG, "Error encoding the comment.", e);
		}
		
		HashMap<String, String> params = new HashMap<String, String>();
		params.put(Parameter.OWNER_TSID, ownerTsid);
		params.put(Parameter.SNAP_ID, snapId);
		params.put(Parameter.COMMENT, comment);

		return createGenericSnapsRequest(glitch, Method.COMMENT, params);
	}

	/**
	 * Creates a GlitchRequest object to remove a comment from a snapshot.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!snaps.deleteComment
	 * @see createGenericSnapsRequest(glitch, method, parameters)
	 * 
	 * @param ownerTsid
	 *            TSID of the snapshot owner.
	 * @param snapId
	 *            ID of the snapshot.
	 * @param commentId
	 *            ID of the comment to delete.
	 */
	public static GlitchRequest createDeleteCommentRequest(Glitch glitch,
			String ownerTsid, String snapId, String commentId) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put(Parameter.OWNER_TSID, ownerTsid);
		params.put(Parameter.SNAP_ID, snapId);
		params.put(Parameter.COMMENT_ID, commentId);

		return createGenericSnapsRequest(glitch, Method.DELETE_COMMENT, params);
	}

	/**
	 * Creates a GlitchRequest object to retrieve details about a snapshot.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!snaps.deleteComment
	 * @see createGenericSnapsRequest(glitch, method, parameters)
	 * 
	 * @param ownerTsid
	 *            TSID of the snapshot owner.
	 * @param snapId
	 *            ID of the snapshot.
	 * @param secret
	 *            The snapshot's secret.
	 */
	public static GlitchRequest createDetailRequest(Glitch glitch,
			String ownerTsid, String snapId, String secret) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put(Parameter.OWNER_TSID, ownerTsid);
		params.put(Parameter.SNAP_ID, snapId);
		params.put(Parameter.SECRET, secret);

		return createGenericSnapsRequest(glitch, Method.DETAIL, params);
	}

	/**
	 * Creates a GlitchRequest object to retrieve snaps for a particular
	 * location.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!snaps.getForLocation
	 * @see createGenericSnapsRequest(glitch, method, parameters)
	 * 
	 * @param locationTsid
	 *            TSID of the location to fetch snaps for.
	 * @param page
	 *            (optional, default 1) - The page of results to return.
	 * @param perPage
	 *            (optional, default 10) - Number of results to return per page.
	 */
	public static GlitchRequest createGetForLocationRequest(Glitch glitch,
			String locationTsid, int page, int perPage) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put(Parameter.LOCATION_TSID, locationTsid);
		if (page > 0) {
			params.put(Parameter.PAGE, "" + page);
		}
		if (perPage > 0) {
			params.put(Parameter.PER_PAGE, "" + perPage);
		}

		return createGenericSnapsRequest(glitch, Method.GET_FOR_LOCATION,
				params);
	}

	/**
	 * @see createGetForLocationRequest(glitch, locationTsid, page, perPage)
	 */
	public static GlitchRequest createGetForLocationRequest(Glitch glitch,
			String locationTsid) {
		return createGetForLocationRequest(glitch, locationTsid, -1, -1);
	}

	/**
	 * Creates a GlitchRequest object to retrieve the latest snaps from
	 * everyone.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!snaps.getRecent
	 * @see createGenericSnapsRequest(glitch, method, parameters)
	 * 
	 * @param page
	 *            (optional, default 1) - The page of results to return.
	 * @param perPage
	 *            (optional, default 10) - Number of results to return per page.
	 */
	public static GlitchRequest createGetRecentRequest(Glitch glitch, int page,
			int perPage) {
		HashMap<String, String> params = new HashMap<String, String>();
		if (page > 0) {
			params.put(Parameter.PAGE, "" + page);
		}
		if (perPage > 0) {
			params.put(Parameter.PER_PAGE, "" + perPage);
		}

		return createGenericSnapsRequest(glitch, Method.GET_RECENT, params);
	}

	/**
	 * @see createGetRecentRequest(glitch, page, perPage)
	 */
	public static GlitchRequest createGetRecentRequest(Glitch glitch) {
		return createGetRecentRequest(glitch, -1, -1);
	}

	/**
	 * Creates a GlitchRequest object to retrieve the latest snaps from a
	 * player.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!snaps.getRecentForPlayer
	 * @see createGenericSnapsRequest(glitch, method, parameters)
	 * 
	 * @param ownerTsid
	 *            TSID of the player who owns the snapshots.
	 * @param count
	 *            (optional, default 10) - The number of recent snapshots to
	 *            return.
	 */
	public static GlitchRequest createGetRecentForPlayerRequest(Glitch glitch,
			String ownerTsid, int count) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put(Parameter.OWNER_TSID, ownerTsid);
		if (count > 0) {
			params.put(Parameter.COUNT, "" + count);
		}

		return createGenericSnapsRequest(glitch, Method.GET_RECENT_FOR_PLAYER,
				params);
	}

	/**
	 * @see createGetRecentForPlayerRequest(Glitch glitch, String ownerTsid, int
	 *      count)
	 */
	public static GlitchRequest createGetRecentForPlayerRequest(Glitch glitch,
			String ownerTsid) {
		return createGetRecentForPlayerRequest(glitch, ownerTsid, -1);
	}

	/**
	 * Creates a GlitchRequest object to mark a snap as "liked" by the
	 * currently-authenticated player.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!snaps.like
	 * @see createGenericSnapsRequest(glitch, method, parameters)
	 * 
	 * @param ownerTsid
	 *            TSID of the player who owns the snapshots.
	 * @param snapId
	 *            ID of the snapshot.
	 */
	public static GlitchRequest createLikeRequest(Glitch glitch,
			String ownerTsid, String snapId) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put(Parameter.OWNER_TSID, ownerTsid);
		params.put(Parameter.SNAP_ID, snapId);

		return createGenericSnapsRequest(glitch, Method.LIKE, params);
	}

	/**
	 * Creates a GlitchRequest object to remove a "like" of the snap for the
	 * currently-authenticated player.
	 * 
	 * @see http://developer.glitch.com/api/explore/#!snaps.unlike
	 * @see createGenericSnapsRequest(glitch, method, parameters)
	 * 
	 * @param ownerTsid
	 *            TSID of the player who owns the snapshots.
	 * @param snapId
	 *            ID of the snapshot.
	 */
	public static GlitchRequest createUnlikeRequest(Glitch glitch,
			String ownerTsid, String snapId) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put(Parameter.OWNER_TSID, ownerTsid);
		params.put(Parameter.SNAP_ID, snapId);

		return createGenericSnapsRequest(glitch, Method.UNLIKE, params);
	}
}
