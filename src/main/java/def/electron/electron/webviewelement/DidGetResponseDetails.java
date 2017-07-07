package def.electron.electron.webviewelement;
import def.electron.electron.Headers;
@jsweet.lang.Interface
public abstract class DidGetResponseDetails extends Event {
    public Boolean status;
    public String newURL;
    public String originalURL;
    public double httpResponseCode;
    public String requestMethod;
    public String referrer;
    public Headers headers;
    public String resourceType;
}

