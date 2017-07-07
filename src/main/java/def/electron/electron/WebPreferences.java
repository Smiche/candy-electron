package def.electron.electron;
@jsweet.lang.Interface
public abstract class WebPreferences extends def.js.Object {
    /**
		 * Whether to enable DevTools.
		 * If it is set to false, can not use BrowserWindow.webContents.openDevTools() to open DevTools.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean devTools;
    /**
		 * Whether node integration is enabled.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean nodeIntegration;
    /**
		 * Specifies a script that will be loaded before other scripts run in the page.
		 * This script will always have access to node APIs no matter whether node integration is turned on or off.
		 * The value should be the absolute file path to the script.
		 * When node integration is turned off, the preload script can reintroduce
		 * Node global symbols back to the global scope.
		 */
    @jsweet.lang.Optional
    public String preload;
    /**
		 * Sets the session used by the page. Instead of passing the Session object directly,
		 * you can also choose to use the partition option instead, which accepts a partition string.
		 * When both session and partition are provided, session would be preferred.
		 * Default: the default session.
		 */
    @jsweet.lang.Optional
    public Session session;
    /**
		 * Sets the session used by the page according to the session’s partition string.
		 * If partition starts with persist:, the page will use a persistent session available
		 * to all pages in the app with the same partition. if there is no persist: prefix,
		 * the page will use an in-memory session. By assigning the same partition,
		 * multiple pages can share the same session.
		 * Default: the default session.
		 */
    @jsweet.lang.Optional
    public String partition;
    /**
		 * The default zoom factor of the page, 3.0 represents 300%.
		 * Default: 1.0.
		 */
    @jsweet.lang.Optional
    public double zoomFactor;
    /**
		 * Enables JavaScript support.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean javascript;
    /**
		 * When setting false, it will disable the same-origin policy (Usually using testing
		 * websites by people), and set allowDisplayingInsecureContent and allowRunningInsecureContent
		 * to true if these two options are not set by user.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean webSecurity;
    /**
		 * Allow an https page to display content like images from http URLs.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean allowDisplayingInsecureContent;
    /**
		 * Allow a https page to run JavaScript, CSS or plugins from http URLs.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean allowRunningInsecureContent;
    /**
		 * Enables image support.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean images;
    /**
		 * Make TextArea elements resizable.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean textAreasAreResizable;
    /**
		 * Enables WebGL support.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean webgl;
    /**
		 * Enables WebAudio support.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean webaudio;
    /**
		 * Whether plugins should be enabled.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean plugins;
    /**
		 * Enables Chromium’s experimental features.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean experimentalFeatures;
    /**
		 * Enables Chromium’s experimental canvas features.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean experimentalCanvasFeatures;
    /**
		 * Enables DirectWrite font rendering system on Windows.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean directWrite;
    /**
		 * Enables scroll bounce (rubber banding) effect on macOS.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean scrollBounce;
    /**
		 * A list of feature strings separated by ",", like CSSVariables,KeyboardEventKey to enable.
		 */
    @jsweet.lang.Optional
    public String blinkFeatures;
    /**
		 * A list of feature strings separated by ",", like CSSVariables,KeyboardEventKey to disable.
		 */
    @jsweet.lang.Optional
    public String disableBlinkFeatures;
    /**
		 * Sets the default font for the font-family.
		 */
    @jsweet.lang.Optional
    public DefaultFontFamily defaultFontFamily;
    /**
		 * Default: 16.
		 */
    @jsweet.lang.Optional
    public double defaultFontSize;
    /**
		 * Default: 13.
		 */
    @jsweet.lang.Optional
    public double defaultMonospaceFontSize;
    /**
		 * Default: 0.
		 */
    @jsweet.lang.Optional
    public double minimumFontSize;
    /**
		 * Default: ISO-8859-1.
		 */
    @jsweet.lang.Optional
    public String defaultEncoding;
    /**
		 * Whether to throttle animations and timers when the page becomes background.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean backgroundThrottling;
    /**
		 * Whether to enable offscreen rendering for the browser window.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean offscreen;
    /**
		 * Whether to enable Chromium OS-level sandbox.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean sandbox;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class DefaultFontFamily extends def.js.Object {
        /**
			 * Default: Times New Roman.
			 */
        @jsweet.lang.Optional
        public String standard;
        /**
			 * Default: Times New Roman.
			 */
        @jsweet.lang.Optional
        public String serif;
        /**
			 * Default: Arial.
			 */
        @jsweet.lang.Optional
        public String sansSerif;
        /**
			 * Default: Courier New.
			 */
        @jsweet.lang.Optional
        public String monospace;
    }
}

