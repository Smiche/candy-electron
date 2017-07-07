package def.electron.electron;
@jsweet.lang.Interface
public abstract class WebContentsStatic extends def.js.Object {
    /**
		 * @returns An array of all WebContents instances. This will contain web contents for all windows,
		 * webviews, opened devtools, and devtools extension background pages.
		 */
    native public WebContents[] getAllWebContents();
    /**
		 * @returns The web contents that is focused in this application, otherwise returns null.
		 */
    native public WebContents getFocusedWebContents();
    /**
		 * Find a WebContents instance according to its ID.
		 */
    native public WebContents fromId(double id);
}

