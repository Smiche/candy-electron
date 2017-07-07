package def.electron.electron;
import def.js.Function;
/**
	 * The BrowserWindow class gives you ability to create a browser window.
	 * You can also create a window without chrome by using Frameless Window API.
	 */
@jsweet.lang.Extends({Destroyable.class})
public class BrowserWindow extends def.js.Object {
    /**
		 * Emitted when the document changed its title,
		 * calling event.preventDefault() would prevent the native window’s title to change.
		 */
    native public BrowserWindow on(def.electron.StringTypes.page_title_updated event, java.util.function.BiConsumer<Event,String> listener);
    /**
		 * Emitted when the window is going to be closed. It’s emitted before the beforeunload
		 * and unload event of the DOM. Calling event.preventDefault() will cancel the close.
		 */
    native public BrowserWindow on(def.electron.StringTypes.close event, java.util.function.Consumer<Event> listener);
    /**
		 * Emitted when the window is closed. After you have received this event
		 * you should remove the reference to the window and avoid using it anymore.
		 */
    native public BrowserWindow on(def.electron.StringTypes.closed event, Function listener);
    /**
		 * Emitted when the web page becomes unresponsive.
		 */
    native public BrowserWindow on(def.electron.StringTypes.unresponsive event, Function listener);
    /**
		 * Emitted when the unresponsive web page becomes responsive again.
		 */
    native public BrowserWindow on(def.electron.StringTypes.responsive event, Function listener);
    /**
		 * Emitted when the window loses focus.
		 */
    native public BrowserWindow on(def.electron.StringTypes.blur event, Function listener);
    /**
		 * Emitted when the window gains focus.
		 */
    native public BrowserWindow on(def.electron.StringTypes.focus event, Function listener);
    /**
		 * Emitted when the window is shown.
		 */
    native public BrowserWindow on(def.electron.StringTypes.show event, Function listener);
    /**
		 * Emitted when the window is hidden.
		 */
    native public BrowserWindow on(def.electron.StringTypes.hide event, Function listener);
    /**
		 * Emitted when the web page has been rendered and window can be displayed without visual flash.
		 */
    native public BrowserWindow on(def.electron.StringTypes.ready_to_show event, Function listener);
    /**
		 * Emitted when window is maximized.
		 */
    native public BrowserWindow on(def.electron.StringTypes.maximize event, Function listener);
    /**
		 * Emitted when the window exits from maximized state.
		 */
    native public BrowserWindow on(def.electron.StringTypes.unmaximize event, Function listener);
    /**
		 * Emitted when the window is minimized.
		 */
    native public BrowserWindow on(def.electron.StringTypes.minimize event, Function listener);
    /**
		 * Emitted when the window is restored from minimized state.
		 */
    native public BrowserWindow on(def.electron.StringTypes.restore event, Function listener);
    /**
		 * Emitted when the window is getting resized.
		 */
    native public BrowserWindow on(def.electron.StringTypes.resize event, Function listener);
    /**
		 * Emitted when the window is getting moved to a new position.
		 */
    native public BrowserWindow on(def.electron.StringTypes.move event, Function listener);
    /**
		 * Emitted when the window enters full screen state.
		 */
    native public BrowserWindow on(def.electron.StringTypes.enter_full_screen event, Function listener);
    /**
		 * Emitted when the window leaves full screen state.
		 */
    native public BrowserWindow on(def.electron.StringTypes.leave_full_screen event, Function listener);
    /**
		 * Emitted when the window enters full screen state triggered by HTML API.
		 */
    native public BrowserWindow on(def.electron.StringTypes.enter_html_full_screen event, Function listener);
    /**
		 * Emitted when the window leaves full screen state triggered by HTML API.
		 */
    native public BrowserWindow on(def.electron.StringTypes.leave_html_full_screen event, Function listener);
    /**
		 * Emitted when an App Command is invoked. These are typically related
		 * to keyboard media keys or browser commands, as well as the "Back" /
		 * "Forward" buttons built into some mice on Windows.
		 * Note: This is only implemented on Windows.
		 */
    native public BrowserWindow on(def.electron.StringTypes.app_command event, java.util.function.BiConsumer<Event,String> listener);
    /**
		 * Emitted when scroll wheel event phase has begun.
		 * Note: This is only implemented on macOS.
		 */
    native public BrowserWindow on(def.electron.StringTypes.scroll_touch_begin event, Function listener);
    /**
		 * Emitted when scroll wheel event phase has ended.
		 * Note: This is only implemented on macOS.
		 */
    native public BrowserWindow on(def.electron.StringTypes.scroll_touch_end event, Function listener);
    /**
		 * Emitted when scroll wheel event phase filed upon reaching the edge of element.
		 * Note: This is only implemented on macOS.
		 */
    native public BrowserWindow on(def.electron.StringTypes.scroll_touch_edge event, Function listener);
    /**
		 * Emitted on 3-finger swipe.
		 * Note: This is only implemented on macOS.
		 */
    native public BrowserWindow on(def.electron.StringTypes.swipe event, java.util.function.BiConsumer<Event,Object> listener);
    native public BrowserWindow on(String event, Function listener);
    /**
		 * Creates a new BrowserWindow with native properties as set by the options.
		 */
    public BrowserWindow(BrowserWindowOptions options){}
    /**
		 * @returns All opened browser windows.
		 */
    native public static BrowserWindow[] getAllWindows();
    /**
		 * @returns The window that is focused in this application.
		 */
    native public static BrowserWindow getFocusedWindow();
    /**
		 * Find a window according to the webContents it owns.
		 */
    native public static BrowserWindow fromWebContents(WebContents webContents);
    /**
		 * Find a window according to its ID.
		 */
    native public static BrowserWindow fromId(double id);
    /**
		 * Adds devtools extension located at path. The extension will be remembered
		 * so you only need to call this API once, this API is not for programming use.
		 * @returns The extension's name.
		 *
		 * Note: This API cannot be called before the ready event of the app module is emitted.
		 */
    native public static String addDevToolsExtension(String path);
    /**
		 * Remove a devtools extension.
		 * @param name The name of the devtools extension to remove.
		 *
		 * Note: This API cannot be called before the ready event of the app module is emitted.
		 */
    native public static void removeDevToolsExtension(String name);
    /**
		 * @returns devtools extensions.
		 *
		 * Note: This API cannot be called before the ready event of the app module is emitted.
		 */
    native public static DevToolsExtensions getDevToolsExtensions();
    /**
		 * The WebContents object this window owns, all web page related events and
		 * operations would be done via it.
		 * Note: Users should never store this object because it may become null when
		 * the renderer process (web page) has crashed.
		 */
    public WebContents webContents;
    /**
		 * Get the unique ID of this window.
		 */
    public double id;
    /**
		 * Try to close the window, this has the same effect with user manually clicking
		 * the close button of the window. The web page may cancel the close though,
		 * see the close event.
		 */
    native public void close();
    /**
		 * Focus on the window.
		 */
    native public void focus();
    /**
		 * Remove focus on the window.
		 */
    native public void blur();
    /**
		 * @returns Whether the window is focused.
		 */
    native public Boolean isFocused();
    /**
		 * Shows and gives focus to the window.
		 */
    native public void show();
    /**
		 * Shows the window but doesn't focus on it.
		 */
    native public void showInactive();
    /**
		 * Hides the window.
		 */
    native public void hide();
    /**
		 * @returns Whether the window is visible to the user.
		 */
    native public Boolean isVisible();
    /**
		 * @returns Whether the window is a modal window.
		 */
    native public Boolean isModal();
    /**
		 * Maximizes the window.
		 */
    native public void maximize();
    /**
		 * Unmaximizes the window.
		 */
    native public void unmaximize();
    /**
		 * @returns Whether the window is maximized.
		 */
    native public Boolean isMaximized();
    /**
		 * Minimizes the window. On some platforms the minimized window will be
		 * shown in the Dock.
		 */
    native public void minimize();
    /**
		 * Restores the window from minimized state to its previous state.
		 */
    native public void restore();
    /**
		 * @returns Whether the window is minimized.
		 */
    native public Boolean isMinimized();
    /**
		 * Sets whether the window should be in fullscreen mode.
		 */
    native public void setFullScreen(Boolean flag);
    /**
		 * @returns Whether the window is in fullscreen mode.
		 */
    native public Boolean isFullScreen();
    /**
		 * This will have a window maintain an aspect ratio.
		 * The extra size allows a developer to have space, specified in pixels,
		 * not included within the aspect ratio calculations.
		 * This API already takes into account the difference between a window’s size and its content size.
		 *
		 * Note: This API is available only on macOS.
		 */
    native public void setAspectRatio(double aspectRatio, SizeData extraSize);
    /**
		 * Uses Quick Look to preview a file at a given path.
		 *
		 * @param path The absolute path to the file to preview with QuickLook.
		 * @param displayName The name of the file to display on the Quick Look modal view.
		 * Note: This API is available only on macOS.
		 */
    native public void previewFile(String path, String displayName);
    /**
		 * Resizes and moves the window to width, height, x, y.
		 */
    native public void setBounds(RectangleData options, Boolean animate);
    /**
		 * @returns The window's width, height, x and y values.
		 */
    native public RectangleData getBounds();
    /**
		 * Resizes and moves the window's client area (e.g. the web page) to width, height, x, y.
		 */
    native public void setContentBounds(RectangleData options, Boolean animate);
    /**
		 * @returns The window's client area (e.g. the web page) width, height, x and y values.
		 */
    native public RectangleData getContentBounds();
    /**
		 * Resizes the window to width and height.
		 */
    native public void setSize(double width, double height, Boolean animate);
    /**
		 * @returns The window's width and height.
		 */
    native public double[] getSize();
    /**
		 * Resizes the window's client area (e.g. the web page) to width and height.
		 */
    native public void setContentSize(double width, double height, Boolean animate);
    /**
		 * @returns The window's client area's width and height.
		 */
    native public double[] getContentSize();
    /**
		 * Sets the minimum size of window to width and height.
		 */
    native public void setMinimumSize(double width, double height);
    /**
		 * @returns The window's minimum width and height.
		 */
    native public double[] getMinimumSize();
    /**
		 * Sets the maximum size of window to width and height.
		 */
    native public void setMaximumSize(double width, double height);
    /**
		 * @returns The window's maximum width and height.
		 */
    native public double[] getMaximumSize();
    /**
		 * Sets whether the window can be manually resized by user.
		 */
    native public void setResizable(Boolean resizable);
    /**
		 * @returns Whether the window can be manually resized by user.
		 */
    native public Boolean isResizable();
    /**
		 * Sets whether the window can be moved by user. On Linux does nothing.
		 * Note: This API is available only on macOS and Windows.
		 */
    native public void setMovable(Boolean movable);
    /**
		 * Note: This API is available only on macOS and Windows.
		 * @returns Whether the window can be moved by user. On Linux always returns true.
		 */
    native public Boolean isMovable();
    /**
		 * Sets whether the window can be manually minimized by user. On Linux does nothing.
		 * Note: This API is available only on macOS and Windows.
		 */
    native public void setMinimizable(Boolean minimizable);
    /**
		 * Note: This API is available only on macOS and Windows.
		 * @returns Whether the window can be manually minimized by user. On Linux always returns true.
		 */
    native public Boolean isMinimizable();
    /**
		 * Sets whether the window can be manually maximized by user. On Linux does nothing.
		 * Note: This API is available only on macOS and Windows.
		 */
    native public void setMaximizable(Boolean maximizable);
    /**
		 * Note: This API is available only on macOS and Windows.
		 * @returns Whether the window can be manually maximized by user. On Linux always returns true.
		 */
    native public Boolean isMaximizable();
    /**
		 * Sets whether the maximize/zoom window button toggles fullscreen mode or maximizes the window.
		 */
    native public void setFullScreenable(Boolean fullscreenable);
    /**
		 * @returns Whether the maximize/zoom window button toggles fullscreen mode or maximizes the window.
		 */
    native public Boolean isFullScreenable();
    /**
		 * Sets whether the window can be manually closed by user. On Linux does nothing.
		 * Note: This API is available only on macOS and Windows.
		 */
    native public void setClosable(Boolean closable);
    /**
		 * Note: This API is available only on macOS and Windows.
		 * @returns Whether the window can be manually closed by user. On Linux always returns true.
		 */
    native public Boolean isClosable();
    /**
		 * Sets whether the window should show always on top of other windows. After
		 * setting this, the window is still a normal window, not a toolbox window
		 * which can not be focused on.
		 */
    native public void setAlwaysOnTop(Boolean flag, Object level);
    /**
		 * @returns Whether the window is always on top of other windows.
		 */
    native public Boolean isAlwaysOnTop();
    /**
		 * Moves window to the center of the screen.
		 */
    native public void center();
    /**
		 * Moves window to x and y.
		 */
    native public void setPosition(double x, double y, Boolean animate);
    /**
		 * @returns The window's current position.
		 */
    native public double[] getPosition();
    /**
		 * Changes the title of native window to title.
		 */
    native public void setTitle(String title);
    /**
		 * Note: The title of web page can be different from the title of the native window.
		 * @returns The title of the native window.
		 */
    native public String getTitle();
    /**
		 * Changes the attachment point for sheets on macOS.
		 * Note: This API is available only on macOS.
		 */
    native public void setSheetOffset(double offsetY, double offsetX);
    /**
		 * Starts or stops flashing the window to attract user's attention.
		 */
    native public void flashFrame(Boolean flag);
    /**
		 * Makes the window do not show in Taskbar.
		 */
    native public void setSkipTaskbar(Boolean skip);
    /**
		 * Enters or leaves the kiosk mode.
		 */
    native public void setKiosk(Boolean flag);
    /**
		 * @returns Whether the window is in kiosk mode.
		 */
    native public Boolean isKiosk();
    /**
		 * The native type of the handle is HWND on Windows, NSView* on macOS,
		 * and Window (unsigned long) on Linux.
		 * @returns The platform-specific handle of the window as Buffer.
		 */
    native public Buffer getNativeWindowHandle();
    /**
		 * Hooks a windows message. The callback is called when the message is received in the WndProc.
		 * Note: This API is available only on Windows.
		 */
    native public void hookWindowMessage(double message, Function callback);
    /**
		 * @returns Whether the message is hooked.
		 */
    native public Boolean isWindowMessageHooked(double message);
    /**
		 * Unhook the window message.
		 */
    native public void unhookWindowMessage(double message);
    /**
		 * Unhooks all of the window messages.
		 */
    native public void unhookAllWindowMessages();
    /**
		 * Sets the pathname of the file the window represents, and the icon of the
		 * file will show in window's title bar.
		 * Note: This API is available only on macOS.
		 */
    native public void setRepresentedFilename(String filename);
    /**
		 * Note: This API is available only on macOS.
		 * @returns The pathname of the file the window represents.
		 */
    native public String getRepresentedFilename();
    /**
		 * Specifies whether the window’s document has been edited, and the icon in
		 * title bar will become grey when set to true.
		 * Note: This API is available only on macOS.
		 */
    native public void setDocumentEdited(Boolean edited);
    /**
		 * Note: This API is available only on macOS.
		 * @returns Whether the window's document has been edited.
		 */
    native public Boolean isDocumentEdited();
    native public void focusOnWebView();
    native public void blurWebView();
    /**
		 * Captures the snapshot of page within rect, upon completion the callback
		 * will be called. Omitting the rect would capture the whole visible page.
		 * Note: Be sure to read documents on remote buffer in remote if you are going
		 * to use this API in renderer process.
		 * @param callback Supplies the image that stores data of the snapshot.
		 */
    native public void capturePage(RectangleData rect, java.util.function.Consumer<NativeImage> callback);
    /**
		 * Captures the snapshot of page within rect, upon completion the callback
		 * will be called. Omitting the rect would capture the whole visible page.
		 * Note: Be sure to read documents on remote buffer in remote if you are going
		 * to use this API in renderer process.
		 * @param callback Supplies the image that stores data of the snapshot.
		 */
    native public void capturePage(java.util.function.Consumer<NativeImage> callback);
    /**
		 * Same as webContents.loadURL(url).
		 */
    native public void loadURL(String url, LoadURLOptions options);
    /**
		 * Same as webContents.reload.
		 */
    native public void reload();
    /**
		 * Sets the menu as the window top menu.
		 * Note: This API is not available on macOS.
		 */
    native public void setMenu(Menu menu);
    /**
		 * Sets the progress value in the progress bar.
		 * On Linux platform, only supports Unity desktop environment, you need to
		 * specify the *.desktop file name to desktopName field in package.json.
		 * By default, it will assume app.getName().desktop.
		 * @param progress Valid range is [0, 1.0]. If < 0, the progress bar is removed.
		 * If greater than 0, it becomes indeterminate.
		 */
    native public void setProgressBar(double progress, Options options);
    /**
		 * Sets a 16px overlay onto the current Taskbar icon, usually used to convey
		 * some sort of application status or to passively notify the user.
		 * Note: This API is only available on Windows 7 or above.
		 * @param overlay The icon to display on the bottom right corner of the Taskbar
		 * icon. If this parameter is null, the overlay is cleared
		 * @param description Provided to Accessibility screen readers.
		 */
    native public void setOverlayIcon(NativeImage overlay, String description);
    /**
		 * Sets whether the window should have a shadow. On Windows and Linux does nothing.
		 * Note: This API is available only on macOS.
		 */
    native public void setHasShadow(Boolean hasShadow);
    /**
		 * Note: This API is available only on macOS.
		 * @returns whether the window has a shadow. On Windows and Linux always returns true.
		 */
    native public Boolean hasShadow();
    /**
		 * Add a thumbnail toolbar with a specified set of buttons to the thumbnail image
		 * of a window in a taskbar button layout.
		 * @returns Whether the thumbnail has been added successfully.
		 *
		 * Note: This API is available only on Windows.
		 */
    native public Boolean setThumbarButtons(ThumbarButton[] buttons);
    /**
		 * Sets the region of the window to show as the thumbnail image displayed when hovering
		 * over the window in the taskbar. You can reset the thumbnail to be the entire window
		 * by specifying an empty region: {x: 0, y: 0, width: 0, height: 0}.
		 *
		 * Note: This API is available only on Windows.
		 */
    native public Boolean setThumbnailClip(RectangleData region);
    /**
		 * Sets the toolTip that is displayed when hovering over the window thumbnail in the taskbar.
		 * Note: This API is available only on Windows.
		 */
    native public Boolean setThumbnailToolTip(String toolTip);
    /**
		 * Same as webContents.showDefinitionForSelection().
		 * Note: This API is available only on macOS.
		 */
    native public void showDefinitionForSelection();
    /**
		 * Changes window icon.
		 * Note: This API is not available on macOS.
		 */
    native public void setIcon(NativeImage icon);
    /**
		 * Sets whether the window menu bar should hide itself automatically. Once set
		 * the menu bar will only show when users press the single Alt key.
		 * If the menu bar is already visible, calling setAutoHideMenuBar(true) won't
		 * hide it immediately.
		 */
    native public void setAutoHideMenuBar(Boolean hide);
    /**
		 * @returns Whether menu bar automatically hides itself.
		 */
    native public Boolean isMenuBarAutoHide();
    /**
		 * Sets whether the menu bar should be visible. If the menu bar is auto-hide,
		 * users can still bring up the menu bar by pressing the single Alt key.
		 */
    native public void setMenuBarVisibility(Boolean visibile);
    /**
		 * @returns Whether the menu bar is visible.
		 */
    native public Boolean isMenuBarVisible();
    /**
		 * Sets whether the window should be visible on all workspaces.
		 * Note: This API does nothing on Windows.
		 */
    native public void setVisibleOnAllWorkspaces(Boolean visible);
    /**
		 * Note: This API always returns false on Windows.
		 * @returns Whether the window is visible on all workspaces.
		 */
    native public Boolean isVisibleOnAllWorkspaces();
    /**
		 * Makes the window ignore all mouse events.
		 *
		 * All mouse events happened in this window will be passed to the window below this window,
		 * but if this window has focus, it will still receive keyboard events.
		 */
    native public void setIgnoreMouseEvents(Boolean ignore);
    /**
		 * Prevents the window contents from being captured by other apps.
		 *
		 * On macOS it sets the NSWindow's sharingType to NSWindowSharingNone.
		 * On Windows it calls SetWindowDisplayAffinity with WDA_MONITOR.
		 */
    native public void setContentProtection(Boolean enable);
    /**
		 * Changes whether the window can be focused.
		 * Note: This API is available only on Windows.
		 */
    native public void setFocusable(Boolean focusable);
    /**
		 * Sets parent as current window's parent window,
		 * passing null will turn current window into a top-level window.
		 * Note: This API is not available on Windows.
		 */
    native public void setParentWindow(BrowserWindow parent);
    /**
		 * @returns The parent window.
		 */
    native public BrowserWindow getParentWindow();
    /**
		 * @returns All child windows.
		 */
    native public BrowserWindow[] getChildWindows();
    /**
		 * Adds a vibrancy effect to the browser window. Passing null or
		 * an empty string will remove the vibrancy effect on the window.
		 *
		 * Note: This API is available only on macOS.
		 */
    native public void setVibrancy(Object type);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        /**
			 * Mode for the progress bar.
			 * Note: This is only implemented on Windows.
			 */
        public Object mode;
    }
    /**
		 * Destroys the object.
		 */
    native public void destroy();
    /**
		 * @returns Whether the object is destroyed.
		 */
    native public Boolean isDestroyed();
    /**
		 * Creates a new BrowserWindow with native properties as set by the options.
		 */
    public BrowserWindow(){}
    /**
		 * This will have a window maintain an aspect ratio.
		 * The extra size allows a developer to have space, specified in pixels,
		 * not included within the aspect ratio calculations.
		 * This API already takes into account the difference between a window’s size and its content size.
		 *
		 * Note: This API is available only on macOS.
		 */
    native public void setAspectRatio(double aspectRatio);
    /**
		 * Uses Quick Look to preview a file at a given path.
		 *
		 * @param path The absolute path to the file to preview with QuickLook.
		 * @param displayName The name of the file to display on the Quick Look modal view.
		 * Note: This API is available only on macOS.
		 */
    native public void previewFile(String path);
    /**
		 * Resizes and moves the window to width, height, x, y.
		 */
    native public void setBounds(RectangleData options);
    /**
		 * Resizes and moves the window's client area (e.g. the web page) to width, height, x, y.
		 */
    native public void setContentBounds(RectangleData options);
    /**
		 * Resizes the window to width and height.
		 */
    native public void setSize(double width, double height);
    /**
		 * Resizes the window's client area (e.g. the web page) to width and height.
		 */
    native public void setContentSize(double width, double height);
    /**
		 * Sets whether the window should show always on top of other windows. After
		 * setting this, the window is still a normal window, not a toolbox window
		 * which can not be focused on.
		 */
    native public void setAlwaysOnTop(Boolean flag);
    /**
		 * Moves window to x and y.
		 */
    native public void setPosition(double x, double y);
    /**
		 * Changes the attachment point for sheets on macOS.
		 * Note: This API is available only on macOS.
		 */
    native public void setSheetOffset(double offsetY);
    /**
		 * Same as webContents.loadURL(url).
		 */
    native public void loadURL(String url);
    /**
		 * Sets the progress value in the progress bar.
		 * On Linux platform, only supports Unity desktop environment, you need to
		 * specify the *.desktop file name to desktopName field in package.json.
		 * By default, it will assume app.getName().desktop.
		 * @param progress Valid range is [0, 1.0]. If < 0, the progress bar is removed.
		 * If greater than 0, it becomes indeterminate.
		 */
    native public void setProgressBar(double progress);
}

