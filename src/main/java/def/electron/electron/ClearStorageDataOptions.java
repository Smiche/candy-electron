package def.electron.electron;
import jsweet.util.union.Union3;
@jsweet.lang.Interface
public abstract class ClearStorageDataOptions extends def.js.Object {
    /**
		 * Should follow window.location.origin’s representation scheme://host:port.
		 */
    @jsweet.lang.Optional
    public String origin;
    /**
		 *  The types of storages to clear.
		 */
    @jsweet.lang.Optional
    public Object[] storages;
    /**
		 * The types of quotas to clear.
		 */
    @jsweet.lang.Optional
    public Union3<"temporary","persistent","syncable">[] quotas;
}

