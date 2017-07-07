package def.electron.electron;
@jsweet.lang.Interface
public abstract class LoginItemSettings extends def.js.Object {
    /**
		 * True if the app is set to open at login.
		 */
    public Boolean openAtLogin;
    /**
		 * True if the app is set to open as hidden at login. This setting is only supported on macOS.
		 */
    public Boolean openAsHidden;
    /**
		 * True if the app was opened at login automatically. This setting is only supported on macOS.
		 */
    @jsweet.lang.Optional
    public Boolean wasOpenedAtLogin;
    /**
		 * True if the app was opened as a hidden login item. This indicates that the app should not
		 * open any windows at startup. This setting is only supported on macOS.
		 */
    @jsweet.lang.Optional
    public Boolean wasOpenedAsHidden;
    /**
		 * True if the app was opened as a login item that should restore the state from the previous session.
		 * This indicates that the app should restore the windows that were open the last time the app was closed.
		 * This setting is only supported on macOS.
		 */
    @jsweet.lang.Optional
    public Boolean restoreState;
}

