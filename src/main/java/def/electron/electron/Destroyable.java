package def.electron.electron;
@jsweet.lang.Interface
public abstract class Destroyable extends def.js.Object {
    /**
		 * Destroys the object.
		 */
    native public void destroy();
    /**
		 * @returns Whether the object is destroyed.
		 */
    native public Boolean isDestroyed();
}

