package def.electron.electron;
@jsweet.lang.Interface
public abstract class ProxyConfig extends def.js.Object {
    /**
		 * The URL associated with the PAC file.
		 */
    public String pacScript;
    /**
		 * Rules indicating which proxies to use.
		 */
    public String proxyRules;
    /**
		 * Rules indicating which URLs should bypass the proxy settings.
		 */
    public String proxyBypassRules;
}

