package def.electron.electron;
@jsweet.lang.Interface
public abstract class UploadFileSystem extends def.js.Object {
    /**
		 * fileSystem
		 */
    public "fileSystem" type;
    /**
		 * FileSystem url to read data for upload.
		 */
    public String fileSystemURL;
    /**
		 * Defaults to 0.
		 */
    public double offset;
    /**
		 * Number of bytes to read from offset. Defaults to 0.
		 */
    public double length;
    /**
		 * Last Modification time in number of seconds sine the UNIX epoch.
		 */
    public double modificationTime;
}

