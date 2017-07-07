package def.electron.electron.webrequest;
import def.electron.electron.Headers;
@jsweet.lang.Interface
public abstract class HeadersReceivedDetails extends Details {
    public String statusLine;
    public double statusCode;
    public Headers responseHeaders;
}

