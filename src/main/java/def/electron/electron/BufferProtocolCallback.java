package def.electron.electron;
@jsweet.lang.Interface
public abstract class BufferProtocolCallback extends ProtocolCallback {
    native public void apply(Buffer buffer);
    native public void apply(Obj obj);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Obj extends def.js.Object {
        public Buffer data;
        public String mimeType;
        @jsweet.lang.Optional
        public String charset;
    }
}
