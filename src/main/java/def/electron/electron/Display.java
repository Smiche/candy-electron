package def.electron.electron;
import jsweet.util.union.Union3;
/**
	 * The Display object represents a physical display connected to the system.
	 * A fake Display may exist on a headless system, or a Display may correspond to a remote, virtual display.
	 */
@jsweet.lang.Interface
public abstract class Display extends def.js.Object {
    /**
		 * Unique identifier associated with the display.
		 */
    public double id;
    public RectangleData bounds;
    public RectangleData workArea;
    public SizeData size;
    public SizeData workAreaSize;
    /**
		 * Output device’s pixel scale factor.
		 */
    public double scaleFactor;
    /**
		 * Can be 0, 90, 180, 270, represents screen rotation in clock-wise degrees.
		 */
    public double rotation;
    public Union3<"available","unavailable","unknown"> touchSupport;
}

