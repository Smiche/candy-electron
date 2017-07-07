package def.electron.electron;
@jsweet.lang.Interface
public abstract class HttpProtocolCallback extends ProtocolCallback {
    native public void apply(RedirectRequest redirectRequest);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class RedirectRequest extends def.js.Object {
        public String url;
        public String method;
        @jsweet.lang.Optional
        public Object session;
        @jsweet.lang.Optional
        public UploadData uploadData;
        /** This is an automatically generated object type (see the source definition). */
        @jsweet.lang.ObjectType
        public static class UploadData extends def.js.Object {
            public String contentType;
            public String data;
        }
    }
}

