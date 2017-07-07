package def.electron.electron;
/**
	 * The remote module provides a simple way to do inter-process communication (IPC)
	 * between the renderer process (web page) and the main process.
	 */
@jsweet.lang.Interface
public abstract class Remote extends CommonElectron {
    /**
		 * @returns The object returned by require(module) in the main process.
		 */
    native public Object require(String module);
    /**
		 * @returns The BrowserWindow object which this web page belongs to.
		 */
    native public BrowserWindow getCurrentWindow();
    /**
		 * @returns The WebContents object of this web page.
		 */
    native public WebContents getCurrentWebContents();
    /**
		 * @returns The global variable of name (e.g. global[name]) in the main process.
		 */
    native public Object getGlobal(String name);
    /**
		 * Returns the process object in the main process. This is the same as
		 * remote.getGlobal('process'), but gets cached.
		 */
    public def.electron.nodejs.Process process;
}

