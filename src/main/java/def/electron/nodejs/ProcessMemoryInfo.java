package def.electron.nodejs;
@jsweet.lang.Interface
public abstract class ProcessMemoryInfo extends def.js.Object {
    /**
		 * The amount of memory currently pinned to actual physical RAM.
		 */
    public double workingSetSize;
    /**
		 * The maximum amount of memory that has ever been pinned to actual physical RAM.
		 */
    public double peakWorkingSetSize;
    /**
		 * The amount of memory not shared by other processes, such as JS heap or HTML content.
		 */
    public double privateBytes;
    /**
		 * The amount of memory shared between processes, typically memory consumed by the Electron code itself.
		 */
    public double sharedBytes;
}

