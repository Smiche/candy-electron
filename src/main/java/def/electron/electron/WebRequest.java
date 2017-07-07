package def.electron.electron;
/**
	 * Each API accepts an optional filter and a listener, the listener will be called when the API's event has happened.
	 * Passing null as listener will unsubscribe from the event.
	 *
	 * The filter will be used to filter out the requests that do not match the URL patterns.
	 * If the filter is omitted then all requests will be matched.
	 *
	 * For certain events the listener is passed with a callback,
	 * which should be called with an response object when listener has done its work.
	 */
@jsweet.lang.Interface
public abstract class WebRequest extends def.js.Object {
    /**
		 * The listener will be called when a request is about to occur.
		 */
    native public void onBeforeRequest(java.util.function.BiConsumer<def.electron.electron.webrequest.BeforeRequestDetails,java.util.function.Consumer<Response>> listener);
    /**
		 * The listener will be called when a request is about to occur.
		 */
    native public void onBeforeRequest(def.electron.electron.webrequest.Filter filter, java.util.function.BiConsumer<def.electron.electron.webrequest.BeforeRequestDetails,java.util.function.Consumer<Response>> listener);
    /**
		 * The listener will be called before sending an HTTP request, once the request headers are available.
		 * This may occur after a TCP connection is made to the server, but before any http data is sent.
		 */
    native public void onBeforeSendHeaders(java.util.function.BiConsumer<def.electron.electron.webrequest.BeforeSendHeadersDetails,java.util.function.Consumer<ResponseData>> listener);
    /**
		 * The listener will be called before sending an HTTP request, once the request headers are available.
		 * This may occur after a TCP connection is made to the server, but before any http data is sent.
		 */
    native public void onBeforeSendHeaders(def.electron.electron.webrequest.Filter filter, java.util.function.BiConsumer<def.electron.electron.webrequest.BeforeSendHeadersDetails,java.util.function.Consumer<ResponseData>> listener);
    /**
		 * The listener will be called just before a request is going to be sent to the server,
		 * modifications of previous onBeforeSendHeaders response are visible by the time this listener is fired.
		 */
    native public void onSendHeaders(java.util.function.Consumer<def.electron.electron.webrequest.SendHeadersDetails> listener);
    /**
		 * The listener will be called just before a request is going to be sent to the server,
		 * modifications of previous onBeforeSendHeaders response are visible by the time this listener is fired.
		 */
    native public void onSendHeaders(def.electron.electron.webrequest.Filter filter, java.util.function.Consumer<def.electron.electron.webrequest.SendHeadersDetails> listener);
    /**
		 * The listener will be called when HTTP response headers of a request have been received.
		 */
    native public void onHeadersReceived(java.util.function.BiConsumer<def.electron.electron.webrequest.HeadersReceivedDetails,java.util.function.Consumer<ResponseDto>> listener);
    /**
		 * The listener will be called when HTTP response headers of a request have been received.
		 */
    native public void onHeadersReceived(def.electron.electron.webrequest.Filter filter, java.util.function.BiConsumer<def.electron.electron.webrequest.HeadersReceivedDetails,java.util.function.Consumer<ResponseDto>> listener);
    /**
		 * The listener will be called when first byte of the response body is received.
		 * For HTTP requests, this means that the status line and response headers are available.
		 */
    native public void onResponseStarted(java.util.function.Consumer<def.electron.electron.webrequest.ResponseStartedDetails> listener);
    /**
		 * The listener will be called when first byte of the response body is received.
		 * For HTTP requests, this means that the status line and response headers are available.
		 */
    native public void onResponseStarted(def.electron.electron.webrequest.Filter filter, java.util.function.Consumer<def.electron.electron.webrequest.ResponseStartedDetails> listener);
    /**
		 * The listener will be called when a server initiated redirect is about to occur.
		 */
    native public void onBeforeRedirect(java.util.function.Consumer<def.electron.electron.webrequest.BeforeRedirectDetails> listener);
    /**
		 * The listener will be called when a server initiated redirect is about to occur.
		 */
    native public void onBeforeRedirect(def.electron.electron.webrequest.Filter filter, java.util.function.Consumer<def.electron.electron.webrequest.BeforeRedirectDetails> listener);
    /**
		 * The listener will be called when a request is completed.
		 */
    native public void onCompleted(java.util.function.Consumer<def.electron.electron.webrequest.CompletedDetails> listener);
    /**
		 * The listener will be called when a request is completed.
		 */
    native public void onCompleted(def.electron.electron.webrequest.Filter filter, java.util.function.Consumer<def.electron.electron.webrequest.CompletedDetails> listener);
    /**
		 * The listener will be called when an error occurs.
		 */
    native public void onErrorOccurred(java.util.function.Consumer<def.electron.electron.webrequest.ErrorOccurredDetails> listener);
    /**
		 * The listener will be called when an error occurs.
		 */
    native public void onErrorOccurred(def.electron.electron.webrequest.Filter filter, java.util.function.Consumer<def.electron.electron.webrequest.ErrorOccurredDetails> listener);
}

