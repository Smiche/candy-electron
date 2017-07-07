package def.electron.electron;
import jsweet.util.union.Union3;
@jsweet.lang.Interface
public abstract class LoadURLOptions extends def.js.Object {
    /**
		 * HTTP Referrer URL.
		 */
    @jsweet.lang.Optional
    public String httpReferrer;
    /**
		 * User agent originating the request.
		 */
    @jsweet.lang.Optional
    public String userAgent;
    /**
		 * Extra headers separated by "\n"
		 */
    @jsweet.lang.Optional
    public String extraHeaders;
    /**
		 * POST data
		 */
    @jsweet.lang.Optional
    public Union3<UploadRawData,UploadFileSystem,UploadBlob>[] postData;
}

