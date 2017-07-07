package def.electron;
@jsweet.lang.Interface
@jsweet.lang.Mixin(target=def.dom.Window.class)
public abstract class Window extends def.dom.Window {
    /**
	 * Creates a new window.
	 */
    native public def.electron.electron.BrowserWindowProxy open(String url, String frameName, String features);
    /**
	 * Creates a new window.
	 */
    native public def.electron.electron.BrowserWindowProxy open(String url, String frameName);
    /**
	 * Creates a new window.
	 */
    native public def.electron.electron.BrowserWindowProxy open(String url);
}

