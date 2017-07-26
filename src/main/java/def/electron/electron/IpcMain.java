package def.electron.electron;
import def.js.Function;
@jsweet.lang.Interface
public abstract class IpcMain extends def.js.Object {
    native public Object on(String event, IpcMainEvent<IpcMainEventItem, def.js.Object> listener);
}

