package def.electron.electron;
@jsweet.lang.Interface
public abstract class Dock extends def.js.Object {
    /**
		 * When critical is passed, the dock icon will bounce until either the
		 * application becomes active or the request is canceled.
		 *
		 * When informational is passed, the dock icon will bounce for one second.
		 * However, the request remains active until either the application becomes
		 * active or the request is canceled.
		 *
		 * @param type The default is informational.
		 * @returns An ID representing the request.
		 */
    native public double bounce(def.electron.StringTypes.critical type);
    /**
		 * Cancel the bounce of id.
		 *
		 * Note: This API is only available on macOS.
		 */
    native public void cancelBounce(double id);
    /**
		 * Bounces the Downloads stack if the filePath is inside the Downloads folder.
		 *
		 * Note: This API is only available on macOS.
		 */
    native public void downloadFinished(String filePath);
    /**
		 * Sets the string to be displayed in the dock’s badging area.
		 *
		 * Note: This API is only available on macOS.
		 */
    native public void setBadge(String text);
    /**
		 * Returns the badge string of the dock.
		 *
		 * Note: This API is only available on macOS.
		 */
    native public String getBadge();
    /**
		 * Hides the dock icon.
		 *
		 * Note: This API is only available on macOS.
		 */
    native public void hide();
    /**
		 * Shows the dock icon.
		 *
		 * Note: This API is only available on macOS.
		 */
    native public void show();
    /**
		 * @returns Whether the dock icon is visible.
		 * The app.dock.show() call is asynchronous so this method might not return true immediately after that call.
		 *
		 * Note: This API is only available on macOS.
		 */
    native public Boolean isVisible();
    /**
		 * Sets the application dock menu.
		 *
		 * Note: This API is only available on macOS.
		 */
    native public void setMenu(Menu menu);
    /**
		 * Sets the image associated with this dock icon.
		 *
		 * Note: This API is only available on macOS.
		 */
    native public void setIcon(NativeImage icon);
    /**
		 * When critical is passed, the dock icon will bounce until either the
		 * application becomes active or the request is canceled.
		 *
		 * When informational is passed, the dock icon will bounce for one second.
		 * However, the request remains active until either the application becomes
		 * active or the request is canceled.
		 *
		 * @param type The default is informational.
		 * @returns An ID representing the request.
		 */
    native public double bounce();
    /**
		 * When critical is passed, the dock icon will bounce until either the
		 * application becomes active or the request is canceled.
		 *
		 * When informational is passed, the dock icon will bounce for one second.
		 * However, the request remains active until either the application becomes
		 * active or the request is canceled.
		 *
		 * @param type The default is informational.
		 * @returns An ID representing the request.
		 */
    native public double bounce(def.electron.StringTypes.informational type);
    /**
		 * Sets the image associated with this dock icon.
		 *
		 * Note: This API is only available on macOS.
		 */
    native public void setIcon(String icon);
}

