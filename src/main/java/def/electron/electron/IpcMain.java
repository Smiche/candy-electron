package def.electron.electron;

@jsweet.lang.Interface
public abstract class IpcMain extends def.js.Object {
	public native Object on(String event, IpcMainEvent<IpcMainEventItem, def.js.Object> listener);
}
