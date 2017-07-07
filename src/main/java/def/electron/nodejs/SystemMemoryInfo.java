package def.electron.nodejs;
@jsweet.lang.Interface
public abstract class SystemMemoryInfo extends def.js.Object {
    /**
		 * The total amount of physical memory available to the system.
		 */
    public double total;
    /**
		 * The total amount of memory not being used by applications or disk cache.
		 */
    public double free;
    /**
		 * The total amount of swap memory available to the system.
		 */
    public double swapTotal;
    /**
		 * The free amount of swap memory available to the system.
		 */
    public double swapFree;
}

