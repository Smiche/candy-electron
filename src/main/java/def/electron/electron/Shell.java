package def.electron.electron;
/**
	 * The shell module provides functions related to desktop integration.
	 */
@jsweet.lang.Interface
public abstract class Shell extends def.js.Object {
    /**
		 * Show the given file in a file manager. If possible, select the file.
		 * @returns Whether the item was successfully shown.
		 */
    native public Boolean showItemInFolder(String fullPath);
    /**
		 * Open the given file in the desktop's default manner.
		 * @returns Whether the item was successfully shown.
		 */
    native public Boolean openItem(String fullPath);
    /**
		 * Open the given external protocol URL in the desktop's default manner
		 * (e.g., mailto: URLs in the default mail user agent).
		 * @returns Whether an application was available to open the URL.
		 */
    native public Boolean openExternal(String url, Options options);
    /**
		 * Move the given file to trash.
		 * @returns Whether the item was successfully moved to the trash.
		 */
    native public Boolean moveItemToTrash(String fullPath);
    /**
		 * Play the beep sound.
		 */
    native public void beep();
    /**
		 * Creates or updates a shortcut link at shortcutPath.
		 *
		 * Note: This API is available only on Windows.
		 */
    native public Boolean writeShortcutLink(String shortcutPath, ShortcutLinkOptions options);
    /**
		 * Creates or updates a shortcut link at shortcutPath.
		 *
		 * Note: This API is available only on Windows.
		 */
    native public Boolean writeShortcutLink(String shortcutPath, "create" operation, ShortcutLinkOptions options);
    /**
		 * Resolves the shortcut link at shortcutPath.
		 * An exception will be thrown when any error happens.
		 *
		 * Note: This API is available only on Windows.
		 */
    native public ShortcutLinkOptions readShortcutLink(String shortcutPath);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        /**
			 * Bring the opened application to the foreground.
			 * Default: true.
			 */
        public Boolean activate;
    }
    /**
		 * Open the given external protocol URL in the desktop's default manner
		 * (e.g., mailto: URLs in the default mail user agent).
		 * @returns Whether an application was available to open the URL.
		 */
    native public Boolean openExternal(String url);
    /**
		 * Creates or updates a shortcut link at shortcutPath.
		 *
		 * Note: This API is available only on Windows.
		 */
    native public Boolean writeShortcutLink(String shortcutPath, "update" operation, ShortcutLinkOptions options);
    /**
		 * Creates or updates a shortcut link at shortcutPath.
		 *
		 * Note: This API is available only on Windows.
		 */
    native public Boolean writeShortcutLink(String shortcutPath, "replace" operation, ShortcutLinkOptions options);
}

