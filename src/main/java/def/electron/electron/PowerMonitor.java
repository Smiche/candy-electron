package def.electron.electron;
import def.js.Function;
/**
	 * The power-monitor module is used to monitor power state changes.
	 * You should not use this module until the ready event of the app module is emitted.
	 */
@jsweet.lang.Interface
public abstract class PowerMonitor extends def.js.Object {
    /**
		 * Emitted when the system is suspending.
		 */
    native public PowerMonitor on("suspend" event, Function listener);
    /**
		 * Emitted when system is resuming.
		 */
    native public PowerMonitor on("resume" event, Function listener);
    /**
		 * Emitted when the system changes to AC power.
		 */
    native public PowerMonitor on("on_ac" event, Function listener);
    /**
		 * Emitted when system changes to battery power.
		 */
    native public PowerMonitor on("on_battery" event, Function listener);
    native public PowerMonitor on(String event, Function listener);
}

