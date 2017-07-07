package def.electron.electron;
/**
	 * The ipcMain module handles asynchronous and synchronous messages
	 * sent from a renderer process (web page).
	 * Messages sent from a renderer will be emitted to this module.
	 */
@jsweet.lang.Interface
public abstract class IpcMain extends def.js.Object {
    native public IpcMain addListener(String channel, java.util.function.BiConsumer<IpcMainEvent,Object> listener);
    native public IpcMain on(String channel, java.util.function.BiConsumer<IpcMainEvent,Object> listener);
    native public IpcMain once(String channel, java.util.function.BiConsumer<IpcMainEvent,Object> listener);
    native public IpcMain removeListener(String channel, java.util.function.BiConsumer<IpcMainEvent,Object> listener);
    native public IpcMain removeAllListeners(String channel);
    native public IpcMain removeAllListeners();
}

