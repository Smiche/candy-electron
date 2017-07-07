package def.electron.electron;
import def.js.Function;
@jsweet.lang.Interface
public abstract class ThumbarButton extends def.js.Object {
    public jsweet.util.union.Union<NativeImage,String> icon;
    public Function click;
    @jsweet.lang.Optional
    public String tooltip;
    @jsweet.lang.Optional
    public Object[] flags;
    native public java.lang.Object click(java.lang.Object... args);
}

