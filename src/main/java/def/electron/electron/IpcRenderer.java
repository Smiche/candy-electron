package def.electron.electron;
import def.js.Function;
@jsweet.lang.Interface
public abstract class IpcRenderer extends def.js.Object {
    native public Object send(String pipe, Object data);
    native public Object on(String event, java.util.function.Consumer<Object> listener);
}

