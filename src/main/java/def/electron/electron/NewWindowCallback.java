package def.electron.electron;
@FunctionalInterface
public interface NewWindowCallback<A,B,C,D,E,F> {
    public void apply(A a, B b, C c, D d, E e, F f);
}