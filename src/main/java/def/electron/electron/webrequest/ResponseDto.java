package def.electron.electron.webrequest;
import def.electron.electron.Headers;
/** This is an automatically generated object type (see the source definition). */
@jsweet.lang.ObjectType
public class ResponseDto extends def.js.Object {
    @jsweet.lang.Optional
    public Boolean cancel;
    /**
			 * When provided, the server is assumed to have responded with these headers.
			 */
    @jsweet.lang.Optional
    public Headers responseHeaders;
    /**
			 * Should be provided when overriding responseHeaders to change header status
			 * otherwise original response header's status will be used.
			 */
    @jsweet.lang.Optional
    public String statusLine;
}

