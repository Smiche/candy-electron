package def.electron.electron;
import def.js.Error;
import def.dom.HTMLElement;
/**
	 * Use the webview tag to embed 'guest' content (such as web pages) in your Electron app.
	 * The guest content is contained within the webview container.
	 * An embedded page within your app controls how the guest content is laid out and rendered.
	 *
	 * Unlike an iframe, the webview runs in a separate process than your app.
	 * It doesn't have the same permissions as your web page and all interactions between your app
	 * and embedded content will be asynchronous. This keeps your app safe from the embedded content.
	 */
@jsweet.lang.Interface
public abstract class WebViewElement extends HTMLElement {
    /**
		 * Returns the visible URL. Writing to this attribute initiates top-level navigation.
		 * Assigning src its own value will reload the current page.
		 * The src attribute can also accept data URLs, such as data:text/plain,Hello, world!.
		 */
    public String src;
    /**
		 * If "on", the webview container will automatically resize within the bounds specified
		 * by the attributes minwidth, minheight, maxwidth, and maxheight.
		 * These constraints do not impact the webview unless autosize is enabled.
		 * When autosize is enabled, the webview container size cannot be less than
		 * the minimum values or greater than the maximum.
		 */
    public String autosize;
    /**
		 * If "on", the guest page in webview will have node integration and can use node APIs
		 * like require and process to access low level system resources.
		 */
    public String nodeintegration;
    /**
		 * If "on", the guest page in webview will be able to use browser plugins.
		 */
    public String plugins;
    /**
		 * Specifies a script that will be loaded before other scripts run in the guest page.
		 * The protocol of script's URL must be either file: or asar:,
		 * because it will be loaded by require in guest page under the hood.
		 *
		 * When the guest page doesn't have node integration this script will still have access to all Node APIs,
		 * but global objects injected by Node will be deleted after this script has finished executing.
		 */
    public String preload;
    /**
		 * Sets the referrer URL for the guest page.
		 */
    public String httpreferrer;
    /**
		 * Sets the user agent for the guest page before the page is navigated to.
		 * Once the page is loaded, use the setUserAgent method to change the user agent.
		 */
    public String useragent;
    /**
		 * If "on", the guest page will have web security disabled.
		 */
    public String disablewebsecurity;
    /**
		 * Sets the session used by the page. If partition starts with persist:,
		 * the page will use a persistent session available to all pages in the app with the same partition.
		 * If there is no persist: prefix, the page will use an in-memory session.
		 * By assigning the same partition, multiple pages can share the same session.
		 * If the partition is unset then default session of the app will be used.
		 *
		 * This value can only be modified before the first navigation,
		 * since the session of an active renderer process cannot change.
		 * Subsequent attempts to modify the value will fail with a DOM exception.
		 */
    public String partition;
    /**
		 * If "on", the guest page will be allowed to open new windows.
		 */
    public String allowpopups;
    /**
		 * A list of strings which specifies the web preferences to be set on the webview, separated by ,.
		 */
    public String webpreferences;
    /**
		 * A list of strings which specifies the blink features to be enabled separated by ,.
		 */
    public String blinkfeatures;
    /**
		 * A list of strings which specifies the blink features to be disabled separated by ,.
		 */
    public String disableblinkfeatures;
    /**
		 * A value that links the webview to a specific webContents.
		 * When a webview first loads a new webContents is created and this attribute is set
		 * to its instance identifier. Setting this attribute on a new or existing webview connects
		 * it to the existing webContents that currently renders in a different webview.
		 *
		 * The existing webview will see the destroy event and will then create a new webContents when a new url is loaded.
		 */
    public String guestinstance;
    /**
		 * Loads the url in the webview, the url must contain the protocol prefix, e.g. the http:// or file://.
		 */
    native public void loadURL(String url, LoadURLOptions options);
    /**
		 * @returns URL of guest page.
		 */
    native public String getURL();
    /**
		 * @returns The title of guest page.
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
		 * @returns Whether guest page is still loading resources.
		 */
    native public Boolean isLoading();
    /**
		 * Returns a boolean whether the guest page is waiting for a first-response for the main resource of the page.
		 */
    native public Boolean isWaitingForResponse();
    /**
		 * Stops any pending navigation.
		 */
    native public void stop();
    /**
		 * Reloads the guest page.
		 */
    native public void reload();
    /**
		 * Reloads the guest page and ignores cache.
		 */
    native public void reloadIgnoringCache();
    /**
		 * @returns Whether the guest page can go back.
		 */
    native public Boolean canGoBack();
    /**
		 * @returns Whether the guest page can go forward.
		 */
    native public Boolean canGoForward();
    /**
		 * @returns Whether the guest page can go to offset.
		 */
    native public Boolean canGoToOffset(double offset);
    /**
		 * Clears the navigation history.
		 */
    native public void clearHistory();
    /**
		 * Makes the guest page go back.
		 */
    native public void goBack();
    /**
		 * Makes the guest page go forward.
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
		 * Overrides the user agent for the guest page.
		 */
    native public void setUserAgent(String userAgent);
    /**
		 * @returns The user agent for guest page.
		 */
    native public String getUserAgent();
    /**
		 * Injects CSS into the guest page.
		 */
    native public void insertCSS(String css);
    /**
		 * Evaluates code in page. If userGesture is set, it will create the user gesture context in the page.
		 * HTML APIs like requestFullScreen, which require user action, can take advantage of this option for automation.
		 *
		 * @returns Promise
		 */
    native public Promise<?> executeJavaScript(String code, Boolean userGesture, java.util.function.Consumer<Object> callback);
    /**
		 * Opens a DevTools window for guest page.
		 */
    native public void openDevTools();
    /**
		 * Closes the DevTools window of guest page.
		 */
    native public void closeDevTools();
    /**
		 * @returns Whether guest page has a DevTools window attached.
		 */
    native public Boolean isDevToolsOpened();
    /**
		 * @returns Whether DevTools window of guest page is focused.
		 */
    native public Boolean isDevToolsFocused();
    /**
		 * Starts inspecting element at position (x, y) of guest page.
		 */
    native public void inspectElement(double x, double y);
    /**
		 * Opens the DevTools for the service worker context present in the guest page.
		 */
    native public void inspectServiceWorker();
    /**
		 * Set guest page muted.
		 */
    native public void setAudioMuted(Boolean muted);
    /**
		 * @returns Whether guest page has been muted.
		 */
    native public Boolean isAudioMuted();
    /**
		 * Executes editing command undo in page.
		 */
    native public void undo();
    /**
		 * Executes editing command redo in page.
		 */
    native public void redo();
    /**
		 * Executes editing command cut in page.
		 */
    native public void cut();
    /**
		 * Executes editing command copy in page.
		 */
    native public void copy();
    /**
		 * Executes editing command paste in page.
		 */
    native public void paste();
    /**
		 * Executes editing command pasteAndMatchStyle in page.
		 */
    native public void pasteAndMatchStyle();
    /**
		 * Executes editing command delete in page.
		 */
    native public void delete();
    /**
		 * Executes editing command selectAll in page.
		 */
    native public void selectAll();
    /**
		 * Executes editing command unselect in page.
		 */
    native public void unselect();
    /**
		 * Executes editing command replace in page.
		 */
    native public void replace(String text);
    /**
		 * Executes editing command replaceMisspelling in page.
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
		 * Stops any findInPage request for the webview with the provided action.
		 */
    native public void stopFindInPage("clearSelection" action);
    /**
		 * Prints webview's web page. Same with webContents.print([options]).
		 */
    native public void print(PrintOptions options);
    /**
		 * Prints webview's web page as PDF, Same with webContents.printToPDF(options, callback)
		 */
    native public void printToPDF(PrintToPDFOptions options, java.util.function.BiConsumer<Error,Buffer> callback);
    /**
		 * Send an asynchronous message to renderer process via channel, you can also send arbitrary arguments.
		 * The renderer process can handle the message by listening to the channel event with the ipcRenderer module.
		 * See webContents.send for examples.
		 */
    native public void send(String channel, Object... args);
    /**
		 * Sends an input event to the page.
		 * See webContents.sendInputEvent for detailed description of event object.
		 */
    native public void sendInputEvent(SendInputEvent event);
    /**
		 * Changes the zoom factor to the specified factor.
		 * Zoom factor is zoom percent divided by 100, so 300% = 3.0.
		 */
    native public void setZoomFactor(double factor);
    /**
		 * Changes the zoom level to the specified level.
		 * The original size is 0 and each increment above or below represents
		 * zooming 20% larger or smaller to default limits of 300% and 50% of original size, respectively.
		 */
    native public void setZoomLevel(double level);
    /**
		 * Shows pop-up dictionary that searches the selected word on the page.
		 * Note: This API is available only on macOS.
		 */
    native public void showDefinitionForSelection();
    /**
		 * @returns The WebContents associated with this webview.
		 */
    native public WebContents getWebContents();
    /**
		 * Captures a snapshot of the webview's page. Same as webContents.capturePage([rect, ]callback).
		 */
    native public void capturePage(java.util.function.Consumer<NativeImage> callback);
    /**
		 * Captures a snapshot of the webview's page. Same as webContents.capturePage([rect, ]callback).
		 */
    native public void capturePage(RectangleData rect, java.util.function.Consumer<NativeImage> callback);
    /**
		 * Fired when a load has committed. This includes navigation within the current document
		 * as well as subframe document-level loads, but does not include asynchronous resource loads.
		 */
    native public void addEventListener("load_commit" type, java.util.function.Consumer<def.electron.electron.webviewelement.LoadCommitEvent> listener, Boolean useCapture);
    /**
		 * Fired when the navigation is done, i.e. the spinner of the tab will stop spinning, and the onload event is dispatched.
		 */
    native public void addEventListener("did_finish_load" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener, Boolean useCapture);
    /**
		 * This event is like did-finish-load, but fired when the load failed or was cancelled, e.g. window.stop() is invoked.
		 */
    native public void addEventListener("did_fail_load" type, java.util.function.Consumer<def.electron.electron.webviewelement.DidFailLoadEvent> listener, Boolean useCapture);
    /**
		 * Fired when a frame has done navigation.
		 */
    native public void addEventListener("did_frame_finish_load" type, java.util.function.Consumer<def.electron.electron.webviewelement.DidFrameFinishLoadEvent> listener, Boolean useCapture);
    /**
		 * Corresponds to the points in time when the spinner of the tab starts spinning.
		 */
    native public void addEventListener("did_start_loading" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener, Boolean useCapture);
    /**
		 * Corresponds to the points in time when the spinner of the tab stops spinning.
		 */
    native public void addEventListener("did_stop_loading" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener, Boolean useCapture);
    /**
		 * Fired when details regarding a requested resource is available.
		 * status indicates socket connection to download the resource.
		 */
    native public void addEventListener("did_get_response_details" type, java.util.function.Consumer<def.electron.electron.webviewelement.DidGetResponseDetails> listener, Boolean useCapture);
    /**
		 * Fired when a redirect was received while requesting a resource.
		 */
    native public void addEventListener("did_get_redirect_request" type, java.util.function.Consumer<def.electron.electron.webviewelement.DidGetRedirectRequestEvent> listener, Boolean useCapture);
    /**
		 * Fired when document in the given frame is loaded.
		 */
    native public void addEventListener("dom_ready" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener, Boolean useCapture);
    /**
		 * Fired when page title is set during navigation. explicitSet is false when title is synthesized from file URL.
		 */
    native public void addEventListener("page_title_updated" type, java.util.function.Consumer<def.electron.electron.webviewelement.PageTitleUpdatedEvent> listener, Boolean useCapture);
    /**
		 * Fired when page receives favicon URLs.
		 */
    native public void addEventListener("page_favicon_updated" type, java.util.function.Consumer<def.electron.electron.webviewelement.PageFaviconUpdatedEvent> listener, Boolean useCapture);
    /**
		 * Fired when page enters fullscreen triggered by HTML API.
		 */
    native public void addEventListener("enter_html_full_screen" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener, Boolean useCapture);
    /**
		 * Fired when page leaves fullscreen triggered by HTML API.
		 */
    native public void addEventListener("leave_html_full_screen" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener, Boolean useCapture);
    /**
		 * Fired when the guest window logs a console message.
		 */
    native public void addEventListener("console_message" type, java.util.function.Consumer<def.electron.electron.webviewelement.ConsoleMessageEvent> listener, Boolean useCapture);
    /**
		 * Fired when a result is available for webview.findInPage request.
		 */
    native public void addEventListener("found_in_page" type, java.util.function.Consumer<def.electron.electron.webviewelement.FoundInPageEvent> listener, Boolean useCapture);
    /**
		 * Fired when the guest page attempts to open a new browser window.
		 */
    native public void addEventListener("new_window" type, java.util.function.Consumer<def.electron.electron.webviewelement.NewWindowEvent> listener, Boolean useCapture);
    /**
		 * Emitted when a user or the page wants to start navigation.
		 * It can happen when the window.location object is changed or a user clicks a link in the page.
		 *
		 * This event will not emit when the navigation is started programmatically with APIs
		 * like <webview>.loadURL and <webview>.back.
		 *
		 * It is also not emitted during in-page navigation, such as clicking anchor links
		 * or updating the window.location.hash. Use did-navigate-in-page event for this purpose.
		 *
		 * Calling event.preventDefault() does NOT have any effect.
		 */
    native public void addEventListener("will_navigate" type, java.util.function.Consumer<def.electron.electron.webviewelement.WillNavigateEvent> listener, Boolean useCapture);
    /**
		 * Emitted when a navigation is done.
		 *
		 * This event is not emitted for in-page navigations, such as clicking anchor links
		 * or updating the window.location.hash. Use did-navigate-in-page event for this purpose.
		 */
    native public void addEventListener("did_navigate" type, java.util.function.Consumer<def.electron.electron.webviewelement.DidNavigateEvent> listener, Boolean useCapture);
    /**
		 * Emitted when an in-page navigation happened.
		 *
		 * When in-page navigation happens, the page URL changes but does not cause
		 * navigation outside of the page. Examples of this occurring are when anchor links
		 * are clicked or when the DOM hashchange event is triggered.
		 */
    native public void addEventListener("did_navigate_in_page" type, java.util.function.Consumer<def.electron.electron.webviewelement.DidNavigateInPageEvent> listener, Boolean useCapture);
    /**
		 * Fired when the guest page attempts to close itself.
		 */
    native public void addEventListener("close" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener, Boolean useCapture);
    /**
		 * Fired when the guest page has sent an asynchronous message to embedder page.
		 */
    native public void addEventListener("ipc_message" type, java.util.function.Consumer<def.electron.electron.webviewelement.IpcMessageEvent> listener, Boolean useCapture);
    /**
		 * Fired when the renderer process is crashed.
		 */
    native public void addEventListener("crashed" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener, Boolean useCapture);
    /**
		 * Fired when the gpu process is crashed.
		 */
    native public void addEventListener("gpu_crashed" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener, Boolean useCapture);
    /**
		 * Fired when a plugin process is crashed.
		 */
    native public void addEventListener("plugin_crashed" type, java.util.function.Consumer<def.electron.electron.webviewelement.PluginCrashedEvent> listener, Boolean useCapture);
    /**
		 * Fired when the WebContents is destroyed.
		 */
    native public void addEventListener("destroyed" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener, Boolean useCapture);
    /**
		 * Emitted when media starts playing.
		 */
    native public void addEventListener("media_started_playing" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener, Boolean useCapture);
    /**
		 * Emitted when media is paused or done playing.
		 */
    native public void addEventListener("media_paused" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener, Boolean useCapture);
    /**
		 * Emitted when a page's theme color changes. This is usually due to encountering a meta tag:
		 * <meta name='theme-color' content='#ff0000'>
		 */
    native public void addEventListener("did_change_theme_color" type, java.util.function.Consumer<def.electron.electron.webviewelement.DidChangeThemeColorEvent> listener, Boolean useCapture);
    /**
		 * Emitted when mouse moves over a link or the keyboard moves the focus to a link.
		 */
    native public void addEventListener("update_target_url" type, java.util.function.Consumer<def.electron.electron.webviewelement.UpdateTargetUrlEvent> listener, Boolean useCapture);
    /**
		 * Emitted when DevTools is opened.
		 */
    native public void addEventListener("devtools_opened" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener, Boolean useCapture);
    /**
		 * Emitted when DevTools is closed.
		 */
    native public void addEventListener("devtools_closed" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener, Boolean useCapture);
    /**
		 * Emitted when DevTools is focused / opened.
		 */
    native public void addEventListener("devtools_focused" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener, Boolean useCapture);
    native public void addEventListener(String type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener, Boolean useCapture);
    /**
		 * Loads the url in the webview, the url must contain the protocol prefix, e.g. the http:// or file://.
		 */
    native public void loadURL(String url);
    /**
		 * Evaluates code in page. If userGesture is set, it will create the user gesture context in the page.
		 * HTML APIs like requestFullScreen, which require user action, can take advantage of this option for automation.
		 *
		 * @returns Promise
		 */
    native public Promise<?> executeJavaScript(String code, Boolean userGesture);
    /**
		 * Evaluates code in page. If userGesture is set, it will create the user gesture context in the page.
		 * HTML APIs like requestFullScreen, which require user action, can take advantage of this option for automation.
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
		 * Prints webview's web page. Same with webContents.print([options]).
		 */
    native public void print();
    /**
		 * Fired when a load has committed. This includes navigation within the current document
		 * as well as subframe document-level loads, but does not include asynchronous resource loads.
		 */
    native public void addEventListener("load_commit" type, java.util.function.Consumer<def.electron.electron.webviewelement.LoadCommitEvent> listener);
    /**
		 * Fired when the navigation is done, i.e. the spinner of the tab will stop spinning, and the onload event is dispatched.
		 */
    native public void addEventListener("did_finish_load" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener);
    /**
		 * This event is like did-finish-load, but fired when the load failed or was cancelled, e.g. window.stop() is invoked.
		 */
    native public void addEventListener("did_fail_load" type, java.util.function.Consumer<def.electron.electron.webviewelement.DidFailLoadEvent> listener);
    /**
		 * Fired when a frame has done navigation.
		 */
    native public void addEventListener("did_frame_finish_load" type, java.util.function.Consumer<def.electron.electron.webviewelement.DidFrameFinishLoadEvent> listener);
    /**
		 * Corresponds to the points in time when the spinner of the tab starts spinning.
		 */
    native public void addEventListener("did_start_loading" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener);
    /**
		 * Corresponds to the points in time when the spinner of the tab stops spinning.
		 */
    native public void addEventListener("did_stop_loading" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener);
    /**
		 * Fired when details regarding a requested resource is available.
		 * status indicates socket connection to download the resource.
		 */
    native public void addEventListener("did_get_response_details" type, java.util.function.Consumer<def.electron.electron.webviewelement.DidGetResponseDetails> listener);
    /**
		 * Fired when a redirect was received while requesting a resource.
		 */
    native public void addEventListener("did_get_redirect_request" type, java.util.function.Consumer<def.electron.electron.webviewelement.DidGetRedirectRequestEvent> listener);
    /**
		 * Fired when document in the given frame is loaded.
		 */
    native public void addEventListener("dom_ready" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener);
    /**
		 * Fired when page title is set during navigation. explicitSet is false when title is synthesized from file URL.
		 */
    native public void addEventListener("page_title_updated" type, java.util.function.Consumer<def.electron.electron.webviewelement.PageTitleUpdatedEvent> listener);
    /**
		 * Fired when page receives favicon URLs.
		 */
    native public void addEventListener("page_favicon_updated" type, java.util.function.Consumer<def.electron.electron.webviewelement.PageFaviconUpdatedEvent> listener);
    /**
		 * Fired when page enters fullscreen triggered by HTML API.
		 */
    native public void addEventListener("enter_html_full_screen" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener);
    /**
		 * Fired when page leaves fullscreen triggered by HTML API.
		 */
    native public void addEventListener("leave_html_full_screen" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener);
    /**
		 * Fired when the guest window logs a console message.
		 */
    native public void addEventListener("console_message" type, java.util.function.Consumer<def.electron.electron.webviewelement.ConsoleMessageEvent> listener);
    /**
		 * Fired when a result is available for webview.findInPage request.
		 */
    native public void addEventListener("found_in_page" type, java.util.function.Consumer<def.electron.electron.webviewelement.FoundInPageEvent> listener);
    /**
		 * Fired when the guest page attempts to open a new browser window.
		 */
    native public void addEventListener("new_window" type, java.util.function.Consumer<def.electron.electron.webviewelement.NewWindowEvent> listener);
    /**
		 * Emitted when a user or the page wants to start navigation.
		 * It can happen when the window.location object is changed or a user clicks a link in the page.
		 *
		 * This event will not emit when the navigation is started programmatically with APIs
		 * like <webview>.loadURL and <webview>.back.
		 *
		 * It is also not emitted during in-page navigation, such as clicking anchor links
		 * or updating the window.location.hash. Use did-navigate-in-page event for this purpose.
		 *
		 * Calling event.preventDefault() does NOT have any effect.
		 */
    native public void addEventListener("will_navigate" type, java.util.function.Consumer<def.electron.electron.webviewelement.WillNavigateEvent> listener);
    /**
		 * Emitted when a navigation is done.
		 *
		 * This event is not emitted for in-page navigations, such as clicking anchor links
		 * or updating the window.location.hash. Use did-navigate-in-page event for this purpose.
		 */
    native public void addEventListener("did_navigate" type, java.util.function.Consumer<def.electron.electron.webviewelement.DidNavigateEvent> listener);
    /**
		 * Emitted when an in-page navigation happened.
		 *
		 * When in-page navigation happens, the page URL changes but does not cause
		 * navigation outside of the page. Examples of this occurring are when anchor links
		 * are clicked or when the DOM hashchange event is triggered.
		 */
    native public void addEventListener("did_navigate_in_page" type, java.util.function.Consumer<def.electron.electron.webviewelement.DidNavigateInPageEvent> listener);
    /**
		 * Fired when the guest page attempts to close itself.
		 */
    native public void addEventListener("close" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener);
    /**
		 * Fired when the guest page has sent an asynchronous message to embedder page.
		 */
    native public void addEventListener("ipc_message" type, java.util.function.Consumer<def.electron.electron.webviewelement.IpcMessageEvent> listener);
    /**
		 * Fired when the renderer process is crashed.
		 */
    native public void addEventListener("crashed" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener);
    /**
		 * Fired when the gpu process is crashed.
		 */
    native public void addEventListener("gpu_crashed" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener);
    /**
		 * Fired when a plugin process is crashed.
		 */
    native public void addEventListener("plugin_crashed" type, java.util.function.Consumer<def.electron.electron.webviewelement.PluginCrashedEvent> listener);
    /**
		 * Fired when the WebContents is destroyed.
		 */
    native public void addEventListener("destroyed" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener);
    /**
		 * Emitted when media starts playing.
		 */
    native public void addEventListener("media_started_playing" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener);
    /**
		 * Emitted when media is paused or done playing.
		 */
    native public void addEventListener("media_paused" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener);
    /**
		 * Emitted when a page's theme color changes. This is usually due to encountering a meta tag:
		 * <meta name='theme-color' content='#ff0000'>
		 */
    native public void addEventListener("did_change_theme_color" type, java.util.function.Consumer<def.electron.electron.webviewelement.DidChangeThemeColorEvent> listener);
    /**
		 * Emitted when mouse moves over a link or the keyboard moves the focus to a link.
		 */
    native public void addEventListener("update_target_url" type, java.util.function.Consumer<def.electron.electron.webviewelement.UpdateTargetUrlEvent> listener);
    /**
		 * Emitted when DevTools is opened.
		 */
    native public void addEventListener("devtools_opened" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener);
    /**
		 * Emitted when DevTools is closed.
		 */
    native public void addEventListener("devtools_closed" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener);
    /**
		 * Emitted when DevTools is focused / opened.
		 */
    native public void addEventListener("devtools_focused" type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener);
    native public void addEventListener(String type, java.util.function.Consumer<def.electron.electronprivate.GlobalEvent> listener);
    /**
		 * Stops any findInPage request for the webview with the provided action.
		 */
    native public void stopFindInPage("keepSelection" action);
    /**
		 * Stops any findInPage request for the webview with the provided action.
		 */
    native public void stopFindInPage("activateSelection" action);
}

