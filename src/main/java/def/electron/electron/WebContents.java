package def.electron.electron;
import def.js.Error;
import jsweet.util.function.Consumer8;
import jsweet.util.function.Consumer9;
import def.js.Function;
import jsweet.util.function.Consumer4;
import jsweet.util.function.Consumer5;
import jsweet.util.function.Consumer6;
/**
	 * A WebContents is responsible for rendering and controlling a web page.
	 */
@jsweet.lang.Interface
public abstract class WebContents extends def.js.Object {
    /**
		 * Emitted when the navigation is done, i.e. the spinner of the tab has stopped spinning,
		 * and the onload event was dispatched.
		 */
    native public WebContents on("did_finish_load" event, Function listener);
    /**
		 * This event is like did-finish-load but emitted when the load failed or was cancelled,
		 * e.g. window.stop() is invoked.
		 */
    native public WebContents on("did_fail_load" event, Consumer5<Event,Double,String,String,Boolean> listener);
    /**
		 * Emitted when a frame has done navigation.
		 */
    native public WebContents on("did_frame_finish_load" event, java.util.function.BiConsumer<Event,Boolean> listener);
    /**
		 * Corresponds to the points in time when the spinner of the tab started spinning.
		 */
    native public WebContents on("did_start_loading" event, Function listener);
    /**
		 * Corresponds to the points in time when the spinner of the tab stopped spinning.
		 */
    native public WebContents on("did_stop_loading" event, Function listener);
    /**
		 * Emitted when details regarding a requested resource are available.
		 * status indicates the socket connection to download the resource.
		 */
    native public WebContents on("did_get_response_details" event, Consumer9<Event,Boolean,String,String,Double,String,String,Headers,String> listener);
    /**
		 * Emitted when a redirect is received while requesting a resource.
		 */
    native public WebContents on("did_get_redirect_request" event, Consumer8<Event,String,String,Boolean,Double,String,String,Headers> listener);
    /**
		 * Emitted when the document in the given frame is loaded.
		 */
    native public WebContents on("dom_ready" event, java.util.function.Consumer<Event> listener);
    /**
		 * Emitted when page receives favicon URLs.
		 */
    native public WebContents on("page_favicon_updated" event, java.util.function.BiConsumer<Event,String[]> listener);
    /**
		 * Emitted when the page requests to open a new window for a url.
		 * It could be requested by window.open or an external link like <a target='_blank'>.
		 *
		 * By default a new BrowserWindow will be created for the url.
		 *
		 * Calling event.preventDefault() will prevent creating new windows.
		 */
    native public WebContents on("new_window" event, Consumer5<Event,String,String,Object,BrowserWindowOptions> listener);
    /**
		 * Emitted when a user or the page wants to start navigation.
		 * It can happen when the window.location object is changed or a user clicks a link in the page.
		 *
		 * This event will not emit when the navigation is started programmatically with APIs like
		 * webContents.loadURL and webContents.back.
		 *
		 * It is also not emitted for in-page navigations, such as clicking anchor links
		 * or updating the window.location.hash. Use did-navigate-in-page event for this purpose.
		 *
		 * Calling event.preventDefault() will prevent the navigation.
		 */
    native public WebContents on("will_navigate" event, java.util.function.BiConsumer<Event,String> listener);
    /**
		 * Emitted when a navigation is done.
		 *
		 * This event is not emitted for in-page navigations, such as clicking anchor links
		 * or updating the window.location.hash. Use did-navigate-in-page event for this purpose.
		 */
    native public WebContents on("did_navigate" event, java.util.function.BiConsumer<Event,String> listener);
    /**
		 * Emitted when an in-page navigation happened.
		 *
		 * When in-page navigation happens, the page URL changes but does not cause
		 * navigation outside of the page. Examples of this occurring are when anchor links
		 * are clicked or when the DOM hashchange event is triggered.
		 */
    native public WebContents on("did_navigate_in_page" event, jsweet.util.function.TriConsumer<Event,String,Boolean> listener);
    /**
		 * Emitted when the renderer process has crashed.
		 */
    native public WebContents on("crashed" event, java.util.function.BiConsumer<Event,Boolean> listener);
    /**
		 * Emitted when a plugin process has crashed.
		 */
    native public WebContents on("plugin_crashed" event, jsweet.util.function.TriConsumer<Event,String,String> listener);
    /**
		 * Emitted when webContents is destroyed.
		 */
    native public WebContents on("destroyed" event, Function listener);
    /**
		 * Emitted when DevTools is opened.
		 */
    native public WebContents on("devtools_opened" event, Function listener);
    /**
		 * Emitted when DevTools is closed.
		 */
    native public WebContents on("devtools_closed" event, Function listener);
    /**
		 * Emitted when DevTools is focused / opened.
		 */
    native public WebContents on("devtools_focused" event, Function listener);
    /**
		 * Emitted when failed to verify the certificate for url.
		 * The usage is the same with the "certificate-error" event of app.
		 */
    native public WebContents on("certificate_error" event, Consumer5<Event,String,String,Certificate,java.util.function.Consumer<Boolean>> listener);
    /**
		 * Emitted when a client certificate is requested.
		 * The usage is the same with the "select-client-certificate" event of app.
		 */
    native public WebContents on("select_client_certificate" event, Consumer4<Event,String,Certificate[],java.util.function.Consumer<Certificate>> listener);
    /**
		 * Emitted when webContents wants to do basic auth.
		 * The usage is the same with the "login" event of app.
		 */
    native public WebContents on("login" event, Consumer4<Event,LoginRequest,LoginAuthInfo,java.util.function.BiConsumer<String,String>> listener);
    /**
		 * Emitted when a result is available for webContents.findInPage request.
		 */
    native public WebContents on("found_in_page" event, java.util.function.BiConsumer<Event,FoundInPageResult> listener);
    /**
		 * Emitted when media starts playing.
		 */
    native public WebContents on("media_started_playing" event, Function listener);
    /**
		 * Emitted when media is paused or done playing.
		 */
    native public WebContents on("media_paused" event, Function listener);
    /**
		 * Emitted when a page’s theme color changes. This is usually due to encountering a meta tag:
		 * <meta name='theme-color' content='#ff0000'>
		 */
    native public WebContents on("did_change_theme_color" event, Function listener);
    /**
		 * Emitted when mouse moves over a link or the keyboard moves the focus to a link.
		 */
    native public WebContents on("update_target_url" event, java.util.function.BiConsumer<Event,String> listener);
    /**
		 * Emitted when the cursor’s type changes.
		 * If the type parameter is custom, the image parameter will hold the custom cursor image
		 * in a NativeImage, and scale, size and hotspot will hold additional information about the custom cursor.
		 */
    native public WebContents on("cursor_changed" event, Consumer6<Event,Object,NativeImage,Double,SizeData,PointData> listener);
    /**
		 * Emitted when there is a new context menu that needs to be handled.
		 */
    native public WebContents on("context_menu" event, java.util.function.BiConsumer<Event,ContextMenuParams> listener);
    /**
		 * Emitted when bluetooth device needs to be selected on call to navigator.bluetooth.requestDevice.
		 * To use navigator.bluetooth api webBluetooth should be enabled.
		 * If event.preventDefault is not called, first available device will be selected.
		 * callback should be called with deviceId to be selected,
		 * passing empty string to callback will cancel the request.
		 */
    native public WebContents on("select_bluetooth_device" event, jsweet.util.function.TriConsumer<Event,BluetoothDevice[],java.util.function.Consumer<String>> listener);
    /**
		 * Emitted when a new frame is generated. Only the dirty area is passed in the buffer.
		 */
    native public WebContents on("paint" event, jsweet.util.function.TriConsumer<Event,RectangleData,NativeImage> listener);
    native public WebContents on(String event, Function listener);
    /**
		 * Loads the url in the window.
		 * @param url Must contain the protocol prefix (e.g., the http:// or file://).
		 */
    native public void loadURL(String url, LoadURLOptions options);
    /**
		 * Initiates a download of the resource at url without navigating.
		 * The will-download event of session will be triggered.
		 */
    native public void downloadURL(String url);
    /**
		 * @returns The URL of current web page.
		 */
    native public String getURL();
    /**
		 * @returns The title of web page.
		 */
    native public String getTitle();
    /**
		 * @returns Whether the web page is destroyed.
		 */
    native public Boolean isDestroyed();
    /**
		 * @returns Whether the web page is focused.
		 */
    native public Boolean isFocused();
    /**
		 * @returns Whether web page is still loading resources.
		 */
    native public Boolean isLoading();
    /**
		 * @returns Whether the main frame (and not just iframes or frames within it) is still loading.
		 */
    native public Boolean isLoadingMainFrame();
    /**
		 * @returns Whether web page is waiting for a first-response for the main
		 * resource of the page.
		 */
    native public Boolean isWaitingForResponse();
    /**
		 * Stops any pending navigation.
		 */
    native public void stop();
    /**
		 * Reloads current page.
		 */
    native public void reload();
    /**
		 * Reloads current page and ignores cache.
		 */
    native public void reloadIgnoringCache();
    /**
		 * @returns Whether the web page can go back.
		 */
    native public Boolean canGoBack();
    /**
		 * @returns Whether the web page can go forward.
		 */
    native public Boolean canGoForward();
    /**
		 * @returns Whether the web page can go to offset.
		 */
    native public Boolean canGoToOffset(double offset);
    /**
		 * Clears the navigation history.
		 */
    native public void clearHistory();
    /**
		 * Makes the web page go back.
		 */
    native public void goBack();
    /**
		 * Makes the web page go forward.
		 */
    native public void goForward();
    /**
		 * Navigates to the specified absolute index.
		 */
    native public void goToIndex(double index);
    /**
		 * Navigates to the specified offset from the "current entry".
		 */
    native public void goToOffset(double offset);
    /**
		 * @returns Whether the renderer process has crashed.
		 */
    native public Boolean isCrashed();
    /**
		 * Overrides the user agent for this page.
		 */
    native public void setUserAgent(String userAgent);
    /**
		 * @returns The user agent for this web page.
		 */
    native public String getUserAgent();
    /**
		 * Injects CSS into this page.
		 */
    native public void insertCSS(String css);
    /**
		 * Evaluates code in page.
		 * @param code Code to evaluate.
		 *
		 * @returns Promise
		 */
    native public Promise<?> executeJavaScript(String code, Boolean userGesture, java.util.function.Consumer<Object> callback);
    /**
		 * Mute the audio on the current web page.
		 */
    native public void setAudioMuted(Boolean muted);
    /**
		 * @returns Whether this page has been muted.
		 */
    native public Boolean isAudioMuted();
    /**
		 * Changes the zoom factor to the specified factor.
		 * Zoom factor is zoom percent divided by 100, so 300% = 3.0.
		 */
    native public void setZoomFactor(double factor);
    /**
		 * Sends a request to get current zoom factor.
		 */
    native public void getZoomFactor(java.util.function.Consumer<Double> callback);
    /**
		 * Changes the zoom level to the specified level.
		 * The original size is 0 and each increment above or below represents
		 * zooming 20% larger or smaller to default limits of 300% and 50% of original size, respectively.
		 */
    native public void setZoomLevel(double level);
    /**
		 * Sends a request to get current zoom level.
		 */
    native public void getZoomLevel(java.util.function.Consumer<Double> callback);
    /**
		 * Sets the maximum and minimum zoom level.
		 */
    native public void setVisualZoomLevelLimits(double minimumLevel, double maximumLevel);
    /**
		 * Sets the maximum and minimum layout-based (i.e. non-visual) zoom level.
		 */
    native public void setLayoutZoomLevelLimits(double minimumLevel, double maximumLevel);
    /**
		 * Executes the editing command undo in web page.
		 */
    native public void undo();
    /**
		 * Executes the editing command redo in web page.
		 */
    native public void redo();
    /**
		 * Executes the editing command cut in web page.
		 */
    native public void cut();
    /**
		 * Executes the editing command copy in web page.
		 */
    native public void copy();
    /**
		 * Copy the image at the given position to the clipboard.
		 */
    native public void copyImageAt(double x, double y);
    /**
		 * Executes the editing command paste in web page.
		 */
    native public void paste();
    /**
		 * Executes the editing command pasteAndMatchStyle in web page.
		 */
    native public void pasteAndMatchStyle();
    /**
		 * Executes the editing command delete in web page.
		 */
    native public void delete();
    /**
		 * Executes the editing command selectAll in web page.
		 */
    native public void selectAll();
    /**
		 * Executes the editing command unselect in web page.
		 */
    native public void unselect();
    /**
		 * Executes the editing command replace in web page.
		 */
    native public void replace(String text);
    /**
		 * Executes the editing command replaceMisspelling in web page.
		 */
    native public void replaceMisspelling(String text);
    /**
		 * Inserts text to the focused element.
		 */
    native public void insertText(String text);
    /**
		 * Starts a request to find all matches for the text in the web page.
		 * The result of the request can be obtained by subscribing to found-in-page event.
		 * @returns The request id used for the request.
		 */
    native public double findInPage(String text, FindInPageOptions options);
    /**
		 * Stops any findInPage request for the webContents with the provided action.
		 */
    native public void stopFindInPage("clearSelection" action);
    /**
		 * Checks if any serviceworker is registered.
		 */
    native public void hasServiceWorker(java.util.function.Consumer<Boolean> callback);
    /**
		 * Unregisters any serviceworker if present.
		 */
    native public void unregisterServiceWorker(java.util.function.Consumer<Boolean> callback);
    /**
		 * Prints window's web page. When silent is set to false, Electron will pick up system's default printer and default settings for printing.
		 * Calling window.print() in web page is equivalent to call WebContents.print({silent: false, printBackground: false}).
		 * Note: On Windows, the print API relies on pdf.dll. If your application doesn't need print feature, you can safely remove pdf.dll in saving binary size.
		 */
    native public void print(PrintOptions options);
    /**
		 * Prints windows' web page as PDF with Chromium's preview printing custom settings.
		 */
    native public void printToPDF(PrintToPDFOptions options, java.util.function.BiConsumer<Error,Buffer> callback);
    /**
		 * Adds the specified path to DevTools workspace.
		 */
    native public void addWorkSpace(String path);
    /**
		 * Removes the specified path from DevTools workspace.
		 */
    native public void removeWorkSpace(String path);
    /**
		 * Opens the developer tools.
		 */
    native public void openDevTools(Options options);
    /**
		 * Closes the developer tools.
		 */
    native public void closeDevTools();
    /**
		 * Returns whether the developer tools are opened.
		 */
    native public Boolean isDevToolsOpened();
    /**
		 * Returns whether the developer tools are focussed.
		 */
    native public Boolean isDevToolsFocused();
    /**
		 * Toggle the developer tools.
		 */
    native public void toggleDevTools();
    /**
		 * Starts inspecting element at position (x, y).
		 */
    native public void inspectElement(double x, double y);
    /**
		 * Opens the developer tools for the service worker context.
		 */
    native public void inspectServiceWorker();
    /**
		 * Send args.. to the web page via channel in asynchronous message, the web page
		 * can handle it by listening to the channel event of ipc module.
		 * Note:
		 *   1. The IPC message handler in web pages do not have a event parameter,
		 *      which is different from the handlers on the main process.
		 *   2. There is no way to send synchronous messages from the main process
		 *      to a renderer process, because it would be very easy to cause dead locks.
		 */
    native public void send(String channel, Object... args);
    /**
		 * Enable device emulation with the given parameters.
		 */
    native public void enableDeviceEmulation(DeviceEmulationParameters parameters);
    /**
		 * Disable device emulation.
		 */
    native public void disableDeviceEmulation();
    /**
		 * Sends an input event to the page.
		 */
    native public void sendInputEvent(SendInputEvent event);
    /**
		 * Begin subscribing for presentation events and captured frames,
		 * The callback will be called when there is a presentation event.
		 */
    native public void beginFrameSubscription(Boolean onlyDirty, BeginFrameSubscriptionCallback callback);
    /**
		 * Begin subscribing for presentation events and captured frames,
		 * The callback will be called when there is a presentation event.
		 */
    native public void beginFrameSubscription(BeginFrameSubscriptionCallback callback);
    /**
		 * End subscribing for frame presentation events.
		 */
    native public void endFrameSubscription();
    /**
		 * @returns If the process of saving page has been initiated successfully.
		 */
    native public Boolean savePage(String fullPath, "HTMLOnly" saveType, java.util.function.Consumer<Error> callback);
    /**
		 * Shows pop-up dictionary that searches the selected word on the page.
		 * Note: This API is available only on macOS.
		 */
    native public void showDefinitionForSelection();
    /**
		 * @returns Whether offscreen rendering is enabled.
		 */
    native public Boolean isOffscreen();
    /**
		 * If offscreen rendering is enabled and not painting, start painting.
		 */
    native public void startPainting();
    /**
		 * If offscreen rendering is enabled and painting, stop painting.
		 */
    native public void stopPainting();
    /**
		 * If offscreen rendering is enabled returns whether it is currently painting.
		 */
    native public Boolean isPainting();
    /**
		 * If offscreen rendering is enabled sets the frame rate to the specified number.
		 * Only values between 1 and 60 are accepted.
		 */
    native public void setFrameRate(double fps);
    /**
		 * If offscreen rendering is enabled returns the current frame rate.
		 */
    native public double getFrameRate();
    /**
		 * If offscreen rendering is enabled invalidates the frame and generates a new one through the 'paint' event.
		 */
    native public void invalidate();
    /**
		 * Sets the item as dragging item for current drag-drop operation.
		 */
    native public void startDrag(DragItem item);
    /**
		 * Captures a snapshot of the page within rect.
		 */
    native public void capturePage(java.util.function.Consumer<NativeImage> callback);
    /**
		 * Captures a snapshot of the page within rect.
		 */
    native public void capturePage(RectangleData rect, java.util.function.Consumer<NativeImage> callback);
    /**
		 * @returns The unique ID of this WebContents.
		 */
    public double id;
    /**
		 * @returns The session object used by this webContents.
		 */
    public Session session;
    /**
		 * @returns The WebContents that might own this WebContents.
		 */
    public WebContents hostWebContents;
    /**
		 * @returns The WebContents of DevTools for this WebContents.
		 * Note: Users should never store this object because it may become null
		 * when the DevTools has been closed.
		 */
    public WebContents devToolsWebContents;
    /**
		 * @returns Debugger API
		 */
    public Debugger debugger;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        /**
			 * Opens the devtools with specified dock state. Defaults to last used dock state.
			 */
        @jsweet.lang.Optional
        public Object mode;
    }
    /**
		 * Loads the url in the window.
		 * @param url Must contain the protocol prefix (e.g., the http:// or file://).
		 */
    native public void loadURL(String url);
    /**
		 * Evaluates code in page.
		 * @param code Code to evaluate.
		 *
		 * @returns Promise
		 */
    native public Promise<?> executeJavaScript(String code, Boolean userGesture);
    /**
		 * Evaluates code in page.
		 * @param code Code to evaluate.
		 *
		 * @returns Promise
		 */
    native public Promise<?> executeJavaScript(String code);
    /**
		 * Starts a request to find all matches for the text in the web page.
		 * The result of the request can be obtained by subscribing to found-in-page event.
		 * @returns The request id used for the request.
		 */
    native public double findInPage(String text);
    /**
		 * Prints window's web page. When silent is set to false, Electron will pick up system's default printer and default settings for printing.
		 * Calling window.print() in web page is equivalent to call WebContents.print({silent: false, printBackground: false}).
		 * Note: On Windows, the print API relies on pdf.dll. If your application doesn't need print feature, you can safely remove pdf.dll in saving binary size.
		 */
    native public void print();
    /**
		 * Opens the developer tools.
		 */
    native public void openDevTools();
    /**
		 * @returns If the process of saving page has been initiated successfully.
		 */
    native public Boolean savePage(String fullPath, "HTMLOnly" saveType);
    /**
		 * Emitted when the cursor’s type changes.
		 * If the type parameter is custom, the image parameter will hold the custom cursor image
		 * in a NativeImage, and scale, size and hotspot will hold additional information about the custom cursor.
		 */
    native public WebContents on("cursor_changed" event, Consumer5<Event,Object,NativeImage,Double,SizeData> listener);
    /**
		 * Emitted when the cursor’s type changes.
		 * If the type parameter is custom, the image parameter will hold the custom cursor image
		 * in a NativeImage, and scale, size and hotspot will hold additional information about the custom cursor.
		 */
    native public WebContents on("cursor_changed" event, Consumer4<Event,Object,NativeImage,Double> listener);
    /**
		 * Emitted when the cursor’s type changes.
		 * If the type parameter is custom, the image parameter will hold the custom cursor image
		 * in a NativeImage, and scale, size and hotspot will hold additional information about the custom cursor.
		 */
    native public WebContents on("cursor_changed" event, jsweet.util.function.TriConsumer<Event,Object,NativeImage> listener);
    /**
		 * Emitted when the cursor’s type changes.
		 * If the type parameter is custom, the image parameter will hold the custom cursor image
		 * in a NativeImage, and scale, size and hotspot will hold additional information about the custom cursor.
		 */
    native public WebContents on("cursor_changed" event, java.util.function.BiConsumer<Event,Object> listener);
    /**
		 * Stops any findInPage request for the webContents with the provided action.
		 */
    native public void stopFindInPage("keepSelection" action);
    /**
		 * Stops any findInPage request for the webContents with the provided action.
		 */
    native public void stopFindInPage("activateSelection" action);
    /**
		 * @returns If the process of saving page has been initiated successfully.
		 */
    native public Boolean savePage(String fullPath, "HTMLComplete" saveType, java.util.function.Consumer<Error> callback);
    /**
		 * @returns If the process of saving page has been initiated successfully.
		 */
    native public Boolean savePage(String fullPath, "MHTML" saveType, java.util.function.Consumer<Error> callback);
    /**
		 * @returns If the process of saving page has been initiated successfully.
		 */
    native public Boolean savePage(String fullPath, "MHTML" saveType);
    /**
		 * @returns If the process of saving page has been initiated successfully.
		 */
    native public Boolean savePage(String fullPath, "HTMLComplete" saveType);
}

