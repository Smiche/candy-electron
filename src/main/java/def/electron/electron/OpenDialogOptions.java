package def.electron.electron;
@jsweet.lang.Interface
public abstract class OpenDialogOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String title;
    @jsweet.lang.Optional
    public String defaultPath;
    /**
		 * Custom label for the confirmation button, when left empty the default label will be used.
		 */
    @jsweet.lang.Optional
    public String buttonLabel;
    /**
		 * File types that can be displayed or selected.
		 */
    @jsweet.lang.Optional
    public Filters[] filters;
    /**
		 * Contains which features the dialog should use.
		 */
    @jsweet.lang.Optional
    public Object[] properties;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Filters extends def.js.Object {
        public String name;
        /**
			 * Extensions without wildcards or dots (e.g. 'png' is good but '.png' and '*.png' are bad).
			 * To show all files, use the '*' wildcard (no other wildcard is supported).
			 */
        public String[] extensions;
    }
}

