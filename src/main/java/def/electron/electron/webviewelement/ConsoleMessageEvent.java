package def.electron.electron.webviewelement;
@jsweet.lang.Interface
public abstract class ConsoleMessageEvent extends Event {
    public double level;
    public String message;
    public double line;
    public String sourceId;
}

