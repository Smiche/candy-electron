package def.electron.electron;
import def.js.Function;
/**
	 * The globalShortcut module can register/unregister a global keyboard shortcut
	 * with the operating system so that you can customize the operations for various shortcuts.
	 * Note: The shortcut is global; it will work even if the app does not have the keyboard focus.
	 * You should not use this module until the ready event of the app module is emitted.
	 */
@jsweet.lang.Interface
public abstract class GlobalShortcut extends def.js.Object {
    /**
		 * Registers a global shortcut of accelerator.
		 * @param accelerator Represents a keyboard shortcut. It can contain modifiers
		 * and key codes, combined by the "+" character.
		 * @param callback Called when the registered shortcut is pressed by the user.
		 */
    native public void register(String accelerator, Function callback);
    /**
		 * @param accelerator Represents a keyboard shortcut. It can contain modifiers
		 * and key codes, combined by the "+" character.
		 * @returns Whether the accelerator is registered.
		 */
    native public Boolean isRegistered(String accelerator);
    /**
		 * Unregisters the global shortcut of keycode.
		 * @param accelerator Represents a keyboard shortcut. It can contain modifiers
		 * and key codes, combined by the "+" character.
		 */
    native public void unregister(String accelerator);
    /**
		 * Unregisters all the global shortcuts.
		 */
    native public void unregisterAll();
}

