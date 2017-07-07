package def.electron.electron.webrequest;
import def.electron.electron.Headers;
@jsweet.lang.Interface
public abstract class ResponseStartedDetails extends Details {
    public Headers responseHeaders;
    public Boolean fromCache;
    public double statusCode;
    public String statusLine;
}

