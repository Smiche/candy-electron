package def.electron.electron;

import def.js.Function;

public class BrowserWindow extends def.js.Object {

	public WebContents webContents;

	public BrowserWindow() {
	}

	public BrowserWindow(BrowserWindowOptions options) {
	}

	public native BrowserWindow on(String event, Function listener);

	public native BrowserWindow on(String event, Runnable listener);

	public native Object loadURL(String url);

	public native Object setMenu(Object menu);

	public native void maximize();

	public native void minimize();

	public native void close();

	public native void show();

	public native void blur();

	public native void restore();

	public native void center();

	public native void setKiosk(boolean isKiosk);

	public native boolean isKiosk();

	/**
	 * Returns Integer[] - Contains the window's current position.
	 *
	 * @return Current x, y -position of window
	 */
	public native def.js.Array<Integer> getPosition();

	/**
	 * Moves window to x and y.
	 *
	 * @param x
	 *            Integer
	 *
	 * @param y
	 *            Integer
	 * @param animate
	 *            Boolean (optional) macOS
	 */
	public native void setPosition(Integer x, Integer y, Boolean animate);

	/**
	 * Returns Integer[] - Contains the window's width and height.
	 *
	 * @return Current x, y -position of window
	 */
	public native def.js.Array<Integer> getSize();

	/**
	 * Set window's width and height.
	 *
	 * @param width
	 *            New window width
	 * @param height
	 *            New window height
	 * @param animate
	 *            Boolean (optional) macOS
	 */
	public native void setSize(int width, int height, boolean animate);
}
