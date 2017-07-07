package def.electron.electron;
@jsweet.lang.Interface
public abstract class PrintOptions extends def.js.Object {
    /**
		 * Don't ask user for print settings.
		 * Defaults: false.
		 */
    @jsweet.lang.Optional
    public Boolean silent;
    /**
		 * Also prints the background color and image of the web page.
		 * Defaults: false.
		 */
    @jsweet.lang.Optional
    public Boolean printBackground;
}

