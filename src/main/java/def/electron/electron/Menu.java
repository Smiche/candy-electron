package def.electron.electron;
/**
	 * The Menu class is used to create native menus that can be used as application
	 * menus and context menus. This module is a main process module which can be used
	 * in a render process via the remote module.
	 *
	 * Each menu consists of multiple menu items, and each menu item can have a submenu.
	 */
public class Menu extends def.js.Object {
    /**
		 * Creates a new menu.
		 */
    public Menu(){}
    /**
		 * Sets menu as the application menu on macOS. On Windows and Linux, the menu
		 * will be set as each window's top menu.
		 */
    native public static void setApplicationMenu(Menu menu);
    /**
		 * @returns The application menu if set, or null if not set.
		 */
    native public static Menu getApplicationMenu();
    /**
		 * Sends the action to the first responder of application.
		 * This is used for emulating default Cocoa menu behaviors,
		 * usually you would just use the role property of MenuItem.
		 *
		 * Note: This method is macOS only.
		 */
    native public static void sendActionToFirstResponder(String action);
    /**
		 * @param template Generally, just an array of options for constructing MenuItem.
		 * You can also attach other fields to element of the template, and they will
		 * become properties of the constructed menu items.
		 */
    native public static Menu buildFromTemplate(MenuItemOptions[] template);
    /**
		 * Pops up this menu as a context menu in the browserWindow. You can optionally
		 * provide a (x,y) coordinate to place the menu at, otherwise it will be placed
		 * at the current mouse cursor position.
		 * @param x Horizontal coordinate where the menu will be placed.
		 * @param y Vertical coordinate where the menu will be placed.
		 */
    native public void popup(BrowserWindow browserWindow, double x, double y);
    /**
		 * Appends the menuItem to the menu.
		 */
    native public void append(MenuItem menuItem);
    /**
		 * Inserts the menuItem to the pos position of the menu.
		 */
    native public void insert(double position, MenuItem menuItem);
    /**
		 * @returns an array containing the menu’s items.
		 */
    public MenuItem[] items;
    /**
		 * Pops up this menu as a context menu in the browserWindow. You can optionally
		 * provide a (x,y) coordinate to place the menu at, otherwise it will be placed
		 * at the current mouse cursor position.
		 * @param x Horizontal coordinate where the menu will be placed.
		 * @param y Vertical coordinate where the menu will be placed.
		 */
    native public void popup(BrowserWindow browserWindow, double x);
    /**
		 * Pops up this menu as a context menu in the browserWindow. You can optionally
		 * provide a (x,y) coordinate to place the menu at, otherwise it will be placed
		 * at the current mouse cursor position.
		 * @param x Horizontal coordinate where the menu will be placed.
		 * @param y Vertical coordinate where the menu will be placed.
		 */
    native public void popup(BrowserWindow browserWindow);
    /**
		 * Pops up this menu as a context menu in the browserWindow. You can optionally
		 * provide a (x,y) coordinate to place the menu at, otherwise it will be placed
		 * at the current mouse cursor position.
		 * @param x Horizontal coordinate where the menu will be placed.
		 * @param y Vertical coordinate where the menu will be placed.
		 */
    native public void popup();
}

