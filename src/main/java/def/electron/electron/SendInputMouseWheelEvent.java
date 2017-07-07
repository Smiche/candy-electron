package def.electron.electron;
@jsweet.lang.Interface
public abstract class SendInputMouseWheelEvent extends SendInputEvent {
    @jsweet.lang.Optional
    public double deltaX;
    @jsweet.lang.Optional
    public double deltaY;
    @jsweet.lang.Optional
    public double wheelTicksX;
    @jsweet.lang.Optional
    public double wheelTicksY;
    @jsweet.lang.Optional
    public double accelerationRatioX;
    @jsweet.lang.Optional
    public double accelerationRatioY;
    @jsweet.lang.Optional
    public Boolean hasPreciseScrollingDeltas;
    @jsweet.lang.Optional
    public Boolean canScroll;
}

