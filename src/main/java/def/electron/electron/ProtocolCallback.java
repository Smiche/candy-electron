package def.electron.electron;
@jsweet.lang.Interface
public abstract class ProtocolCallback extends def.js.Object {
    native public void apply(double error);
    native public void apply(Obj obj);
    native public void apply();
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Obj extends def.js.Object {
        public double error;
    }
}

