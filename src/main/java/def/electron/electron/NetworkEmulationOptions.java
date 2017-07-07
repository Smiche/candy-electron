package def.electron.electron;
@jsweet.lang.Interface
public abstract class NetworkEmulationOptions extends def.js.Object {
    /**
		 * Whether to emulate network outage.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean offline;
    /**
		 * RTT in ms.
		 * Default: 0, which will disable latency throttling.
		 */
    @jsweet.lang.Optional
    public double latency;
    /**
		 * Download rate in Bps.
		 * Default: 0, which will disable download throttling.
		 */
    @jsweet.lang.Optional
    public double downloadThroughput;
    /**
		 * Upload rate in Bps.
		 * Default: 0, which will disable upload throttling.
		 */
    @jsweet.lang.Optional
    public double uploadThroughput;
}

