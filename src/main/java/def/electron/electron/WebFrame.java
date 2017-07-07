package def.electron.electron;
/**
	 * The web-frame module allows you to customize the rendering of the current web page.
	 */
@jsweet.lang.Interface
public abstract class WebFrame extends def.js.Object {
    /**
		 * Changes the zoom factor to the specified factor, zoom factor is
		 * zoom percent / 100, so 300% = 3.0.
		 */
    native public void setZoomFactor(double factor);
    /**
		 * @returns The current zoom factor.
		 */
    native public double getZoomFactor();
    /**
		 * Changes the zoom level to the specified level, 0 is "original size", and each
		 * increment above or below represents zooming 20% larger or smaller to default
		 * limits of 300% and 50% of original size, respectively.
		 */
    native public void setZoomLevel(double level);
    /**
		 * @returns The current zoom level.
		 */
    native public double getZoomLevel();
    /**
		 * Sets the maximum and minimum zoom level.
		 */
    native public void setVisualZoomLevelLimits(double minimumLevel, double maximumLevel);
    /**
		 * Sets the maximum and minimum layout-based (i.e. non-visual) zoom level.
		 */
    native public void setLayoutZoomLevelLimits(double minimumLevel, double maximumLevel);
    /**
		 * Sets a provider for spell checking in input fields and text areas.
		 */
    native public void setSpellCheckProvider(String language, Boolean autoCorrectWord, Provider provider);
    /**
		 * Sets the scheme as secure scheme. Secure schemes do not trigger mixed content
		 * warnings. For example, https and data are secure schemes because they cannot be
		 * corrupted by active network attackers.
		 */
    native public void registerURLSchemeAsSecure(String scheme);
    /**
		 * Resources will be loaded from this scheme regardless of the current page’s Content Security Policy.
		 */
    native public void registerURLSchemeAsBypassingCSP(String scheme);
    /**
		 * Registers the scheme as secure, bypasses content security policy for resources,
		 * allows registering ServiceWorker and supports fetch API.
		 */
    native public void registerURLSchemeAsPrivileged(String scheme, RegisterURLSchemeOptions options);
    /**
		 * Inserts text to the focused element.
		 */
    native public void insertText(String text);
    /**
		 * Evaluates `code` in page.
		 * In the browser window some HTML APIs like `requestFullScreen` can only be
		 * invoked by a gesture from the user. Setting `userGesture` to `true` will remove
		 * this limitation.
		 *
		 * @returns Promise
		 */
    native public Promise<?> executeJavaScript(String code, Boolean userGesture, java.util.function.Consumer<Object> callback);
    /**
		 * @returns Object describing usage information of Blink’s internal memory caches.
		 */
    native public ResourceUsages getResourceUsage();
    /**
		 * Attempts to free memory that is no longer being used (like images from a previous navigation).
		 */
    native public void clearCache();
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Provider extends def.js.Object {
        /**
			 * @returns Whether the word passed is correctly spelled.
			 */
        public java.util.function.Function<String,Boolean> spellCheck;
    }
    /**
		 * Registers the scheme as secure, bypasses content security policy for resources,
		 * allows registering ServiceWorker and supports fetch API.
		 */
    native public void registerURLSchemeAsPrivileged(String scheme);
    /**
		 * Evaluates `code` in page.
		 * In the browser window some HTML APIs like `requestFullScreen` can only be
		 * invoked by a gesture from the user. Setting `userGesture` to `true` will remove
		 * this limitation.
		 *
		 * @returns Promise
		 */
    native public Promise<?> executeJavaScript(String code, Boolean userGesture);
    /**
		 * Evaluates `code` in page.
		 * In the browser window some HTML APIs like `requestFullScreen` can only be
		 * invoked by a gesture from the user. Setting `userGesture` to `true` will remove
		 * this limitation.
		 *
		 * @returns Promise
		 */
    native public Promise<?> executeJavaScript(String code);
}

