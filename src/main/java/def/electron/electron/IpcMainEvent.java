package def.electron.electron;
@FunctionalInterface
public interface IpcMainEvent<A,B,C, D> {
    public void apply(A a, B b, C c, D d);
}

