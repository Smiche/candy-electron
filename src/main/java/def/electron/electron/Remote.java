package def.electron.electron;
@jsweet.lang.Interface
public abstract class Remote extends CommonElectron {
    native public Object require(String module);
    native public BrowserWindow getCurrentWindow();
    native public WebContents getCurrentWebContents();
    native public Object getGlobal(String name);
}

