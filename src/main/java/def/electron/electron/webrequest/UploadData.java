package def.electron.electron.webrequest;
@jsweet.lang.Interface
public abstract class UploadData extends def.js.Object {
    /**
			 * Content being sent.
			 */
    public Buffer bytes;
    /**
			 * Path of file being uploaded.
			 */
    public String file;
    /**
			 * UUID of blob data. Use session.getBlobData method to retrieve the data.
			 */
    public String blobUUID;
}

