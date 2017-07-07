package def.electron.electron.webviewelement;
import def.electron.electron.Headers;
@jsweet.lang.Interface
public abstract class DidGetRedirectRequestEvent extends Event {
    public String oldURL;
    public String newURL;
    public Boolean isMainFrame;
    public double httpResponseCode;
    public String requestMethod;
    public String referrer;
    public Headers headers;
}

