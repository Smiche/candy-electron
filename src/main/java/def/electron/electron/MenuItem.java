package def.electron.electron;
/**
	 * The MenuItem allows you to add items to an application or context menu.
	 */
public class MenuItem extends def.js.Object {
    /**
		 * Create a new menu item.
		 */
    public MenuItem(MenuItemOptions options){}
    /**
		 * A function that is fired when the MenuItem receives a click event
		 */
    public jsweet.util.function.TriConsumer<Event,BrowserWindow,WebContents> click;
    /**
		 * Read-only property.
		 */
    public Object type;
    /**
		 * Read-only property.
		 */
    public Object role;
    /**
		 * Read-only property.
		 */
    public String accelerator;
    /**
		 * Read-only property.
		 */
    public jsweet.util.union.Union<NativeImage,String> icon;
    /**
		 * Read-only property.
		 */
    public jsweet.util.union.Union<Menu,MenuItemOptions[]> submenu;
    public String label;
    public String sublabel;
    public Boolean enabled;
    public Boolean visible;
    public Boolean checked;
    protected MenuItem(){}
}

