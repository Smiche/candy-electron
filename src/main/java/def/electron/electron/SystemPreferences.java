package def.electron.electron;
import def.js.Function;
/**
	 * Get system preferences.
	 */
@jsweet.lang.Interface
public abstract class SystemPreferences extends def.js.Object {
    /**
		 * Note: This is only implemented on Windows.
		 */
    native public SystemPreferences on("accent_color_changed" event, java.util.function.BiConsumer<Event,String> listener);
    /**
		 * Note: This is only implemented on Windows.
		 */
    native public SystemPreferences on("color_changed" event, java.util.function.Consumer<Event> listener);
    /**
		 * Note: This is only implemented on Windows.
		 */
    native public SystemPreferences on("inverted_color_scheme_changed" event, java.util.function.BiConsumer<Event,Boolean> listener);
    native public SystemPreferences on(String event, Function listener);
    /**
		 * @returns Whether the system is in Dark Mode.
		 *
		 * Note: This is only implemented on macOS.
		 */
    native public Boolean isDarkMode();
    /**
		 * @returns Whether the Swipe between pages setting is on.
		 *
		 * Note: This is only implemented on macOS.
		 */
    native public Boolean isSwipeTrackingFromScrollEventsEnabled();
    /**
		 * Posts event as native notifications of macOS.
		 * The userInfo contains the user information dictionary sent along with the notification.
		 *
		 * Note: This is only implemented on macOS.
		 */
    native public void postNotification(String event, Object userInfo);
    /**
		 * Posts event as native notifications of macOS.
		 * The userInfo contains the user information dictionary sent along with the notification.
		 *
		 * Note: This is only implemented on macOS.
		 */
    native public void postLocalNotification(String event, Object userInfo);
    /**
		 * Subscribes to native notifications of macOS, callback will be called when the corresponding event happens.
		 * The id of the subscriber is returned, which can be used to unsubscribe the event.
		 *
		 * Note: This is only implemented on macOS.
		 */
    native public double subscribeNotification(String event, java.util.function.BiConsumer<Event,Object> callback);
    /**
		 * Removes the subscriber with id.
		 *
		 * Note: This is only implemented on macOS.
		 */
    native public void unsubscribeNotification(double id);
    /**
		 * Same as subscribeNotification, but uses NSNotificationCenter for local defaults.
		 */
    native public double subscribeLocalNotification(String event, java.util.function.BiConsumer<Event,Object> callback);
    /**
		 * Same as unsubscribeNotification, but removes the subscriber from NSNotificationCenter.
		 */
    native public void unsubscribeLocalNotification(double id);
    /**
		 * Get the value of key in system preferences.
		 *
		 * Note: This is only implemented on macOS.
		 */
    native public Object getUserDefault(String key, Object type);
    /**
		 * @returns Whether DWM composition (Aero Glass) is enabled.
		 *
		 * Note: This is only implemented on Windows.
		 */
    native public Boolean isAeroGlassEnabled();
    /**
		 * @returns The users current system wide color preference in the form of an RGBA hexadecimal string.
		 *
		 * Note: This is only implemented on Windows.
		 */
    native public String getAccentColor();
    /**
		 * @returns true if an inverted color scheme, such as a high contrast theme, is active, false otherwise.
		 *
		 * Note: This is only implemented on Windows.
		 */
    native public Boolean isInvertedColorScheme();
    /**
		 * @returns The system color setting in RGB hexadecimal form (#ABCDEF). See the Windows docs for more details.
		 *
		 * Note: This is only implemented on Windows.
		 */
    native public String getColor(Object color);
}

