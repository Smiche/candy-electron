package def.electron.electron;
import def.js.Function;
/**
	 * A Tray represents an icon in an operating system's notification area.
	 */
@jsweet.lang.Extends({Destroyable.class})
public class Tray extends def.js.Object {
    /**
		 * Emitted when the tray icon is clicked.
		 * Note: The bounds payload is only implemented on macOS and Windows.
		 */
    native public Tray on("click" event, java.util.function.BiConsumer<Modifiers,RectangleData> listener);
    /**
		 * Emitted when the tray icon is right clicked.
		 * Note: This is only implemented on macOS and Windows.
		 */
    native public Tray on("right_click" event, java.util.function.BiConsumer<Modifiers,RectangleData> listener);
    /**
		 * Emitted when the tray icon is double clicked.
		 * Note: This is only implemented on macOS and Windows.
		 */
    native public Tray on("double_click" event, java.util.function.BiConsumer<Modifiers,RectangleData> listener);
    /**
		 * Emitted when the tray balloon shows.
		 * Note: This is only implemented on Windows.
		 */
    native public Tray on("balloon_show" event, Function listener);
    /**
		 * Emitted when the tray balloon is clicked.
		 * Note: This is only implemented on Windows.
		 */
    native public Tray on("balloon_click" event, Function listener);
    /**
		 * Emitted when the tray balloon is closed because of timeout or user manually closes it.
		 * Note: This is only implemented on Windows.
		 */
    native public Tray on("balloon_closed" event, Function listener);
    /**
		 * Emitted when any dragged items are dropped on the tray icon.
		 * Note: This is only implemented on macOS.
		 */
    native public Tray on("drop" event, Function listener);
    /**
		 * Emitted when dragged files are dropped in the tray icon.
		 * Note: This is only implemented on macOS
		 */
    native public Tray on("drop_files" event, java.util.function.BiConsumer<Event,String[]> listener);
    /**
		 * Emitted when dragged text is dropped in the tray icon.
		 * Note: This is only implemented on macOS
		 */
    native public Tray on("drop_text" event, java.util.function.BiConsumer<Event,String> listener);
    /**
		 * Emitted when a drag operation enters the tray icon.
		 * Note: This is only implemented on macOS
		 */
    native public Tray on("drag_enter" event, Function listener);
    /**
		 * Emitted when a drag operation exits the tray icon.
		 * Note: This is only implemented on macOS
		 */
    native public Tray on("drag_leave" event, Function listener);
    /**
		 * Emitted when a drag operation ends on the tray or ends at another location.
		 * Note: This is only implemented on macOS
		 */
    native public Tray on("drag_end" event, Function listener);
    native public Tray on(String event, Function listener);
    /**
		 * Creates a new tray icon associated with the image.
		 */
    public Tray(NativeImage image){}
    /**
		 * Sets the image associated with this tray icon.
		 */
    native public void setImage(NativeImage image);
    /**
		 * Sets the image associated with this tray icon when pressed.
		 */
    native public void setPressedImage(NativeImage image);
    /**
		 * Sets the hover text for this tray icon.
		 */
    native public void setToolTip(String toolTip);
    /**
		 * Sets the title displayed aside of the tray icon in the status bar.
		 * Note: This is only implemented on macOS.
		 */
    native public void setTitle(String title);
    /**
		 * Sets when the tray's icon background becomes highlighted.
		 * Note: This is only implemented on macOS.
		 */
    native public void setHighlightMode("selection" mode);
    /**
		 * Displays a tray balloon.
		 * Note: This is only implemented on Windows.
		 */
    native public void displayBalloon(Options options);
    /**
		 * Pops up the context menu of tray icon. When menu is passed,
		 * the menu will showed instead of the tray's context menu.
		 * The position is only available on Windows, and it is (0, 0) by default.
		 * Note: This is only implemented on macOS and Windows.
		 */
    native public void popUpContextMenu(Menu menu, PointData position);
    /**
		 * Sets the context menu for this icon.
		 */
    native public void setContextMenu(Menu menu);
    /**
		 * @returns The bounds of this tray icon.
		 */
    native public RectangleData getBounds();
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        @jsweet.lang.Optional
        public NativeImage icon;
        @jsweet.lang.Optional
        public String title;
        @jsweet.lang.Optional
        public String content;
    }
    /**
		 * Destroys the object.
		 */
    native public void destroy();
    /**
		 * @returns Whether the object is destroyed.
		 */
    native public Boolean isDestroyed();
    /**
		 * Displays a tray balloon.
		 * Note: This is only implemented on Windows.
		 */
    native public void displayBalloon();
    /**
		 * Pops up the context menu of tray icon. When menu is passed,
		 * the menu will showed instead of the tray's context menu.
		 * The position is only available on Windows, and it is (0, 0) by default.
		 * Note: This is only implemented on macOS and Windows.
		 */
    native public void popUpContextMenu(Menu menu);
    /**
		 * Pops up the context menu of tray icon. When menu is passed,
		 * the menu will showed instead of the tray's context menu.
		 * The position is only available on Windows, and it is (0, 0) by default.
		 * Note: This is only implemented on macOS and Windows.
		 */
    native public void popUpContextMenu();
    /**
		 * Creates a new tray icon associated with the image.
		 */
    public Tray(String image){}
    /**
		 * Sets the image associated with this tray icon.
		 */
    native public void setImage(String image);
    /**
		 * Sets when the tray's icon background becomes highlighted.
		 * Note: This is only implemented on macOS.
		 */
    native public void setHighlightMode("never" mode);
    /**
		 * Sets when the tray's icon background becomes highlighted.
		 * Note: This is only implemented on macOS.
		 */
    native public void setHighlightMode("always" mode);
    protected Tray(){}
}

