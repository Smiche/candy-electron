package def.electron.electron;
import jsweet.util.union.Union3;
@jsweet.lang.Interface
public abstract class SendInputMouseEvent extends SendInputEvent {
    public double x;
    public double y;
    @jsweet.lang.Optional
    public Union3<"left","middle","right"> button;
    @jsweet.lang.Optional
    public double globalX;
    @jsweet.lang.Optional
    public double globalY;
    @jsweet.lang.Optional
    public double movementX;
    @jsweet.lang.Optional
    public double movementY;
    @jsweet.lang.Optional
    public double clickCount;
}

