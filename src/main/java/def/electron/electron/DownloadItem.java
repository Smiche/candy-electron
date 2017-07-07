package def.electron.electron;
import def.js.Function;
/**
	 * DownloadItem represents a download item in Electron.
	 */
@jsweet.lang.Interface
public abstract class DownloadItem extends def.js.Object {
    /**
		 * Emitted when the download has been updated and is not done.
		 */
    @jsweet.lang.Name("on")
    native public DownloadItem onListenerprogressingBiConsumer("updated" event, java.util.function.BiConsumer<Event,"progressing"> listener);
    /**
		 * Emits when the download is in a terminal state. This includes a completed download,
		 * a cancelled download (via downloadItem.cancel()), and interrupted download that can’t be resumed.
		 */
    @jsweet.lang.Name("on")
    native public DownloadItem onListenercompletedBiConsumer("done" event, java.util.function.BiConsumer<Event,"completed"> listener);
    native public DownloadItem on(String event, Function listener);
    /**
		 * Set the save file path of the download item.
		 * Note: The API is only available in session’s will-download callback function.
		 * If user doesn’t set the save path via the API, Electron will use the original
		 * routine to determine the save path (Usually prompts a save dialog).
		 */
    native public void setSavePath(String path);
    /**
		 * @returns The save path of the download item.
		 * This will be either the path set via downloadItem.setSavePath(path) or the path selected from the shown save dialog.
		 */
    native public String getSavePath();
    /**
		 * Pauses the download.
		 */
    native public void pause();
    /**
		 * @returns Whether the download is paused.
		 */
    native public Boolean isPaused();
    /**
		 * Resumes the download that has been paused.
		 */
    native public void resume();
    /**
		 * @returns Whether the download can resume.
		 */
    native public Boolean canResume();
    /**
		 * Cancels the download operation.
		 */
    native public void cancel();
    /**
		 * @returns The origin url where the item is downloaded from.
		 */
    native public String getURL();
    /**
		 * @returns The mime type.
		 */
    native public String getMimeType();
    /**
		 * @returns Whether the download has user gesture.
		 */
    native public Boolean hasUserGesture();
    /**
		 * @returns The file name of the download item.
		 * Note: The file name is not always the same as the actual one saved in local disk.
		 * If user changes the file name in a prompted download saving dialog,
		 * the actual name of saved file will be different.
		 */
    native public String getFilename();
    /**
		 * @returns The total size in bytes of the download item. If the size is unknown, it returns 0.
		 */
    native public double getTotalBytes();
    /**
		 * @returns The received bytes of the download item.
		 */
    native public double getReceivedBytes();
    /**
		 * @returns The Content-Disposition field from the response header.
		 */
    native public String getContentDisposition();
    /**
		 * @returns The current state.
		 */
    native public Object getState();
    /**
		 * Emitted when the download has been updated and is not done.
		 */
    @jsweet.lang.Name("on")
    native public DownloadItem onListenerBiConsumer("updated" event, java.util.function.BiConsumer<Event,"interrupted"> listener);
    /**
		 * Emits when the download is in a terminal state. This includes a completed download,
		 * a cancelled download (via downloadItem.cancel()), and interrupted download that can’t be resumed.
		 */
    @jsweet.lang.Name("on")
    native public DownloadItem onListenerBiConsumer("done" event, java.util.function.BiConsumer<Event,"cancelled"> listener);
    /**
		 * Emits when the download is in a terminal state. This includes a completed download,
		 * a cancelled download (via downloadItem.cancel()), and interrupted download that can’t be resumed.
		 */
    @jsweet.lang.Name("on")
    native public DownloadItem onListenerinterruptedBiConsumer("done" event, java.util.function.BiConsumer<Event,"interrupted"> listener);
}

