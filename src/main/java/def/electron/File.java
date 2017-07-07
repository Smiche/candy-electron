package def.electron;
@jsweet.lang.Interface
@jsweet.lang.Mixin(target=def.dom.File.class)
public abstract class File extends def.dom.File {
    /**
	 * Exposes the real path of the filesystem.
	 */
    public String path;
}

