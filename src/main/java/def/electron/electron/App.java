package def.electron.electron;
@jsweet.lang.Interface
public abstract class App extends def.js.Object {
    native public App on(String event, java.util.function.Consumer<Object> listener);
    native public Object quit();
    native public void relaunch(@jsweet.lang.Optional Object options);
    native public void exit(int code);
}

