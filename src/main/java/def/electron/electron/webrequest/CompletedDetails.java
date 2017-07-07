package def.electron.electron.webrequest;
import def.electron.electron.Headers;
@jsweet.lang.Interface
public abstract class CompletedDetails extends Details {
    public Headers responseHeaders;
    public Boolean fromCache;
    public double statusCode;
    public String statusLine;
}

