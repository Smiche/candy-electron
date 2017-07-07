package def.electron.electron;
/**
	 * The dialog module provides APIs to show native system dialogs, such as opening files or alerting,
	 * so web applications can deliver the same user experience as native applications.
	 */
@jsweet.lang.Interface
public abstract class Dialog extends def.js.Object {
    /**
		 * Note: On Windows and Linux an open dialog can not be both a file selector and a directory selector,
		 * so if you set properties to ['openFile', 'openDirectory'] on these platforms, a directory selector will be shown.
		 *
		 * @param callback If supplied, the API call will be asynchronous.
		 * @returns On success, returns an array of file paths chosen by the user,
		 * otherwise returns undefined.
		 */
    native public String[] showOpenDialog(BrowserWindow browserWindow, OpenDialogOptions options, java.util.function.Consumer<String[]> callback);
    /**
		 * Note: On Windows and Linux an open dialog can not be both a file selector and a directory selector,
		 * so if you set properties to ['openFile', 'openDirectory'] on these platforms, a directory selector will be shown.
		 *
		 * @param callback If supplied, the API call will be asynchronous.
		 * @returns On success, returns an array of file paths chosen by the user,
		 * otherwise returns undefined.
		 */
    native public String[] showOpenDialog(OpenDialogOptions options, java.util.function.Consumer<String[]> callback);
    /**
		 * @param callback If supplied, the API call will be asynchronous.
		 * @returns On success, returns the path of file chosen by the user, otherwise
		 * returns undefined.
		 */
    native public String showSaveDialog(BrowserWindow browserWindow, SaveDialogOptions options, java.util.function.Consumer<String> callback);
    /**
		 * @param callback If supplied, the API call will be asynchronous.
		 * @returns On success, returns the path of file chosen by the user, otherwise
		 * returns undefined.
		 */
    native public String showSaveDialog(SaveDialogOptions options, java.util.function.Consumer<String> callback);
    /**
		 * Shows a message box. It will block until the message box is closed.
		 * @param callback If supplied, the API call will be asynchronous.
		 * @returns The index of the clicked button.
		 */
    native public double showMessageBox(BrowserWindow browserWindow, ShowMessageBoxOptions options, java.util.function.Consumer<Double> callback);
    /**
		 * Shows a message box. It will block until the message box is closed.
		 * @param callback If supplied, the API call will be asynchronous.
		 * @returns The index of the clicked button.
		 */
    native public double showMessageBox(ShowMessageBoxOptions options, java.util.function.Consumer<Double> callback);
    /**
		 * Displays a modal dialog that shows an error message.
		 *
		 * This API can be called safely before the ready event the app module emits,
		 * it is usually used to report errors in early stage of startup.
		 * If called before the app readyevent on Linux, the message will be emitted to stderr,
		 * and no GUI dialog will appear.
		 */
    native public void showErrorBox(String title, String content);
    /**
		 * Note: On Windows and Linux an open dialog can not be both a file selector and a directory selector,
		 * so if you set properties to ['openFile', 'openDirectory'] on these platforms, a directory selector will be shown.
		 *
		 * @param callback If supplied, the API call will be asynchronous.
		 * @returns On success, returns an array of file paths chosen by the user,
		 * otherwise returns undefined.
		 */
    native public String[] showOpenDialog(BrowserWindow browserWindow, OpenDialogOptions options);
    /**
		 * Note: On Windows and Linux an open dialog can not be both a file selector and a directory selector,
		 * so if you set properties to ['openFile', 'openDirectory'] on these platforms, a directory selector will be shown.
		 *
		 * @param callback If supplied, the API call will be asynchronous.
		 * @returns On success, returns an array of file paths chosen by the user,
		 * otherwise returns undefined.
		 */
    native public String[] showOpenDialog(OpenDialogOptions options);
    /**
		 * @param callback If supplied, the API call will be asynchronous.
		 * @returns On success, returns the path of file chosen by the user, otherwise
		 * returns undefined.
		 */
    native public String showSaveDialog(BrowserWindow browserWindow, SaveDialogOptions options);
    /**
		 * @param callback If supplied, the API call will be asynchronous.
		 * @returns On success, returns the path of file chosen by the user, otherwise
		 * returns undefined.
		 */
    native public String showSaveDialog(SaveDialogOptions options);
    /**
		 * Shows a message box. It will block until the message box is closed.
		 * @param callback If supplied, the API call will be asynchronous.
		 * @returns The index of the clicked button.
		 */
    native public double showMessageBox(BrowserWindow browserWindow, ShowMessageBoxOptions options);
    /**
		 * Shows a message box. It will block until the message box is closed.
		 * @param callback If supplied, the API call will be asynchronous.
		 * @returns The index of the clicked button.
		 */
    native public double showMessageBox(ShowMessageBoxOptions options);
}

