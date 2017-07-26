package def.electron.electron;
@jsweet.lang.Interface
public abstract class BrowserWindowOptions extends def.js.Object {
    /**
		 * Window’s width in pixels.
		 * Default: 800.
		 */
    @jsweet.lang.Optional
    public double width;
    /**
		 * Window’s height in pixels.
		 * Default: 600.
		 */
    @jsweet.lang.Optional
    public double height;
    /**
		 * Window’s left offset from screen.
		 * Default: center the window.
		 */
    @jsweet.lang.Optional
    public double x;
    /**
		 * Window’s top offset from screen.
		 * Default: center the window.
		 */
    @jsweet.lang.Optional
    public double y;
    /**
		 * The width and height would be used as web page’s size, which means
		 * the actual window’s size will include window frame’s size and be slightly larger.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean useContentSize;
    /**
		 * Show window in the center of the screen.
		 * Default: true
		 */
    @jsweet.lang.Optional
    public Boolean center;
    /**
		 * Window’s minimum width.
		 * Default: 0.
		 */
    @jsweet.lang.Optional
    public double minWidth;
    /**
		 * Window’s minimum height.
		 * Default: 0.
		 */
    @jsweet.lang.Optional
    public double minHeight;
    /**
		 * Window’s maximum width.
		 * Default: no limit.
		 */
    @jsweet.lang.Optional
    public double maxWidth;
    /**
		 * Window’s maximum height.
		 * Default: no limit.
		 */
    @jsweet.lang.Optional
    public double maxHeight;
    /**
		 * Whether window is resizable.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean resizable;
    /**
		 * Whether window is movable.
		 * Note: This is not implemented on Linux.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean movable;
    /**
		 * Whether window is minimizable.
		 * Note: This is not implemented on Linux.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean minimizable;
    /**
		 * Whether window is maximizable.
		 * Note: This is not implemented on Linux.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean maximizable;
    /**
		 * Whether window is closable.
		 * Note: This is not implemented on Linux.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean closable;
    /**
		 * Whether the window can be focused.
		 * On Windows setting focusable: false also implies setting skipTaskbar: true.
		 * On Linux setting focusable: false makes the window stop interacting with wm,
		 * so the window will always stay on top in all workspaces.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean focusable;
    /**
		 * Whether the window should always stay on top of other windows.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean alwaysOnTop;
    /**
		 * Whether the window should show in fullscreen.
		 * When explicitly set to false the fullscreen button will be hidden or disabled on macOS.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean fullscreen;
    /**
		 * Whether the window can be put into fullscreen mode.
		 * On macOS, also whether the maximize/zoom button should toggle full screen mode or maximize window.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean fullscreenable;
    /**
		 * Whether to show the window in taskbar.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean skipTaskbar;
    /**
		 * The kiosk mode.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean kiosk;
    /**
		 * Default window title.
		 * Default: "Electron".
		 */
    @jsweet.lang.Optional
    public String title;
    /**
		 * Whether window should be shown when created.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean show;
    /**
		 * Specify false to create a Frameless Window.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean frame;
    /**
		 * Specify parent window.
		 * Default: null.
		 */
    @jsweet.lang.Optional
    public BrowserWindow parent;
    /**
		 * Whether this is a modal window. This only works when the window is a child window.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean modal;
    /**
		 * Whether the web view accepts a single mouse-down event that simultaneously activates the window.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean acceptFirstMouse;
    /**
		 * Whether to hide cursor when typing.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean disableAutoHideCursor;
    /**
		 * Auto hide the menu bar unless the Alt key is pressed.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean autoHideMenuBar;
    /**
		 * Enable the window to be resized larger than screen.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean enableLargerThanScreen;
    /**
		 * Window’s background color as Hexadecimal value, like #66CD00 or #FFF or #80FFFFFF (alpha is supported).
		 * Default: #FFF (white).
		 */
    @jsweet.lang.Optional
    public String backgroundColor;
    /**
		 * Whether window should have a shadow.
		 * Note: This is only implemented on macOS.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean hasShadow;
    /**
		 * Forces using dark theme for the window.
		 * Note: Only works on some GTK+3 desktop environments.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean darkTheme;
    /**
		 * Makes the window transparent.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean transparent;
    /**
		 * Use WS_THICKFRAME style for frameless windows on Windows
		 */
    @jsweet.lang.Optional
    public Boolean thickFrame;
}

