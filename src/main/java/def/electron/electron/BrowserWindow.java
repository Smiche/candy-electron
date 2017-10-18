package def.electron.electron;
import def.js.Function;
public class BrowserWindow extends def.js.Object {
    public BrowserWindow(BrowserWindowOptions options){}
    native public BrowserWindow on(String event, Function listener);
    native public BrowserWindow on(String event, Runnable listener);
    public WebContents webContents;
    native public Object loadURL(String url);
    native public Object setMenu(Object menu);
    native public void maximize();
    native public void minimize();
    native public void close();
    native public void show();
    native public void blur();
    native public void restore();
    native public void center();
    native public void setKiosk(boolean isKiosk);
    native public boolean isKiosk();
    public BrowserWindow(){}
}

