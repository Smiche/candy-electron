package def.electron.electron;
@jsweet.lang.Interface
public abstract class CommandLine extends def.js.Object {
    /**
		 * Append a switch [with optional value] to Chromium's command line.
		 *
		 * Note: This will not affect process.argv, and is mainly used by developers
		 * to control some low-level Chromium behaviors.
		 */
    native public void appendSwitch(String _switch, String value);
    /**
		 * Append an argument to Chromium's command line. The argument will quoted properly.
		 *
		 * Note: This will not affect process.argv.
		 */
    native public void appendArgument(String value);
    /**
		 * Append a switch [with optional value] to Chromium's command line.
		 *
		 * Note: This will not affect process.argv, and is mainly used by developers
		 * to control some low-level Chromium behaviors.
		 */
    native public void appendSwitch(String _switch);
}

