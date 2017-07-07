package def.electron.electron;
@jsweet.lang.Interface
public abstract class SaveDialogOptions extends def.js.Object {
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
		 * File types that can be displayed, see dialog.showOpenDialog for an example.
		 */
    @jsweet.lang.Optional
    public Filters[] filters;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Filters extends def.js.Object {
        public String name;
        public String[] extensions;
    }
}

