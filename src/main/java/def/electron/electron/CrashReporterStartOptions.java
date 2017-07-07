package def.electron.electron;
@jsweet.lang.Interface
public abstract class CrashReporterStartOptions extends def.js.Object {
    /**
		 * Default: app.getName()
		 */
    @jsweet.lang.Optional
    public String productName;
    public String companyName;
    /**
		 * URL that crash reports would be sent to as POST.
		 */
    public String submitURL;
    /**
		 * Send the crash report without user interaction.
		 * Default: true.
		 */
    @jsweet.lang.Optional
    public Boolean autoSubmit;
    /**
		 * Default: false.
		 */
    @jsweet.lang.Optional
    public Boolean ignoreSystemCrashHandler;
    /**
		 * An object you can define that will be sent along with the report.
		 * Only string properties are sent correctly, nested objects are not supported.
		 */
    @jsweet.lang.Optional
    public Extra extra;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Extra extends def.js.Object {
        native public java.lang.String $get(String prop);
    }
}

