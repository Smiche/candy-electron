package def.electron.electron;
@jsweet.lang.Interface
public abstract class WebContents extends def.js.Object {
    native public Object openDevTools();
    native public WebContents on(String event, Runnable listener);
    native public WebContents on(String event, NewWindowCallback<Event, String, String, Object, BrowserWindowOptions, Object> callback);
    native public Object send(String pipe, def.js.Object data);
    native public void printToPDF(PrintOptions options, java.util.function.BiConsumer<?, ?> callback);
    native public void print();
}

