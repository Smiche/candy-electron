package def.electron.electron;
@jsweet.lang.Interface
public abstract class DesktopCapturerSource extends def.js.Object {
    /**
		 * The id of the captured window or screen used in navigator.webkitGetUserMedia.
		 * The format looks like window:XX or screen:XX where XX is a random generated number.
		 */
    public String id;
    /**
		 * The described name of the capturing screen or window.
		 * If the source is a screen, the name will be Entire Screen or Screen <index>;
		 * if it is a window, the name will be the window’s title.
		 */
    public String name;
    /**
		 * A thumbnail image.
		 */
    public NativeImage thumbnail;
}

