package def.electron.electron;
@jsweet.lang.Interface
public abstract class IpcRendererEvent extends def.js.Object {
    /**
		 * You can call sender.send to reply to the asynchronous message.
		 */
    public IpcRenderer sender;
}

