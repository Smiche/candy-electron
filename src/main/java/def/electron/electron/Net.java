package def.electron.electron;
/**
	 * The net module is a client-side API for issuing HTTP(S) requests.
	 * It is similar to the HTTP and HTTPS modules of Node.js but uses Chromium’s native
	 * networking library instead of the Node.js implementation, offering better support
	 * for web proxies.
	 * The following is a non-exhaustive list of why you may consider using the net module
	 * instead of the native Node.js modules:
	 * - Automatic management of system proxy configuration, support of the wpad protocol
	 * and proxy pac configuration files.
	 * - Automatic tunneling of HTTPS requests.
	 * - Support for authenticating proxies using basic, digest, NTLM, Kerberos or negotiate
	 * authentication schemes.
	 * - Support for traffic monitoring proxies: Fiddler-like proxies used for access control
	 * and monitoring.
	 *
	 * The net module API has been specifically designed to mimic, as closely as possible,
	 * the familiar Node.js API. The API components including classes, methods,
	 * properties and event names are similar to those commonly used in Node.js.
	 *
	 * The net API can be used only after the application emits the ready event.
	 * Trying to use the module before the ready event will throw an error.
	 */
@jsweet.lang.Interface
public abstract class Net extends def.js.Object {
    /**
		 * @param options The ClientRequest constructor options.
		 * @param callback A one time listener for the response event.
		 *
		 * @returns a ClientRequest instance using the provided options which are directly
		 * forwarded to the ClientRequest constructor.
		 */
    native public ClientRequest request(String options, java.util.function.Consumer<IncomingMessage> callback);
    /**
		 * @param options The ClientRequest constructor options.
		 * @param callback A one time listener for the response event.
		 *
		 * @returns a ClientRequest instance using the provided options which are directly
		 * forwarded to the ClientRequest constructor.
		 */
    native public ClientRequest request(String options);
    /**
		 * @param options The ClientRequest constructor options.
		 * @param callback A one time listener for the response event.
		 *
		 * @returns a ClientRequest instance using the provided options which are directly
		 * forwarded to the ClientRequest constructor.
		 */
    native public ClientRequest request(RequestOptions options, java.util.function.Consumer<IncomingMessage> callback);
    /**
		 * @param options The ClientRequest constructor options.
		 * @param callback A one time listener for the response event.
		 *
		 * @returns a ClientRequest instance using the provided options which are directly
		 * forwarded to the ClientRequest constructor.
		 */
    native public ClientRequest request(RequestOptions options);
}

