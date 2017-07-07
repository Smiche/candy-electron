package def.electron.electron;
@jsweet.lang.Interface
public abstract class MenuItemOptions extends def.js.Object {
    /**
		 * Callback when the menu item is clicked.
		 */
    @jsweet.lang.Optional
    public jsweet.util.function.TriConsumer<MenuItem,BrowserWindow,Event> click;
    /**
		 * Can be normal, separator, submenu, checkbox or radio.
		 */
    @jsweet.lang.Optional
    public Object type;
    @jsweet.lang.Optional
    public String label;
    @jsweet.lang.Optional
    public String sublabel;
    /**
		 * An accelerator is string that represents a keyboard shortcut, it can contain
		 * multiple modifiers and key codes, combined by the + character.
		 *
		 * Examples:
		 *   CommandOrControl+A
		 *   CommandOrControl+Shift+Z
		 *
		 * Platform notice:
		 *   On Linux and Windows, the Command key would not have any effect,
		 *   you can use CommandOrControl which represents Command on macOS and Control on
		 *   Linux and Windows to define some accelerators.
		 *
		 *   Use Alt instead of Option. The Option key only exists on macOS, whereas
		 *   the Alt key is available on all platforms.
		 *
		 *   The Super key is mapped to the Windows key on Windows and Linux and Cmd on macOS.
		 *
		 * Available modifiers:
		 *   Command (or Cmd for short)
		 *   Control (or Ctrl for short)
		 *   CommandOrControl (or CmdOrCtrl for short)
		 *   Alt
		 *   Option
		 *   AltGr
		 *   Shift
		 *   Super
		 *
		 * Available key codes:
		 *   0 to 9
		 *   A to Z
		 *   F1 to F24
		 *   Punctuations like ~, !, @, #, $, etc.
		 *   Plus
		 *   Space
		 *   Tab
		 *   Backspace
		 *   Delete
		 *   Insert
		 *   Return (or Enter as alias)
		 *   Up, Down, Left and Right
		 *   Home and End
		 *   PageUp and PageDown
		 *   Escape (or Esc for short)
		 *   VolumeUp, VolumeDown and VolumeMute
		 *   MediaNextTrack, MediaPreviousTrack, MediaStop and MediaPlayPause
		 *   PrintScreen
		 */
    @jsweet.lang.Optional
    public String accelerator;
    /**
		 * In Electron for the APIs that take images, you can pass either file paths
		 * or NativeImage instances. When passing null, an empty image will be used.
		 */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<NativeImage,String> icon;
    /**
		 * If false, the menu item will be greyed out and unclickable.
		 */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
		 * If false, the menu item will be entirely hidden.
		 */
    @jsweet.lang.Optional
    public Boolean visible;
    /**
		 * Should only be specified for 'checkbox' or 'radio' type menu items.
		 */
    @jsweet.lang.Optional
    public Boolean checked;
    /**
		 * Should be specified for submenu type menu item, when it's specified the
		 * type: 'submenu' can be omitted for the menu item
		 */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Menu,MenuItemOptions[]> submenu;
    /**
		 * Unique within a single menu. If defined then it can be used as a reference
		 * to this item by the position attribute.
		 */
    @jsweet.lang.Optional
    public String id;
    /**
		 * This field allows fine-grained definition of the specific location within
		 * a given menu.
		 */
    @jsweet.lang.Optional
    public String position;
    /**
		 * Define the action of the menu item, when specified the click property will be ignored
		 */
    @jsweet.lang.Optional
    public Object role;
}

