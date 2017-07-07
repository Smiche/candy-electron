package def.electron.electron;
import def.js.Error;
import def.js.Function;
/**
	 * Debugger API serves as an alternate transport for remote debugging protocol.
	 */
@jsweet.lang.Interface
public abstract class Debugger extends def.js.Object {
    /**
		 * Attaches the debugger to the webContents.
		 * @param protocolVersion Requested debugging protocol version.
		 */
    native public void attach(String protocolVersion);
    /**
		 * @returns Whether a debugger is attached to the webContents.
		 */
    native public Boolean isAttached();
    /**
		 * Detaches the debugger from the webContents.
		 */
    native public void detach();
    /**
		 * Send given command to the debugging target.
		 * @param method Method name, should be one of the methods defined by the remote debugging protocol.
		 * @param commandParams JSON object with request parameters.
		 * @param callback Response defined by the ‘returns’ attribute of the command description in the remote debugging protocol.
		 */
    native public void sendCommand(String method, Object commandParams, java.util.function.BiConsumer<Error,Object> callback);
    /**
		 * Emitted when debugging session is terminated. This happens either when
		 * webContents is closed or devtools is invoked for the attached webContents.
		 */
    native public Debugger on("detach" event, java.util.function.BiConsumer<Event,String> listener);
    /**
		 * Emitted whenever debugging target issues instrumentation event.
		 * Event parameters defined by the ‘parameters’ attribute in the remote debugging protocol.
		 */
    native public Debugger on("message" event, jsweet.util.function.TriConsumer<Event,String,Object> listener);
    native public Debugger on(String event, Function listener);
    /**
		 * Attaches the debugger to the webContents.
		 * @param protocolVersion Requested debugging protocol version.
		 */
    native public void attach();
    /**
		 * Send given command to the debugging target.
		 * @param method Method name, should be one of the methods defined by the remote debugging protocol.
		 * @param commandParams JSON object with request parameters.
		 * @param callback Response defined by the ‘returns’ attribute of the command description in the remote debugging protocol.
		 */
    native public void sendCommand(String method, Object commandParams);
    /**
		 * Send given command to the debugging target.
		 * @param method Method name, should be one of the methods defined by the remote debugging protocol.
		 * @param commandParams JSON object with request parameters.
		 * @param callback Response defined by the ‘returns’ attribute of the command description in the remote debugging protocol.
		 */
    native public void sendCommand(String method);
}

