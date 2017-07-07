package def.electron.electron.webviewelement;
@jsweet.lang.Interface
public abstract class IpcMessageEvent extends Event {
    public String channel;
    public Object[] args;
}

