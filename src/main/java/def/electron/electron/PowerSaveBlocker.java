package def.electron.electron;
/**
	 * The powerSaveBlocker module is used to block the system from entering
	 * low-power (sleep) mode and thus allowing the app to keep the system and screen active.
	 */
@jsweet.lang.Interface
public abstract class PowerSaveBlocker extends def.js.Object {
    /**
		 * Starts preventing the system from entering lower-power mode.
		 * @returns The blocker ID that is assigned to this power blocker.
		 * Note: prevent-display-sleep has higher has precedence over prevent-app-suspension.
		 */
    native public double start("prevent_app_suspension" type);
    /**
		 * @param id The power save blocker id returned by powerSaveBlocker.start.
		 * Stops the specified power save blocker.
		 */
    native public void stop(double id);
    /**
		 * @param id The power save blocker id returned by powerSaveBlocker.start.
		 * @returns Whether the corresponding powerSaveBlocker has started.
		 */
    native public Boolean isStarted(double id);
    /**
		 * Starts preventing the system from entering lower-power mode.
		 * @returns The blocker ID that is assigned to this power blocker.
		 * Note: prevent-display-sleep has higher has precedence over prevent-app-suspension.
		 */
    native public double start("prevent_display_sleep" type);
}

