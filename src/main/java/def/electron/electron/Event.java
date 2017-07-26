package def.electron.electron;
import def.js.Function;
@jsweet.lang.Interface
public abstract class Event extends def.js.Object {
    public Function preventDefault;
    public Object sender;
    public BrowserWindow newGuest;
    native public java.lang.Object preventDefault(java.lang.Object... args);
}

