package def.electron.electron;
@jsweet.lang.Interface
public abstract class JumpListCategory extends def.js.Object {
    /**
		 * tasks - Items in this category will be placed into the standard Tasks category.
		 * frequent - Displays a list of files frequently opened by the app, the name of the category and its items are set by Windows.
		 * recent - Displays a list of files recently opened by the app, the name of the category and its items are set by Windows.
		 * custom - Displays tasks or file links, name must be set by the app.
		 */
    @jsweet.lang.Optional
    public Object type;
    /**
		 * Must be set if type is custom, otherwise it should be omitted.
		 */
    @jsweet.lang.Optional
    public String name;
    /**
		 * Array of JumpListItem objects if type is tasks or custom, otherwise it should be omitted.
		 */
    @jsweet.lang.Optional
    public JumpListItem[] items;
}

