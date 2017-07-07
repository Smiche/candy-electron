package def.electron.electron;
@jsweet.lang.Interface
public abstract class PrintToPDFOptions extends def.js.Object {
    /**
		 * Specify the type of margins to use.
		 *   0 - default
		 *   1 - none
		 *   2 - minimum
		 * Default: 0
		 */
    @jsweet.lang.Optional
    public double marginsType;
    /**
		 * Specify page size of the generated PDF.
		 * Default: A4.
		 */
    @jsweet.lang.Optional
    public Object pageSize;
    /**
		 * Whether to print CSS backgrounds.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean printBackground;
    /**
		 * Whether to print selection only.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean printSelectionOnly;
    /**
		 * true for landscape, false for portrait.
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean landscape;
}

