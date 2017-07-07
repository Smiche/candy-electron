package def.electron.electron;
import jsweet.util.union.Union3;
@jsweet.lang.Interface
public abstract class JumpListItem extends def.js.Object {
    /**
		 * task - A task will launch an app with specific arguments.
		 * separator - Can be used to separate items in the standard Tasks category.
		 * file - A file link will open a file using the app that created the Jump List.
		 */
    public Union3<def.electron.StringTypes.task,def.electron.StringTypes.separator,def.electron.StringTypes.file> type;
    /**
		 * Path of the file to open, should only be set if type is file.
		 */
    @jsweet.lang.Optional
    public String path;
    /**
		 * Path of the program to execute, usually you should specify process.execPath which opens the current program.
		 * Should only be set if type is task.
		 */
    @jsweet.lang.Optional
    public String program;
    /**
		 * The command line arguments when program is executed. Should only be set if type is task.
		 */
    @jsweet.lang.Optional
    public String args;
    /**
		 * The text to be displayed for the item in the Jump List. Should only be set if type is task.
		 */
    @jsweet.lang.Optional
    public String title;
    /**
		 * Description of the task (displayed in a tooltip). Should only be set if type is task.
		 */
    @jsweet.lang.Optional
    public String description;
    /**
		 * The absolute path to an icon to be displayed in a Jump List, which can be an arbitrary
		 * resource file that contains an icon (e.g. .ico, .exe, .dll).
		 * You can usually specify process.execPath to show the program icon.
		 */
    @jsweet.lang.Optional
    public String iconPath;
    /**
		 * The index of the icon in the resource file. If a resource file contains multiple icons
		 * this value can be used to specify the zero-based index of the icon that should be displayed
		 * for this task. If a resource file contains only one icon, this property should be set to zero.
		 */
    @jsweet.lang.Optional
    public double iconIndex;
}

