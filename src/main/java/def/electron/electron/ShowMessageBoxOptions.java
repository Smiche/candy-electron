package def.electron.electron;
@jsweet.lang.Interface
public abstract class ShowMessageBoxOptions extends def.js.Object {
    /**
		 * On Windows, "question" displays the same icon as "info", unless you set an icon using the "icon" option.
		 */
    @jsweet.lang.Optional
    public Object type;
    /**
		 * Texts for buttons. On Windows, an empty array will result in one button labeled "OK".
		 */
    @jsweet.lang.Optional
    public String[] buttons;
    /**
		 * Index of the button in the buttons array which will be selected by default when the message box opens.
		 */
    @jsweet.lang.Optional
    public double defaultId;
    /**
		 * Title of the message box (some platforms will not show it).
		 */
    @jsweet.lang.Optional
    public String title;
    /**
		 * Contents of the message box.
		 */
    @jsweet.lang.Optional
    public String message;
    /**
		 * Extra information of the message.
		 */
    @jsweet.lang.Optional
    public String detail;
    @jsweet.lang.Optional
    public NativeImage icon;
    /**
		 * The value will be returned when user cancels the dialog instead of clicking the buttons of the dialog.
		 * By default it is the index of the buttons that have "cancel" or "no" as label,
		 * or 0 if there is no such buttons. On macOS and Windows the index of "Cancel" button
		 * will always be used as cancelId, not matter whether it is already specified.
		 */
    @jsweet.lang.Optional
    public double cancelId;
    /**
		 * On Windows Electron will try to figure out which one of the buttons are common buttons
		 * (like "Cancel" or "Yes"), and show the others as command links in the dialog.
		 * This can make the dialog appear in the style of modern Windows apps.
		 * If you don’t like this behavior, you can set noLink to true.
		 */
    @jsweet.lang.Optional
    public Boolean noLink;
}

