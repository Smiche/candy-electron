package def.electron.electron;
import def.js.Function;
@jsweet.lang.Interface
public abstract class App extends def.js.Object {
    native public App on(String event, java.util.function.Consumer<Object> listener);
    native public Object quit();
}

