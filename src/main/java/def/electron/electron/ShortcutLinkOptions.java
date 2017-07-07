package def.electron.electron;
@jsweet.lang.Interface
public abstract class ShortcutLinkOptions extends def.js.Object {
    /**
		 * The target to launch from this shortcut.
		 */
    public String target;
    /**
		 * The working directory.
		 * Default: empty.
		 */
    @jsweet.lang.Optional
    public String cwd;
    /**
		 * The arguments to be applied to target when launching from this shortcut.
		 * Default: empty.
		 */
    @jsweet.lang.Optional
    public String args;
    /**
		 * The description of the shortcut.
		 * Default: empty.
		 */
    @jsweet.lang.Optional
    public String description;
    /**
		 * The path to the icon, can be a DLL or EXE. icon and iconIndex have to be set together.
		 * Default: empty, which uses the target's icon.
		 */
    @jsweet.lang.Optional
    public String icon;
    /**
		 * The resource ID of icon when icon is a DLL or EXE.
		 * Default: 0.
		 */
    @jsweet.lang.Optional
    public double iconIndex;
    /**
		 * The Application User Model ID.
		 * Default: empty.
		 */
    @jsweet.lang.Optional
    public String appUserModelId;
}

