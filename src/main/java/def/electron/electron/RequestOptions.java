package def.electron.electron;
/**
	 * The RequestOptions interface allows to define various options for an HTTP request.
	 */
@jsweet.lang.Interface
public abstract class RequestOptions extends def.js.Object {
    /**
		 * The HTTP request method. Defaults to the GET method.
		 */
    @jsweet.lang.Optional
    public String method;
    /**
		 * The request URL. Must be provided in the absolute form with the protocol
		 * scheme specified as http or https.
		 */
    @jsweet.lang.Optional
    public String url;
    /**
		 * The Session instance with which the request is associated.
		 */
    @jsweet.lang.Optional
    public Session session;
    /**
		 * The name of the partition with which the request is associated.
		 * Defaults to the empty string. The session option prevails on partition.
		 * Thus if a session is explicitly specified, partition is ignored.
		 */
    @jsweet.lang.Optional
    public String partition;
    /**
		 * The protocol scheme in the form ‘scheme:’. Currently supported values are ‘http:’ or ‘https:’.
		 * Defaults to ‘http:’.
		 */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<"http:","https:"> protocol;
    /**
		 * The server host provided as a concatenation of the hostname and the port number ‘hostname:port’.
		 */
    @jsweet.lang.Optional
    public String host;
    /**
		 * The server host name.
		 */
    @jsweet.lang.Optional
    public String hostname;
    /**
		 * The server’s listening port number.
		 */
    @jsweet.lang.Optional
    public double port;
    /**
		 * The path part of the request URL.
		 */
    @jsweet.lang.Optional
    public String path;
    /**
		 * A map specifying extra HTTP header name/value.
		 */
    @jsweet.lang.Optional
    public Headers headers;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Headers extends def.js.Object {
        native public java.lang.Object $get(String key);
    }
}

