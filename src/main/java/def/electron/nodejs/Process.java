package def.electron.nodejs;
import def.js.Function;
@jsweet.lang.Interface
public abstract class Process extends def.js.Object {
    /**
		 * Setting this to true can disable the support for asar archives in Node's built-in modules.
		 */
    @jsweet.lang.Optional
    public Boolean noAsar;
    /**
		 * Process's type
		 */
    public jsweet.util.union.Union<"browser","renderer"> type;
    /**
		 * Path to JavaScript source code.
		 */
    public String resourcesPath;
    /**
		 * For Mac App Store build, this value is true, for other builds it is undefined.
		 */
    @jsweet.lang.Optional
    public Boolean mas;
    /**
		 * If the app is running as a Windows Store app (appx), this value is true, for other builds it is undefined.
		 */
    @jsweet.lang.Optional
    public Boolean windowsStore;
    /**
		 * When app is started by being passed as parameter to the default app,
		 * this value is true in the main process, otherwise it is undefined.
		 */
    @jsweet.lang.Optional
    public Boolean defaultApp;
    /**
		 * Emitted when Electron has loaded its internal initialization script
		 * and is beginning to load the web page or the main script.
		 */
    native public Process on("loaded" event, Function listener);
    native public Process on(String event, Function listener);
    /**
		 * Causes the main thread of the current process crash;
		 */
    native public void crash();
    /**
		 * Causes the main thread of the current process hang.
		 */
    native public void hang();
    /**
		 * Sets the file descriptor soft limit to maxDescriptors or the OS hard limit,
		 * whichever is lower for the current process.
		 *
		 * Note: This API is only available on macOS and Linux.
		 */
    native public void setFdLimit(double maxDescriptors);
    /**
		 * @returns Object giving memory usage statistics about the current process.
		 * Note: All statistics are reported in Kilobytes.
		 */
    native public ProcessMemoryInfo getProcessMemoryInfo();
    /**
		 * @returns Object giving memory usage statistics about the entire system.
		 * Note: All statistics are reported in Kilobytes.
		 */
    native public SystemMemoryInfo getSystemMemoryInfo();
}

