package def.electron.electron;
import def.js.Error;
/**
	 * The protocol module can register a custom protocol or intercept an existing protocol.
	 */
@jsweet.lang.Interface
public abstract class Protocol extends def.js.Object {
    /**
		 * Registers custom schemes as standard schemes.
		 */
    native public void registerStandardSchemes(String[] schemes);
    /**
		 * Registers custom schemes to handle service workers.
		 */
    native public void registerServiceWorkerSchemes(String[] schemes);
    /**
		 * Registers a protocol of scheme that will send the file as a response.
		 */
    native public void registerFileProtocol(String scheme, java.util.function.BiConsumer<ProtocolRequest,FileProtocolCallback> handler, java.util.function.Consumer<Error> completion);
    /**
		 * Registers a protocol of scheme that will send a Buffer as a response.
		 */
    native public void registerBufferProtocol(String scheme, java.util.function.BiConsumer<ProtocolRequest,BufferProtocolCallback> handler, java.util.function.Consumer<Error> completion);
    /**
		 * Registers a protocol of scheme that will send a String as a response.
		 */
    native public void registerStringProtocol(String scheme, java.util.function.BiConsumer<ProtocolRequest,StringProtocolCallback> handler, java.util.function.Consumer<Error> completion);
    /**
		 * Registers a protocol of scheme that will send an HTTP request as a response.
		 */
    native public void registerHttpProtocol(String scheme, java.util.function.BiConsumer<ProtocolRequest,HttpProtocolCallback> handler, java.util.function.Consumer<Error> completion);
    /**
		 * Unregisters the custom protocol of scheme.
		 */
    native public void unregisterProtocol(String scheme, java.util.function.Consumer<Error> completion);
    /**
		 * The callback will be called with a boolean that indicates whether there is already a handler for scheme.
		 */
    native public void isProtocolHandled(String scheme, java.util.function.Consumer<Boolean> callback);
    /**
		 * Intercepts scheme protocol and uses handler as the protocol’s new handler which sends a file as a response.
		 */
    native public void interceptFileProtocol(String scheme, java.util.function.BiConsumer<ProtocolRequest,FileProtocolCallback> handler, java.util.function.Consumer<Error> completion);
    /**
		 * Intercepts scheme protocol and uses handler as the protocol’s new handler which sends a Buffer as a response.
		 */
    native public void interceptBufferProtocol(String scheme, java.util.function.BiConsumer<ProtocolRequest,BufferProtocolCallback> handler, java.util.function.Consumer<Error> completion);
    /**
		 * Intercepts scheme protocol and uses handler as the protocol’s new handler which sends a String as a response.
		 */
    native public void interceptStringProtocol(String scheme, java.util.function.BiConsumer<ProtocolRequest,StringProtocolCallback> handler, java.util.function.Consumer<Error> completion);
    /**
		 * Intercepts scheme protocol and uses handler as the protocol’s new handler which sends a new HTTP request as a response.
		 */
    native public void interceptHttpProtocol(String scheme, java.util.function.BiConsumer<ProtocolRequest,HttpProtocolCallback> handler, java.util.function.Consumer<Error> completion);
    /**
		 * Remove the interceptor installed for scheme and restore its original handler.
		 */
    native public void uninterceptProtocol(String scheme, java.util.function.Consumer<Error> completion);
    /**
		 * Registers a protocol of scheme that will send the file as a response.
		 */
    native public void registerFileProtocol(String scheme, java.util.function.BiConsumer<ProtocolRequest,FileProtocolCallback> handler);
    /**
		 * Registers a protocol of scheme that will send a Buffer as a response.
		 */
    native public void registerBufferProtocol(String scheme, java.util.function.BiConsumer<ProtocolRequest,BufferProtocolCallback> handler);
    /**
		 * Registers a protocol of scheme that will send a String as a response.
		 */
    native public void registerStringProtocol(String scheme, java.util.function.BiConsumer<ProtocolRequest,StringProtocolCallback> handler);
    /**
		 * Registers a protocol of scheme that will send an HTTP request as a response.
		 */
    native public void registerHttpProtocol(String scheme, java.util.function.BiConsumer<ProtocolRequest,HttpProtocolCallback> handler);
    /**
		 * Unregisters the custom protocol of scheme.
		 */
    native public void unregisterProtocol(String scheme);
    /**
		 * Intercepts scheme protocol and uses handler as the protocol’s new handler which sends a file as a response.
		 */
    native public void interceptFileProtocol(String scheme, java.util.function.BiConsumer<ProtocolRequest,FileProtocolCallback> handler);
    /**
		 * Intercepts scheme protocol and uses handler as the protocol’s new handler which sends a Buffer as a response.
		 */
    native public void interceptBufferProtocol(String scheme, java.util.function.BiConsumer<ProtocolRequest,BufferProtocolCallback> handler);
    /**
		 * Intercepts scheme protocol and uses handler as the protocol’s new handler which sends a String as a response.
		 */
    native public void interceptStringProtocol(String scheme, java.util.function.BiConsumer<ProtocolRequest,StringProtocolCallback> handler);
    /**
		 * Intercepts scheme protocol and uses handler as the protocol’s new handler which sends a new HTTP request as a response.
		 */
    native public void interceptHttpProtocol(String scheme, java.util.function.BiConsumer<ProtocolRequest,HttpProtocolCallback> handler);
    /**
		 * Remove the interceptor installed for scheme and restore its original handler.
		 */
    native public void uninterceptProtocol(String scheme);
}

