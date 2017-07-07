package def.electron.electron;
@jsweet.lang.Interface
public abstract class DeviceEmulationParameters extends def.js.Object {
    /**
		 * Specify the screen type to emulated
		 * Default: desktop
		 */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<"desktop","mobile"> screenPosition;
    /**
		 * Set the emulated screen size (screenPosition == mobile)
		 */
    @jsweet.lang.Optional
    public SizeData screenSize;
    /**
		 * Position the view on the screen (screenPosition == mobile)
		 * Default: {x: 0, y: 0}
		 */
    @jsweet.lang.Optional
    public PointData viewPosition;
    /**
		 * Set the device scale factor (if zero defaults to original device scale factor)
		 * Default: 0
		 */
    public double deviceScaleFactor;
    /**
		 * Set the emulated view size (empty means no override).
		 */
    @jsweet.lang.Optional
    public SizeData viewSize;
    /**
		 * Whether emulated view should be scaled down if necessary to fit into available space
		 * Default: false
		 */
    @jsweet.lang.Optional
    public Boolean fitToView;
    /**
		 * Offset of the emulated view inside available space (not in fit to view mode)
		 * Default: {x: 0, y: 0}
		 */
    @jsweet.lang.Optional
    public PointData offset;
    /**
		 * Scale of emulated view inside available space (not in fit to view mode)
		 * Default: 1
		 */
    public double scale;
}

