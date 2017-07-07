package def.electron.electron;
import def.js.Function;
import jsweet.util.function.Consumer5;
import jsweet.util.function.Consumer6;
/**
	 * The app module is responsible for controlling the application's lifecycle.
	 */
@jsweet.lang.Interface
public abstract class App extends def.js.Object {
    /**
		 * Emitted when the application has finished basic startup.
		 * On Windows and Linux, the will-finish-launching event
		 * is the same as the ready event; on macOS, this event represents
		 * the applicationWillFinishLaunching notification of NSApplication.
		 * You would usually set up listeners for the open-file and open-url events here,
		 * and start the crash reporter and auto updater.
		 *
		 * In most cases, you should just do everything in the ready event handler.
		 */
    native public App on(def.electron.StringTypes.will_finish_launching event, Function listener);
    /**
		 * Emitted when Electron has finished initialization.
		 */
    native public App on(def.electron.StringTypes.ready event, java.util.function.BiConsumer<Event,Object> listener);
    /**
		 * Emitted when all windows have been closed.
		 *
		 * If you do not subscribe to this event and all windows are closed,
		 * the default behavior is to quit the app; however, if you subscribe,
		 * you control whether the app quits or not.
		 * If the user pressed Cmd + Q, or the developer called app.quit(),
		 * Electron will first try to close all the windows and then emit the will-quit event,
		 * and in this case the window-all-closed event would not be emitted.
		 */
    native public App on(def.electron.StringTypes.window_all_closed event, Function listener);
    /**
		 * Emitted before the application starts closing its windows.
		 * Calling event.preventDefault() will prevent the default behaviour, which is terminating the application.
		 */
    native public App on(def.electron.StringTypes.before_quit event, java.util.function.Consumer<Event> listener);
    /**
		 * Emitted when all windows have been closed and the application will quit.
		 * Calling event.preventDefault() will prevent the default behaviour, which is terminating the application.
		 */
    native public App on(def.electron.StringTypes.will_quit event, java.util.function.Consumer<Event> listener);
    /**
		 * Emitted when the application is quitting.
		 */
    native public App on(def.electron.StringTypes.quit event, java.util.function.BiConsumer<Event,Double> listener);
    /**
		 * Emitted when the user wants to open a file with the application.
		 * The open-file event is usually emitted when the application is already open
		 * and the OS wants to reuse the application to open the file.
		 * open-file is also emitted when a file is dropped onto the dock and the application
		 * is not yet running. Make sure to listen for the open-file event very early
		 * in your application startup to handle this case (even before the ready event is emitted).
		 *
		 * You should call event.preventDefault() if you want to handle this event.
		 *
		 * Note: This is only implemented on macOS.
		 */
    native public App on(def.electron.StringTypes.open_file event, java.util.function.BiConsumer<Event,String> listener);
    /**
		 * Emitted when the user wants to open a URL with the application.
		 * The URL scheme must be registered to be opened by your application.
		 *
		 * You should call event.preventDefault() if you want to handle this event.
		 *
		 * Note: This is only implemented on macOS.
		 */
    native public App on(def.electron.StringTypes.open_url event, java.util.function.BiConsumer<Event,String> listener);
    /**
		 * Emitted when the application is activated, which usually happens when clicks on the applications’s dock icon.
		 * Note: This is only implemented on macOS.
		 */
    native public App on(def.electron.StringTypes.activate event, Function listener);
    /**
		 * Emitted during Handoff when an activity from a different device wants to be resumed.
		 * You should call event.preventDefault() if you want to handle this event.
		 */
    native public App on(def.electron.StringTypes.continue_activity event, jsweet.util.function.TriConsumer<Event,String,Object> listener);
    /**
		 * Emitted when a browserWindow gets blurred.
		 */
    native public App on(def.electron.StringTypes.browser_window_blur event, java.util.function.BiConsumer<Event,BrowserWindow> listener);
    /**
		 * Emitted when a browserWindow gets focused.
		 */
    native public App on(def.electron.StringTypes.browser_window_focus event, java.util.function.BiConsumer<Event,BrowserWindow> listener);
    /**
		 * Emitted when a new browserWindow is created.
		 */
    native public App on(def.electron.StringTypes.browser_window_created event, java.util.function.BiConsumer<Event,BrowserWindow> listener);
    /**
		 * Emitted when a new webContents is created.
		 */
    native public App on(def.electron.StringTypes.web_contents_created event, java.util.function.BiConsumer<Event,WebContents> listener);
    /**
		 * Emitted when failed to verify the certificate for url, to trust the certificate
		 * you should prevent the default behavior with event.preventDefault() and call callback(true).
		 */
    native public App on(def.electron.StringTypes.certificate_error event, Consumer6<Event,WebContents,String,String,Certificate,java.util.function.Consumer<Boolean>> listener);
    /**
		 * Emitted when a client certificate is requested.
		 *
		 * The url corresponds to the navigation entry requesting the client certificate
		 * and callback needs to be called with an entry filtered from the list.
		 * Using event.preventDefault() prevents the application from using the first certificate from the store.
		 */
    native public App on(def.electron.StringTypes.select_client_certificate event, Consumer5<Event,WebContents,String,Certificate[],java.util.function.Consumer<Certificate>> listener);
    /**
		 * Emitted when webContents wants to do basic auth.
		 *
		 * The default behavior is to cancel all authentications, to override this
		 * you should prevent the default behavior with event.preventDefault()
		 * and call callback(username, password) with the credentials.
		 */
    native public App on(def.electron.StringTypes.login event, Consumer5<Event,WebContents,LoginRequest,LoginAuthInfo,java.util.function.BiConsumer<String,String>> listener);
    /**
		 * Emitted when the gpu process crashes.
		 */
    native public App on(def.electron.StringTypes.gpu_process_crashed event, java.util.function.BiConsumer<Event,Boolean> listener);
    /**
		 * Emitted when Chrome's accessibility support changes.
		 *
		 * Note: This API is only available on macOS and Windows.
		 */
    native public App on(def.electron.StringTypes.accessibility_support_changed event, java.util.function.BiConsumer<Event,Boolean> listener);
    native public App on(String event, Function listener);
    /**
		 * Try to close all windows. The before-quit event will first be emitted.
		 * If all windows are successfully closed, the will-quit event will be emitted
		 * and by default the application would be terminated.
		 *
		 * This method guarantees all beforeunload and unload handlers are correctly
		 * executed. It is possible that a window cancels the quitting by returning
		 * false in beforeunload handler.
		 */
    native public void quit();
    /**
		 * Exits immediately with exitCode.
		 * All windows will be closed immediately without asking user
		 * and the before-quit and will-quit events will not be emitted.
		 */
    native public void exit(double exitCode);
    /**
		 * Relaunches the app when current instance exits.
		 *
		 * By default the new instance will use the same working directory
		 * and command line arguments with current instance.
		 * When args is specified, the args will be passed as command line arguments instead.
		 * When execPath is specified, the execPath will be executed for relaunch instead of current app.
		 *
		 * Note that this method does not quit the app when executed, you have to call app.quit
		 * or app.exit after calling app.relaunch to make the app restart.
		 *
		 * When app.relaunch is called for multiple times, multiple instances
		 * will be started after current instance exited.
		 */
    native public void relaunch(Options options);
    /**
		 * @returns Whether Electron has finished initializing.
		 */
    native public Boolean isReady();
    /**
		 * On Linux, focuses on the first visible window.
		 * On macOS, makes the application the active app.
		 * On Windows, focuses on the application’s first window.
		 */
    native public void focus();
    /**
		 * Hides all application windows without minimizing them.
		 * Note: This is only implemented on macOS.
		 */
    native public void hide();
    /**
		 * Shows application windows after they were hidden. Does not automatically focus them.
		 * Note: This is only implemented on macOS.
		 */
    native public void show();
    /**
		 * Returns the current application directory.
		 */
    native public String getAppPath();
    /**
		 * @returns The path to a special directory or file associated with name.
		 * On failure an Error would throw.
		 */
    native public String getPath(Object name);
    /**
		 * Overrides the path to a special directory or file associated with name.
		 * If the path specifies a directory that does not exist, the directory will
		 * be created by this method. On failure an Error would throw.
		 *
		 * You can only override paths of names defined in app.getPath.
		 *
		 * By default web pages' cookies and caches will be stored under userData
		 * directory, if you want to change this location, you have to override the
		 * userData path before the ready event of app module gets emitted.
		 */
    native public void setPath(Object name, String path);
    /**
		 * @returns The version of loaded application, if no version is found in
		 * application's package.json, the version of current bundle or executable.
		 */
    native public String getVersion();
    /**
		 * @returns The current application's name, the name in package.json would be used.
		 * Usually the name field of package.json is a short lowercased name, according to
		 * the spec of npm modules. So usually you should also specify a productName field,
		 * which is your application's full capitalized name, and it will be preferred over
		 * name by Electron.
		 */
    native public String getName();
    /**
		 * Overrides the current application's name.
		 */
    native public void setName(String name);
    /**
		  * @returns The current application locale.
		  */
    native public String getLocale();
    /**
		 * Adds path to recent documents list.
		 *
		 * This list is managed by the system, on Windows you can visit the list from
		 * task bar, and on macOS you can visit it from dock menu.
		 *
		 * Note: This is only implemented on macOS and Windows.
		 */
    native public void addRecentDocument(String path);
    /**
		 * Clears the recent documents list.
		 *
		 * Note: This is only implemented on macOS and Windows.
		 */
    native public void clearRecentDocuments();
    /**
		 * Sets the current executable as the default handler for a protocol (aka URI scheme).
		 * Once registered, all links with your-protocol:// will be opened with the current executable.
		 * The whole link, including protocol, will be passed to your application as a parameter.
		 *
		 * On Windows you can provide optional parameters path, the path to your executable,
		 * and args, an array of arguments to be passed to your executable when it launches.
		 *
		 * @param protocol The name of your protocol, without ://.
		 * @param path Defaults to process.execPath.
		 * @param args Defaults to an empty array.
		 *
		 * Note: This is only implemented on macOS and Windows.
		 *       On macOS, you can only register protocols that have been added to your app's info.plist.
		 */
    native public Boolean setAsDefaultProtocolClient(String protocol, String path, String[] args);
    /**
		 * Removes the current executable as the default handler for a protocol (aka URI scheme).
		 *
		 * @param protocol The name of your protocol, without ://.
		 * @param path Defaults to process.execPath.
		 * @param args Defaults to an empty array.
		 *
		 * Note: This is only implemented on macOS and Windows.
		 */
    native public Boolean removeAsDefaultProtocolClient(String protocol, String path, String[] args);
    /**
		 * @param protocol The name of your protocol, without ://.
		 * @param path Defaults to process.execPath.
		 * @param args Defaults to an empty array.
		 *
		 * @returns Whether the current executable is the default handler for a protocol (aka URI scheme).
		 *
		 * Note: This is only implemented on macOS and Windows.
		 */
    native public Boolean isDefaultProtocolClient(String protocol, String path, String[] args);
    /**
		 * Adds tasks to the Tasks category of JumpList on Windows.
		 *
		 * Note: This API is only available on Windows.
		 */
    native public Boolean setUserTasks(Task[] tasks);
    /**
		 * Note: This API is only available on Windows.
		 */
    native public JumpListSettings getJumpListSettings();
    /**
		 * Sets or removes a custom Jump List for the application.
		 *
		 * If categories is null the previously set custom Jump List (if any) will be replaced
		 * by the standard Jump List for the app (managed by Windows).
		 *
		 * Note: This API is only available on Windows.
		 */
    native public Object setJumpList(JumpListCategory[] categories);
    /**
		 * This method makes your application a Single Instance Application instead of allowing
		 * multiple instances of your app to run, this will ensure that only a single instance
		 * of your app is running, and other instances signal this instance and exit.
		 */
    native public Boolean makeSingleInstance(java.util.function.BiConsumer<String[],String> callback);
    /**
		 * Releases all locks that were created by makeSingleInstance. This will allow
		 * multiple instances of the application to once again run side by side.
		 */
    native public void releaseSingleInstance();
    /**
		 * Creates an NSUserActivity and sets it as the current activity.
		 * The activity is eligible for Handoff to another device afterward.
		 *
		 * @param type Uniquely identifies the activity. Maps to NSUserActivity.activityType.
		 * @param userInfo App-specific state to store for use by another device.
		 * @param webpageURL The webpage to load in a browser if no suitable app is
		 * 					 installed on the resuming device. The scheme must be http or https.
		 *
		 * Note: This API is only available on macOS.
		 */
    native public void setUserActivity(String type, Object userInfo, String webpageURL);
    /**
		 * @returns The type of the currently running activity.
		 *
		 * Note: This API is only available on macOS.
		 */
    native public String getCurrentActivityType();
    /**
		 * Changes the Application User Model ID to id.
		 *
		 * Note: This is only implemented on Windows.
		 */
    native public void setAppUserModelId(String id);
    /**
		 * Imports the certificate in pkcs12 format into the platform certificate store.
		 * @param callback Called with the result of import operation, a value of 0 indicates success
		 * while any other value indicates failure according to chromium net_error_list.
		 *
		 * Note: This API is only available on Linux.
		 */
    native public void importCertificate(ImportCertificateOptions options, java.util.function.Consumer<Double> callback);
    /**
		 * Disables hardware acceleration for current app.
		 * This method can only be called before app is ready.
		 */
    native public void disableHardwareAcceleration();
    /**
		 * Sets the counter badge for current app. Setting the count to 0 will hide the badge.
		 *
		 * @returns True when the call succeeded, otherwise returns false.
		 *
		 * Note: This API is only available on macOS and Linux.
		 */
    native public Boolean setBadgeCount(double count);
    /**
		 * @returns The current value displayed in the counter badge.
		 *
		 * Note: This API is only available on macOS and Linux.
		 */
    native public double getBadgeCount();
    /**
		 * @returns whether current desktop environment is Unity launcher. (Linux)
		 *
		 * Note: This API is only available on Linux.
		 */
    native public Boolean isUnityRunning();
    /**
		 * Returns a Boolean, true if Chrome's accessibility support is enabled, false otherwise.
		 * This API will return true if the use of assistive technologies, such as screen readers,
		 * has been detected.
		 * See https://www.chromium.org/developers/design-documents/accessibility for more details.
		 *
		 * Note: This API is only available on macOS and Windows.
		 */
    native public Boolean isAccessibilitySupportEnabled();
    /**
		 * @returns an Object with the login item settings of the app.
		 *
		 * Note: This API is only available on macOS and Windows.
		 */
    native public LoginItemSettings getLoginItemSettings();
    /**
		 * Set the app's login item settings.
		 *
		 * Note: This API is only available on macOS and Windows.
		 */
    native public void setLoginItemSettings(LoginItemSettings settings);
    /**
		 * Set the about panel options. This will override the values defined in the app's .plist file.
		 * See the Apple docs for more details.
		 *
		 * Note: This API is only available on macOS.
		 */
    native public void setAboutPanelOptions(AboutPanelOptions options);
    public CommandLine commandLine;
    /**
		 * Note: This API is only available on macOS.
		 */
    public Dock dock;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        @jsweet.lang.Optional
        public String[] args;
        @jsweet.lang.Optional
        public String execPath;
    }
    /**
		 * Exits immediately with exitCode.
		 * All windows will be closed immediately without asking user
		 * and the before-quit and will-quit events will not be emitted.
		 */
    native public void exit();
    /**
		 * Relaunches the app when current instance exits.
		 *
		 * By default the new instance will use the same working directory
		 * and command line arguments with current instance.
		 * When args is specified, the args will be passed as command line arguments instead.
		 * When execPath is specified, the execPath will be executed for relaunch instead of current app.
		 *
		 * Note that this method does not quit the app when executed, you have to call app.quit
		 * or app.exit after calling app.relaunch to make the app restart.
		 *
		 * When app.relaunch is called for multiple times, multiple instances
		 * will be started after current instance exited.
		 */
    native public void relaunch();
    /**
		 * Sets the current executable as the default handler for a protocol (aka URI scheme).
		 * Once registered, all links with your-protocol:// will be opened with the current executable.
		 * The whole link, including protocol, will be passed to your application as a parameter.
		 *
		 * On Windows you can provide optional parameters path, the path to your executable,
		 * and args, an array of arguments to be passed to your executable when it launches.
		 *
		 * @param protocol The name of your protocol, without ://.
		 * @param path Defaults to process.execPath.
		 * @param args Defaults to an empty array.
		 *
		 * Note: This is only implemented on macOS and Windows.
		 *       On macOS, you can only register protocols that have been added to your app's info.plist.
		 */
    native public Boolean setAsDefaultProtocolClient(String protocol, String path);
    /**
		 * Sets the current executable as the default handler for a protocol (aka URI scheme).
		 * Once registered, all links with your-protocol:// will be opened with the current executable.
		 * The whole link, including protocol, will be passed to your application as a parameter.
		 *
		 * On Windows you can provide optional parameters path, the path to your executable,
		 * and args, an array of arguments to be passed to your executable when it launches.
		 *
		 * @param protocol The name of your protocol, without ://.
		 * @param path Defaults to process.execPath.
		 * @param args Defaults to an empty array.
		 *
		 * Note: This is only implemented on macOS and Windows.
		 *       On macOS, you can only register protocols that have been added to your app's info.plist.
		 */
    native public Boolean setAsDefaultProtocolClient(String protocol);
    /**
		 * Removes the current executable as the default handler for a protocol (aka URI scheme).
		 *
		 * @param protocol The name of your protocol, without ://.
		 * @param path Defaults to process.execPath.
		 * @param args Defaults to an empty array.
		 *
		 * Note: This is only implemented on macOS and Windows.
		 */
    native public Boolean removeAsDefaultProtocolClient(String protocol, String path);
    /**
		 * Removes the current executable as the default handler for a protocol (aka URI scheme).
		 *
		 * @param protocol The name of your protocol, without ://.
		 * @param path Defaults to process.execPath.
		 * @param args Defaults to an empty array.
		 *
		 * Note: This is only implemented on macOS and Windows.
		 */
    native public Boolean removeAsDefaultProtocolClient(String protocol);
    /**
		 * @param protocol The name of your protocol, without ://.
		 * @param path Defaults to process.execPath.
		 * @param args Defaults to an empty array.
		 *
		 * @returns Whether the current executable is the default handler for a protocol (aka URI scheme).
		 *
		 * Note: This is only implemented on macOS and Windows.
		 */
    native public Boolean isDefaultProtocolClient(String protocol, String path);
    /**
		 * @param protocol The name of your protocol, without ://.
		 * @param path Defaults to process.execPath.
		 * @param args Defaults to an empty array.
		 *
		 * @returns Whether the current executable is the default handler for a protocol (aka URI scheme).
		 *
		 * Note: This is only implemented on macOS and Windows.
		 */
    native public Boolean isDefaultProtocolClient(String protocol);
    /**
		 * Creates an NSUserActivity and sets it as the current activity.
		 * The activity is eligible for Handoff to another device afterward.
		 *
		 * @param type Uniquely identifies the activity. Maps to NSUserActivity.activityType.
		 * @param userInfo App-specific state to store for use by another device.
		 * @param webpageURL The webpage to load in a browser if no suitable app is
		 * 					 installed on the resuming device. The scheme must be http or https.
		 *
		 * Note: This API is only available on macOS.
		 */
    native public void setUserActivity(String type, Object userInfo);
}

