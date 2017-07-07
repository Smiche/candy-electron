package def.electron.electron;
@jsweet.lang.Interface
public abstract class ProtocolRequest extends def.js.Object {
    public String url;
    public String referrer;
    public String method;
    @jsweet.lang.Optional
    public UploadData[] uploadData;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class UploadData extends def.js.Object {
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
}

