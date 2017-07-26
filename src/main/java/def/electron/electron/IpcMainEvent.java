package def.electron.electron;
@FunctionalInterface
public interface IpcMainEvent<A,B> {
    public void apply(A a, B b);
}

