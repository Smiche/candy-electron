package def.electron.electron;
import def.js.Error;
import def.js.Function;
/**
	 * The ClientRequest class represents an HTTP request.
	 */
public class ClientRequest extends def.js.Object {
    /**
		 * Emitted when an HTTP response is received for the request. 
		 */
    native public ClientRequest on("response" event, java.util.function.Consumer<IncomingMessage> listener);
    /**
		 * Emitted when an authenticating proxy is asking for user credentials.
		 * The callback function is expected to be called back with user credentials.
		 * Providing empty credentials will cancel the request and report an authentication
		 * error on the response object.
		 */
    native public ClientRequest on("login" event, java.util.function.BiConsumer<LoginAuthInfo,java.util.function.BiConsumer<String,String>> listener);
    /**
		 * Emitted just after the last chunk of the request’s data has been written into
		 * the request object.
		 */
    native public ClientRequest on("finish" event, java.lang.Runnable listener);
    /**
		 * Emitted when the request is aborted. The abort event will not be fired if the
		 * request is already closed.
		 */
    native public ClientRequest on("abort" event, java.lang.Runnable listener);
    /**
		 * Emitted when the net module fails to issue a network request.
		 * Typically when the request object emits an error event, a close event will
		 * subsequently follow and no response object will be provided.
		 */
    native public ClientRequest on("error" event, java.util.function.Consumer<Error> listener);
    /**
		 * Emitted as the last event in the HTTP request-response transaction.
		 * The close event indicates that no more events will be emitted on either the
		 * request or response objects.
		 */
    native public ClientRequest on("close" event, java.lang.Runnable listener);
    native public ClientRequest on(String event, Function listener);
    /**
		 * A Boolean specifying whether the request will use HTTP chunked transfer encoding or not.
		 * Defaults to false. The property is readable and writable, however it can be set only before
		 * the first write operation as the HTTP headers are not yet put on the wire.
		 * Trying to set the chunkedEncoding property after the first write will throw an error.
		 *
		 * Using chunked encoding is strongly recommended if you need to send a large request
		 * body as data will be streamed in small chunks instead of being internally buffered
		 * inside Electron process memory.
		 */
    public Boolean chunkedEncoding;
    /**
		 * @param options If options is a String, it is interpreted as the request URL.
		 * If it is an object, it is expected to be a RequestOptions.
		 * @param callback A one time listener for the response event.
		 */
    public ClientRequest(String options, java.util.function.Consumer<IncomingMessage> callback){}
    /**
		 * Adds an extra HTTP header. The header name will issued as it is without lowercasing.
		 * It can be called only before first write. Calling this method after the first write
		 * will throw an error.
		 * @param name An extra HTTP header name.
		 * @param value An extra HTTP header value.
		 */
    native public void setHeader(String name, String value);
    /**
		 * @param name Specify an extra header name.
		 * @returns The value of a previously set extra header name.
		 */
    native public String getHeader(String name);
    /**
		 * Removes a previously set extra header name. This method can be called only before first write.
		 * Trying to call it after the first write will throw an error.
		 * @param name Specify an extra header name.
		 */
    native public void removeHeader(String name);
    /**
		 * Adds a chunk of data to the request body. The first write operation may cause the
		 * request headers to be issued on the wire.
		 * After the first write operation, it is not allowed to add or remove a custom header.
		 * @param chunk A chunk of the request body’s data. If it is a string, it is converted
		 * into a Buffer using the specified encoding.
		 * @param encoding Used to convert string chunks into Buffer objects. Defaults to ‘utf-8’.
		 * @param callback Called after the write operation ends.
		 */
    native public Boolean write(String chunk, String encoding, Function callback);
    /**
		 * Sends the last chunk of the request data. Subsequent write or end operations will not be allowed.
		 * The finish event is emitted just after the end operation.
		 * @param chunk A chunk of the request body’s data. If it is a string, it is converted into
		 * a Buffer using the specified encoding.
		 * @param encoding Used to convert string chunks into Buffer objects. Defaults to ‘utf-8’.
		 * @param callback Called after the write operation ends.
		 *
		 */
    native public Boolean end(String chunk, String encoding, Function callback);
    /**
		 * Cancels an ongoing HTTP transaction. If the request has already emitted the close event,
		 * the abort operation will have no effect.
		 * Otherwise an ongoing event will emit abort and close events.
		 * Additionally, if there is an ongoing response object,it will emit the aborted event.
		 */
    native public void abort();
    /**
		 * @param options If options is a String, it is interpreted as the request URL.
		 * If it is an object, it is expected to be a RequestOptions.
		 * @param callback A one time listener for the response event.
		 */
    public ClientRequest(String options){}
    /**
		 * Adds a chunk of data to the request body. The first write operation may cause the
		 * request headers to be issued on the wire.
		 * After the first write operation, it is not allowed to add or remove a custom header.
		 * @param chunk A chunk of the request body’s data. If it is a string, it is converted
		 * into a Buffer using the specified encoding.
		 * @param encoding Used to convert string chunks into Buffer objects. Defaults to ‘utf-8’.
		 * @param callback Called after the write operation ends.
		 */
    native public Boolean write(String chunk, String encoding);
    /**
		 * Adds a chunk of data to the request body. The first write operation may cause the
		 * request headers to be issued on the wire.
		 * After the first write operation, it is not allowed to add or remove a custom header.
		 * @param chunk A chunk of the request body’s data. If it is a string, it is converted
		 * into a Buffer using the specified encoding.
		 * @param encoding Used to convert string chunks into Buffer objects. Defaults to ‘utf-8’.
		 * @param callback Called after the write operation ends.
		 */
    native public Boolean write(String chunk);
    /**
		 * Sends the last chunk of the request data. Subsequent write or end operations will not be allowed.
		 * The finish event is emitted just after the end operation.
		 * @param chunk A chunk of the request body’s data. If it is a string, it is converted into
		 * a Buffer using the specified encoding.
		 * @param encoding Used to convert string chunks into Buffer objects. Defaults to ‘utf-8’.
		 * @param callback Called after the write operation ends.
		 *
		 */
    native public Boolean end(String chunk, String encoding);
    /**
		 * Sends the last chunk of the request data. Subsequent write or end operations will not be allowed.
		 * The finish event is emitted just after the end operation.
		 * @param chunk A chunk of the request body’s data. If it is a string, it is converted into
		 * a Buffer using the specified encoding.
		 * @param encoding Used to convert string chunks into Buffer objects. Defaults to ‘utf-8’.
		 * @param callback Called after the write operation ends.
		 *
		 */
    native public Boolean end(String chunk);
    /**
		 * Sends the last chunk of the request data. Subsequent write or end operations will not be allowed.
		 * The finish event is emitted just after the end operation.
		 * @param chunk A chunk of the request body’s data. If it is a string, it is converted into
		 * a Buffer using the specified encoding.
		 * @param encoding Used to convert string chunks into Buffer objects. Defaults to ‘utf-8’.
		 * @param callback Called after the write operation ends.
		 *
		 */
    native public Boolean end();
    /**
		 * @param options If options is a String, it is interpreted as the request URL.
		 * If it is an object, it is expected to be a RequestOptions.
		 * @param callback A one time listener for the response event.
		 */
    public ClientRequest(RequestOptions options, java.util.function.Consumer<IncomingMessage> callback){}
    /**
		 * Adds a chunk of data to the request body. The first write operation may cause the
		 * request headers to be issued on the wire.
		 * After the first write operation, it is not allowed to add or remove a custom header.
		 * @param chunk A chunk of the request body’s data. If it is a string, it is converted
		 * into a Buffer using the specified encoding.
		 * @param encoding Used to convert string chunks into Buffer objects. Defaults to ‘utf-8’.
		 * @param callback Called after the write operation ends.
		 */
    native public Boolean write(Buffer chunk, String encoding, Function callback);
    /**
		 * Sends the last chunk of the request data. Subsequent write or end operations will not be allowed.
		 * The finish event is emitted just after the end operation.
		 * @param chunk A chunk of the request body’s data. If it is a string, it is converted into
		 * a Buffer using the specified encoding.
		 * @param encoding Used to convert string chunks into Buffer objects. Defaults to ‘utf-8’.
		 * @param callback Called after the write operation ends.
		 *
		 */
    native public Boolean end(Buffer chunk, String encoding, Function callback);
    /**
		 * @param options If options is a String, it is interpreted as the request URL.
		 * If it is an object, it is expected to be a RequestOptions.
		 * @param callback A one time listener for the response event.
		 */
    public ClientRequest(RequestOptions options){}
    /**
		 * Adds a chunk of data to the request body. The first write operation may cause the
		 * request headers to be issued on the wire.
		 * After the first write operation, it is not allowed to add or remove a custom header.
		 * @param chunk A chunk of the request body’s data. If it is a string, it is converted
		 * into a Buffer using the specified encoding.
		 * @param encoding Used to convert string chunks into Buffer objects. Defaults to ‘utf-8’.
		 * @param callback Called after the write operation ends.
		 */
    native public Boolean write(Buffer chunk, String encoding);
    /**
		 * Adds a chunk of data to the request body. The first write operation may cause the
		 * request headers to be issued on the wire.
		 * After the first write operation, it is not allowed to add or remove a custom header.
		 * @param chunk A chunk of the request body’s data. If it is a string, it is converted
		 * into a Buffer using the specified encoding.
		 * @param encoding Used to convert string chunks into Buffer objects. Defaults to ‘utf-8’.
		 * @param callback Called after the write operation ends.
		 */
    native public Boolean write(Buffer chunk);
    /**
		 * Sends the last chunk of the request data. Subsequent write or end operations will not be allowed.
		 * The finish event is emitted just after the end operation.
		 * @param chunk A chunk of the request body’s data. If it is a string, it is converted into
		 * a Buffer using the specified encoding.
		 * @param encoding Used to convert string chunks into Buffer objects. Defaults to ‘utf-8’.
		 * @param callback Called after the write operation ends.
		 *
		 */
    native public Boolean end(Buffer chunk, String encoding);
    /**
		 * Sends the last chunk of the request data. Subsequent write or end operations will not be allowed.
		 * The finish event is emitted just after the end operation.
		 * @param chunk A chunk of the request body’s data. If it is a string, it is converted into
		 * a Buffer using the specified encoding.
		 * @param encoding Used to convert string chunks into Buffer objects. Defaults to ‘utf-8’.
		 * @param callback Called after the write operation ends.
		 *
		 */
    native public Boolean end(Buffer chunk);
    protected ClientRequest(){}
}

