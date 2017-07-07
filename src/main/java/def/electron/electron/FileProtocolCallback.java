package def.electron.electron;
@jsweet.lang.Interface
public abstract class FileProtocolCallback extends ProtocolCallback {
    native public void apply(String filePath);
    native public void apply(Obj obj);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Obj extends def.js.Object {
        public String path;
    }
}

