package def.electron.electron.webviewelement;
@jsweet.lang.Interface
public abstract class DidNavigateInPageEvent extends Event {
    public String url;
    public Boolean isMainFrame;
}

