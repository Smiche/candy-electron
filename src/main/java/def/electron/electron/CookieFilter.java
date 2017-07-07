package def.electron.electron;
@jsweet.lang.Interface
public abstract class CookieFilter extends def.js.Object {
    /**
		 * Retrieves cookies which are associated with url. Empty implies retrieving cookies of all urls.
		 */
    @jsweet.lang.Optional
    public String url;
    /**
		 * Filters cookies by name.
		 */
    @jsweet.lang.Optional
    public String name;
    /**
		 * Retrieves cookies whose domains match or are subdomains of domains.
		 */
    @jsweet.lang.Optional
    public String domain;
    /**
		 * Retrieves cookies whose path matches path.
		 */
    @jsweet.lang.Optional
    public String path;
    /**
		 * Filters cookies by their Secure property.
		 */
    @jsweet.lang.Optional
    public Boolean secure;
    /**
		 * Filters out session or persistent cookies.
		 */
    @jsweet.lang.Optional
    public Boolean session;
}

