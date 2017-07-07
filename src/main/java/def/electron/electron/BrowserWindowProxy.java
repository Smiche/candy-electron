package def.electron.electron;
/**
	 * The BrowserWindowProxy object is returned from window.open and provides limited functionality with the child window.
	 */
@jsweet.lang.Interface
public abstract class BrowserWindowProxy extends def.js.Object {
    /**
		 * Removes focus from the child window.
		 */
    native public void blur();
    /**
		 * Forcefully closes the child window without calling its unload event.
		 */
    native public void close();
    /**
		 * Set to true after the child window gets closed.
		 */
    public Boolean closed;
    /**
		 * Evaluates the code in the child window.
		 */
    native public void eval(String code);
    /**
		 * Focuses the child window (brings the window to front).
		 */
    native public void focus();
    /**
		 * Sends a message to the child window with the specified origin or * for no origin preference.
		 * In addition to these methods, the child window implements window.opener object with no
		 * properties and a single method.
		 */
    native public void postMessage(String message, String targetOrigin);
    /**
		 * Invokes the print dialog on the child window.
		 */
    native public void print();
}

