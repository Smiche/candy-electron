package def.electron.electron.webrequest;
import def.electron.electron.Headers;
@jsweet.lang.Interface
public abstract class BeforeRedirectDetails extends Details {
    public String redirectURL;
    public double statusCode;
    @jsweet.lang.Optional
    public String ip;
    public Boolean fromCache;
    public Headers responseHeaders;
}

