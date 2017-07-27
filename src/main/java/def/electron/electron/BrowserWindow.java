package def.electron.electron;
import def.js.Function;
public class BrowserWindow extends def.js.Object {
    public BrowserWindow(BrowserWindowOptions options){}
    native public BrowserWindow on(String event, Function listener);
    native public BrowserWindow on(String event, Runnable listener);
    public WebContents webContents;
    native public Object loadURL(String url);
    native public Object setMenu(Object menu);
    public BrowserWindow(){}
}

