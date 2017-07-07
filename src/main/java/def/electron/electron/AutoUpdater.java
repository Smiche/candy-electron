package def.electron.electron;
import def.js.Error;
import jsweet.util.function.Consumer5;
import def.js.Date;
import def.js.Function;
/**
	 * This module provides an interface for the Squirrel auto-updater framework.
	 */
@jsweet.lang.Interface
public abstract class AutoUpdater extends def.js.Object {
    /**
		 * Emitted when there is an error while updating.
		 */
    native public AutoUpdater on(def.electron.StringTypes.error event, java.util.function.Consumer<Error> listener);
    /**
		 * Emitted when checking if an update has started.
		 */
    native public AutoUpdater on(def.electron.StringTypes.checking_for_update event, Function listener);
    /**
		 * Emitted when there is an available update. The update is downloaded automatically.
		 */
    native public AutoUpdater on(def.electron.StringTypes.update_available event, Function listener);
    /**
		 * Emitted when there is no available update.
		 */
    native public AutoUpdater on(def.electron.StringTypes.update_not_available event, Function listener);
    /**
		 * Emitted when an update has been downloaded.
		 * Note: On Windows only releaseName is available.
		 */
    native public AutoUpdater on(def.electron.StringTypes.update_downloaded event, Consumer5<Event,String,String,Date,String> listener);
    native public AutoUpdater on(String event, Function listener);
    /**
		 * Set the url and initialize the auto updater.
		 */
    native public void setFeedURL(String url, Headers requestHeaders);
    /**
		 * @returns The current update feed URL.
		 */
    native public String getFeedURL();
    /**
		 * Ask the server whether there is an update, you have to call setFeedURL
		 * before using this API
		 */
    native public void checkForUpdates();
    /**
		 * Restarts the app and installs the update after it has been downloaded.
		 * It should only be called after update-downloaded has been emitted.
		 */
    native public void quitAndInstall();
    /**
		 * Set the url and initialize the auto updater.
		 */
    native public void setFeedURL(String url);
}

