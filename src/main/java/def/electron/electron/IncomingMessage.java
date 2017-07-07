package def.electron.electron;
import def.js.Error;
import def.js.Function;
/**
	 * An IncomingMessage represents an HTTP response.
	 */
@jsweet.lang.Interface
public abstract class IncomingMessage extends def.js.Object {
    /**
		 * The data event is the usual method of transferring response data into applicative code.
		 */
    native public IncomingMessage on("data" event, java.util.function.Consumer<Buffer> listener);
    /**
		 * Indicates that response body has ended.
		 */
    native public IncomingMessage on("end" event, java.lang.Runnable listener);
    /**
		 * Emitted when a request has been canceled during an ongoing HTTP transaction.
		 */
    native public IncomingMessage on("aborted" event, java.lang.Runnable listener);
    /**
		 * Emitted when an error was encountered while streaming response data events.
		 * For instance, if the server closes the underlying while the response is still
		 * streaming, an error event will be emitted on the response object and a close
		 * event will subsequently follow on the request object.
		 */
    native public IncomingMessage on("error" event, java.util.function.Consumer<Error> listener);
    native public IncomingMessage on(String event, Function listener);
    /**
		 * An Integer indicating the HTTP response status code.
		 */
    public double statusCode;
    /**
		 * A String representing the HTTP status message.
		 */
    public String statusMessage;
    /**
		 * An object representing the response HTTP headers. The headers object is formatted as follows:
		 * - All header names are lowercased.
		 * - Each header name produces an array-valued property on the headers object.
		 * - Each header value is pushed into the array associated with its header name.
		 */
    public Headers headers;
    /**
		 * A string indicating the HTTP protocol version number. Typical values are ‘1.0’ or ‘1.1’.
		 */
    public String httpVersion;
    /**
		 * An integer-valued read-only property that returns the HTTP major version number.
		 */
    public double httpVersionMajor;
    /**
		 * An integer-valued read-only property that returns the HTTP minor version number.
		 */
    public double httpVersionMinor;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Headers extends def.js.Object {
        native public String[] $get(String key);
    }
}

