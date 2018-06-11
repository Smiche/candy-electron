package def.electron.electron;

@jsweet.lang.Interface
public abstract class IpcRenderer extends def.js.Object {
	public native Object send(String pipe, Object data);

	public native Object on(String event, java.util.function.Consumer<Object> listener);
}
