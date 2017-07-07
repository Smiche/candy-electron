package def.electron.electron;
@jsweet.lang.Interface
public abstract class IpcMainEvent extends def.js.Object {
    /**
		 * Set this to the value to be returned in a synchronous message.
		 */
    @jsweet.lang.Optional
    public Object returnValue;
    /**
		 * Returns the webContents that sent the message, you can call sender.send
		 * to reply to the asynchronous message.
		 */
    public WebContents sender;
}

