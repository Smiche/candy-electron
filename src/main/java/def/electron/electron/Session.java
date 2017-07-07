package def.electron.electron;
import def.dom.URL;
import def.js.Function;
/**
	 * The session module can be used to create new Session objects.
	 * You can also access the session of existing pages by using
	 * the session property of webContents which is a property of BrowserWindow.
	 */
public class Session extends def.js.Object {
    /**
		 * @returns a new Session instance from partition string.
		 */
    native public static Session fromPartition(String partition, FromPartitionOptions options);
    /**
		 * @returns the default session object of the app.
		 */
    public static Session defaultSession;
    /**
		 * Emitted when Electron is about to download item in webContents.
		 * Calling event.preventDefault() will cancel the download
		 * and item will not be available from next tick of the process.
		 */
    native public Session on("will_download" event, jsweet.util.function.TriConsumer<Event,DownloadItem,WebContents> listener);
    native public Session on(String event, Function listener);
    /**
		 * The cookies gives you ability to query and modify cookies.
		 */
    public SessionCookies cookies;
    /**
		 * @returns the session’s current cache size.
		 */
    native public void getCacheSize(java.util.function.Consumer<Double> callback);
    /**
		 * Clears the session’s HTTP cache.
		 */
    native public void clearCache(Function callback);
    /**
		 * Clears the data of web storages.
		 */
    native public void clearStorageData(Function callback);
    /**
		 * Clears the data of web storages.
		 */
    native public void clearStorageData(ClearStorageDataOptions options, Function callback);
    /**
		 * Writes any unwritten DOMStorage data to disk.
		 */
    native public void flushStorageData();
    /**
		 * Sets the proxy settings.
		 */
    native public void setProxy(ProxyConfig config, Function callback);
    /**
		 * Resolves the proxy information for url.
		 */
    native public void resolveProxy(URL url, java.util.function.Consumer<String> callback);
    /**
		 * Sets download saving directory.
		 * By default, the download directory will be the Downloads under the respective app folder.
		 */
    native public void setDownloadPath(String path);
    /**
		 * Emulates network with the given configuration for the session.
		 */
    native public void enableNetworkEmulation(NetworkEmulationOptions options);
    /**
		 * Disables any network emulation already active for the session.
		 * Resets to the original network configuration.
		 */
    native public void disableNetworkEmulation();
    /**
		 * Sets the certificate verify proc for session, the proc will be called
		 * whenever a server certificate verification is requested.
		 *
		 * Calling setCertificateVerifyProc(null) will revert back to default certificate verify proc.
		 */
    native public void setCertificateVerifyProc(jsweet.util.function.TriConsumer<String,Certificate,java.util.function.Consumer<Boolean>> proc);
    /**
		 * Sets the handler which can be used to respond to permission requests for the session.
		 */
    native public void setPermissionRequestHandler(jsweet.util.function.TriConsumer<WebContents,Object,java.util.function.Consumer<Boolean>> handler);
    /**
		 * Clears the host resolver cache.
		 */
    native public void clearHostResolverCache(Function callback);
    /**
		 * Dynamically sets whether to always send credentials for HTTP NTLM or Negotiate authentication.
		 * @param domains Comma-seperated list of servers for which integrated authentication is enabled.
		 */
    native public void allowNTLMCredentialsForDomains(String domains);
    /**
		 * Overrides the userAgent and acceptLanguages for this session.
		 * The acceptLanguages must a comma separated ordered list of language codes, for example "en-US,fr,de,ko,zh-CN,ja".
		 * This doesn't affect existing WebContents, and each WebContents can use webContents.setUserAgent to override the session-wide user agent.
		 */
    native public void setUserAgent(String userAgent, String acceptLanguages);
    /**
		 * @returns The user agent for this session.
		 */
    native public String getUserAgent();
    /**
		 * Returns the blob data associated with the identifier.
		 */
    native public void getBlobData(String identifier, java.util.function.Consumer<Buffer> callback);
    /**
		 * The webRequest API set allows to intercept and modify contents of a request at various stages of its lifetime.
		 */
    public WebRequest webRequest;
    /**
		 * @returns An instance of protocol module for this session.
		 */
    public Protocol protocol;
    /**
		 * @returns a new Session instance from partition string.
		 */
    native public static Session fromPartition(String partition);
    /**
		 * Overrides the userAgent and acceptLanguages for this session.
		 * The acceptLanguages must a comma separated ordered list of language codes, for example "en-US,fr,de,ko,zh-CN,ja".
		 * This doesn't affect existing WebContents, and each WebContents can use webContents.setUserAgent to override the session-wide user agent.
		 */
    native public void setUserAgent(String userAgent);
    /**
		 * Sets the certificate verify proc for session, the proc will be called
		 * whenever a server certificate verification is requested.
		 *
		 * Calling setCertificateVerifyProc(null) will revert back to default certificate verify proc.
		 */
    native public void setCertificateVerifyProc(null proc);
}

