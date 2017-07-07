package def.electron.electron;
import def.js.Function;
@jsweet.lang.Interface
public abstract class Cookie extends def.js.Object {
    /**
		 * Emitted when a cookie is changed because it was added, edited, removed, or expired.
		 */
    native public Cookie on("changed" event, jsweet.util.function.TriConsumer<Event,Cookie,Object> listener);
    native public Cookie on(String event, Function listener);
    /**
		 * The name of the cookie.
		 */
    public String name;
    /**
		 * The value of the cookie.
		 */
    public String value;
    /**
		 * The domain of the cookie.
		 */
    public String domain;
    /**
		 * Whether the cookie is a host-only cookie.
		 */
    public String hostOnly;
    /**
		 * The path of the cookie.
		 */
    public String path;
    /**
		 * Whether the cookie is marked as secure.
		 */
    public Boolean secure;
    /**
		 * Whether the cookie is marked as HTTP only.
		 */
    public Boolean httpOnly;
    /**
		 * Whether the cookie is a session cookie or a persistent cookie with an expiration date.
		 */
    public Boolean session;
    /**
		 * The expiration date of the cookie as the number of seconds since the UNIX epoch.
		 * Not provided for session cookies.
		 */
    @jsweet.lang.Optional
    public double expirationDate;
}

