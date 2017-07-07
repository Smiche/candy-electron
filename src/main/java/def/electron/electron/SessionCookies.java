package def.electron.electron;
import def.js.Error;
@jsweet.lang.Interface
public abstract class SessionCookies extends def.js.Object {
    /**
		 * Sends a request to get all cookies matching filter.
		 */
    native public void get(CookieFilter filter, java.util.function.BiConsumer<Error,Cookie[]> callback);
    /**
		 * Sets the cookie with details.
		 */
    native public void set(CookieDetails details, java.util.function.Consumer<Error> callback);
    /**
		 * Removes the cookies matching url and name.
		 */
    native public void remove(String url, String name, java.util.function.Consumer<Error> callback);
}

