package def.electron.electron;
@jsweet.lang.Interface
public abstract class Task extends def.js.Object {
    /**
		 * Path of the program to execute, usually you should specify process.execPath
		 * which opens current program.
		 */
    public String program;
    /**
		 * The arguments of command line when program is executed.
		 */
    public String arguments;
    /**
		 * The string to be displayed in a JumpList.
		 */
    public String title;
    /**
		 * Description of this task.
		 */
    @jsweet.lang.Optional
    public String description;
    /**
		 * The absolute path to an icon to be displayed in a JumpList, it can be
		 * arbitrary resource file that contains an icon, usually you can specify
		 * process.execPath to show the icon of the program.
		 */
    public String iconPath;
    /**
		 * The icon index in the icon file. If an icon file consists of two or more
		 * icons, set this value to identify the icon. If an icon file consists of
		 * one icon, this value is 0.
		 */
    @jsweet.lang.Optional
    public double iconIndex;
}

