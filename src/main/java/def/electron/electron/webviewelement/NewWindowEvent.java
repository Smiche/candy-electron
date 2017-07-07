package def.electron.electron.webviewelement;
import def.electron.electron.BrowserWindowOptions;
@jsweet.lang.Interface
public abstract class NewWindowEvent extends Event {
    public String url;
    public String frameName;
    public Object disposition;
    public BrowserWindowOptions options;
}

