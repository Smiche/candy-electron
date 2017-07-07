package def.electron.electron;
public interface BeginFrameSubscriptionCallback {
    public void apply(Buffer frameBuffer, RectangleData dirtyRect);
    public void apply(Buffer frameBuffer);
}

