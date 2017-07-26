package def.electron.electron;
import def.js.Function;
@jsweet.lang.Interface
public abstract class WebContents extends def.js.Object {
    native public Object openDevTools();
    native public WebContents on(String event, Function listener);
    native public Object send(String pipe, def.js.Object data);
}

