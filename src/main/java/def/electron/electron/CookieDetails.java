package def.electron.electron;
@jsweet.lang.Interface
public abstract class CookieDetails extends def.js.Object {
    /**
		 * The URL associated with the cookie.
		 */
    public String url;
    /**
		 * The name of the cookie.
		 * Default: empty.
		 */
    @jsweet.lang.Optional
    public String name;
    /**
		 * The value of the cookie.
		 * Default: empty.
		 */
    @jsweet.lang.Optional
    public String value;
    /**
		 * The domain of the cookie.
		 * Default: empty.
		 */
    @jsweet.lang.Optional
    public String domain;
    /**
		 * The path of the cookie.
		 * Default: empty.
		 */
    @jsweet.lang.Optional
    public String path;
    /**
		 * Whether the cookie should be marked as secure.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean secure;
    /**
		 * Whether the cookie should be marked as HTTP only.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean httpOnly;
    /**
		 * The expiration date of the cookie as the number of seconds since the UNIX epoch.
		 * If omitted, the cookie becomes a session cookie.
		 */
    @jsweet.lang.Optional
    public double expirationDate;
}

