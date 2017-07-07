package def.electron.electron;
import def.js.Function;
/**
	 * The screen module retrieves information about screen size, displays, cursor position, etc.
	 * You can not use this module until the ready event of the app module is emitted.
	 */
@jsweet.lang.Interface
public abstract class Screen extends def.js.Object {
    /**
		 * Emitted when newDisplay has been added.
		 */
    native public Screen on("display_added" event, java.util.function.BiConsumer<Event,Display> listener);
    /**
		 * Emitted when oldDisplay has been removed.
		 */
    native public Screen on("display_removed" event, java.util.function.BiConsumer<Event,Display> listener);
    /**
		 * Emitted when one or more metrics change in a display.
		 */
    native public Screen on("display_metrics_changed" event, jsweet.util.function.TriConsumer<Event,Display,Object[]> listener);
    native public Screen on(String event, Function listener);
    /**
		 * @returns The current absolute position of the mouse pointer.
		 */
    native public PointData getCursorScreenPoint();
    /**
		 * @returns The primary display.
		 */
    native public Display getPrimaryDisplay();
    /**
		 * @returns An array of displays that are currently available.
		 */
    native public Display[] getAllDisplays();
    /**
		 * @returns The display nearest the specified point.
		 */
    native public Display getDisplayNearestPoint(PointData point);
    /**
		 * @returns The display that most closely intersects the provided bounds.
		 */
    native public Display getDisplayMatching(RectangleData rect);
}

