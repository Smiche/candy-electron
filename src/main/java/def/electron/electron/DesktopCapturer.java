package def.electron.electron;
import def.js.Error;
/**
	 * The desktopCapturer module can be used to get available sources
	 * that can be used to be captured with getUserMedia.
	 */
@jsweet.lang.Interface
public abstract class DesktopCapturer extends def.js.Object {
    /**
		 * Starts a request to get all desktop sources.
		 *
		 * Note: There is no guarantee that the size of source.thumbnail is always
		 * the same as the thumnbailSize in options. It also depends on the scale of the screen or window.
		 */
    native public void getSources(DesktopCapturerOptions options, java.util.function.BiFunction<Error,DesktopCapturerSource[],Object> callback);
}

