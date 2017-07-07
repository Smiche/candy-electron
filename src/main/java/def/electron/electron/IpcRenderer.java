package def.electron.electron;
/**
	 * The ipcRenderer module provides a few methods so you can send synchronous
	 * and asynchronous messages from the render process (web page) to the main process.
	 * You can also receive replies from the main process.
	 */
@jsweet.lang.Interface
public abstract class IpcRenderer extends def.js.Object {
    native public IpcRenderer addListener(String channel, java.util.function.BiConsumer<IpcRendererEvent,Object> listener);
    native public IpcRenderer on(String channel, java.util.function.BiConsumer<IpcRendererEvent,Object> listener);
    native public IpcRenderer once(String channel, java.util.function.BiConsumer<IpcRendererEvent,Object> listener);
    native public IpcRenderer removeListener(String channel, java.util.function.BiConsumer<IpcRendererEvent,Object> listener);
    native public IpcRenderer removeAllListeners(String channel);
    /**
		 * Send ...args to the renderer via channel in asynchronous message, the main
		 * process can handle it by listening to the channel event of ipc module.
		 */
    native public void send(String channel, Object... args);
    /**
		 * Send ...args to the renderer via channel in synchronous message, and returns
		 * the result sent from main process. The main process can handle it by listening
		 * to the channel event of ipc module, and returns by setting event.returnValue.
		 * Note: Usually developers should never use this API, since sending synchronous
		 * message would block the whole renderer process.
		 * @returns The result sent from the main process.
		 */
    native public Object sendSync(String channel, Object... args);
    /**
		 * Like ipc.send but the message will be sent to the host page instead of the main process.
		 * This is mainly used by the page in <webview> to communicate with host page.
		 */
    native public void sendToHost(String channel, Object... args);
    native public IpcRenderer removeAllListeners();
}

