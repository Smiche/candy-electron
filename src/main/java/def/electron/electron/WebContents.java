package def.electron.electron;

@jsweet.lang.Interface
public abstract class WebContents extends def.js.Object {

	/**
	 * A Integer representing the unique ID of this WebContents.
	 */
	public int id;

	public native Object openDevTools();

	public native WebContents on(String event, Runnable listener);

	public native WebContents on(String event,
			NewWindowCallback<Event, String, String, Object, BrowserWindowOptions, Object> callback);

	public native Object send(String pipe, String data);

	public native void printToPDF(PrintOptions options, java.util.function.BiConsumer<?, ?> callback);

	public native void print();

	/**
	 * The pid of the associated renderer process.
	 *
	 * @return pid of associated renderer process.
	 */
	public native int getOSProcessId();

}
