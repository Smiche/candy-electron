package def.electron.electron;
import def.js.Function;
@jsweet.lang.Interface
public abstract class Event extends def.js.Object {
    public Function preventDefault;
    public nodejs.EventEmitter sender;
    native public java.lang.Object preventDefault(java.lang.Object... args);
}

