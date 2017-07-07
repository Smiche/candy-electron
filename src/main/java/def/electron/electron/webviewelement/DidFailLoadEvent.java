package def.electron.electron.webviewelement;
@jsweet.lang.Interface
public abstract class DidFailLoadEvent extends Event {
    public double errorCode;
    public String errorDescription;
    public String validatedURL;
    public Boolean isMainFrame;
}

