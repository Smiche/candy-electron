package def.electron.electron;
@jsweet.lang.Interface
public abstract class DesktopCapturerOptions extends def.js.Object {
    /**
		 * The types of desktop sources to be captured.
		 */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<"screen","window">[] types;
    /**
		 * The suggested size that thumbnail should be scaled.
		 * Default: {width: 150, height: 150}
		 */
    @jsweet.lang.Optional
    public SizeData thumbnailSize;
}

