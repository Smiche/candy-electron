package def.electron.electron;
/**
	 * The clipboard module provides methods to perform copy and paste operations.
	 */
@jsweet.lang.Interface
public abstract class Clipboard extends def.js.Object {
    /**
		 * @returns The contents of the clipboard as plain text.
		 */
    native public String readText("" type);
    /**
		 * Writes the text into the clipboard as plain text.
		 */
    native public void writeText(String text, "" type);
    /**
		 * @returns The contents of the clipboard as markup.
		 */
    native public String readHTML("" type);
    /**
		 * Writes markup to the clipboard.
		 */
    native public void writeHTML(String markup, "" type);
    /**
		 * @returns The contents of the clipboard as a NativeImage.
		 */
    native public NativeImage readImage("" type);
    /**
		 * Writes the image into the clipboard.
		 */
    native public void writeImage(NativeImage image, "" type);
    /**
		 * @returns The contents of the clipboard as RTF.
		 */
    native public String readRTF("" type);
    /**
		 * Writes the text into the clipboard in RTF.
		 */
    native public void writeRTF(String text, "" type);
    /**
		 * Clears everything in clipboard.
		 */
    native public void clear("" type);
    /**
		 * @returns Array available formats for the clipboard type.
		 */
    native public String[] availableFormats("" type);
    /**
		 * Returns whether the clipboard supports the format of specified data.
		 * Note: This API is experimental and could be removed in future.
		 * @returns Whether the clipboard has data in the specified format.
		 */
    native public Boolean has(String format, "" type);
    /**
		 * Reads the data in the clipboard of the specified format.
		 * Note: This API is experimental and could be removed in future.
		 */
    native public jsweet.util.union.Union<String,NativeImage> read(String format, "" type);
    /**
		 * Writes data to the clipboard.
		 */
    native public void write(Object data, "" type);
    /**
		 * @returns An Object containing title and url keys representing the bookmark in the clipboard.
		 *
		 * Note: This API is available on macOS and Windows.
		 */
    native public Bookmark readBookmark();
    /**
		 * Writes the title and url into the clipboard as a bookmark.
		 *
		 * Note: This API is available on macOS and Windows.
		 */
    native public void writeBookmark(String title, String url, "" type);
    /**
		 * The text on the find pasteboard. This method uses synchronous IPC when called from the renderer process.
		 * The cached value is reread from the find pasteboard whenever the application is activated.
		 *
		 * Note: This API is available on macOS.
		 */
    native public String readFindText();
    /**
		 * Writes the text into the find pasteboard as plain text.
		 * This method uses synchronous IPC when called from the renderer process.
		 *
		 * Note: This API is available on macOS.
		 */
    native public void writeFindText(String text);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Data extends def.js.Object {
        public String text;
        @jsweet.lang.Optional
        public String bookmark;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class DataData extends def.js.Object {
        public String rtf;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class DataDto extends def.js.Object {
        public String html;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class DataStructure extends def.js.Object {
        public NativeImage image;
    }
    /**
		 * @returns The contents of the clipboard as plain text.
		 */
    native public String readText();
    /**
		 * Writes the text into the clipboard as plain text.
		 */
    native public void writeText(String text);
    /**
		 * @returns The contents of the clipboard as markup.
		 */
    native public String readHTML();
    /**
		 * Writes markup to the clipboard.
		 */
    native public void writeHTML(String markup);
    /**
		 * @returns The contents of the clipboard as a NativeImage.
		 */
    native public NativeImage readImage();
    /**
		 * Writes the image into the clipboard.
		 */
    native public void writeImage(NativeImage image);
    /**
		 * @returns The contents of the clipboard as RTF.
		 */
    native public String readRTF();
    /**
		 * Writes the text into the clipboard in RTF.
		 */
    native public void writeRTF(String text);
    /**
		 * Clears everything in clipboard.
		 */
    native public void clear();
    /**
		 * @returns Array available formats for the clipboard type.
		 */
    native public String[] availableFormats();
    /**
		 * Returns whether the clipboard supports the format of specified data.
		 * Note: This API is experimental and could be removed in future.
		 * @returns Whether the clipboard has data in the specified format.
		 */
    native public Boolean has(String format);
    /**
		 * Reads the data in the clipboard of the specified format.
		 * Note: This API is experimental and could be removed in future.
		 */
    native public jsweet.util.union.Union<String,NativeImage> read(String format);
    /**
		 * Writes data to the clipboard.
		 */
    native public void write(Object data);
    /**
		 * Writes the title and url into the clipboard as a bookmark.
		 *
		 * Note: This API is available on macOS and Windows.
		 */
    native public void writeBookmark(String title, String url);
    /**
		 * @returns The contents of the clipboard as plain text.
		 */
    native public String readText("selection" type);
    /**
		 * Writes the text into the clipboard as plain text.
		 */
    native public void writeText(String text, "selection" type);
    /**
		 * @returns The contents of the clipboard as markup.
		 */
    native public String readHTML("selection" type);
    /**
		 * Writes markup to the clipboard.
		 */
    native public void writeHTML(String markup, "selection" type);
    /**
		 * @returns The contents of the clipboard as a NativeImage.
		 */
    native public NativeImage readImage("selection" type);
    /**
		 * Writes the image into the clipboard.
		 */
    native public void writeImage(NativeImage image, "selection" type);
    /**
		 * @returns The contents of the clipboard as RTF.
		 */
    native public String readRTF("selection" type);
    /**
		 * Writes the text into the clipboard in RTF.
		 */
    native public void writeRTF(String text, "selection" type);
    /**
		 * Clears everything in clipboard.
		 */
    native public void clear("selection" type);
    /**
		 * @returns Array available formats for the clipboard type.
		 */
    native public String[] availableFormats("selection" type);
    /**
		 * Returns whether the clipboard supports the format of specified data.
		 * Note: This API is experimental and could be removed in future.
		 * @returns Whether the clipboard has data in the specified format.
		 */
    native public Boolean has(String format, "selection" type);
    /**
		 * Reads the data in the clipboard of the specified format.
		 * Note: This API is experimental and could be removed in future.
		 */
    native public jsweet.util.union.Union<String,NativeImage> read(String format, "selection" type);
    /**
		 * Writes data to the clipboard.
		 */
    native public void write(Object data, "selection" type);
    /**
		 * Writes the title and url into the clipboard as a bookmark.
		 *
		 * Note: This API is available on macOS and Windows.
		 */
    native public void writeBookmark(String title, String url, "selection" type);
}

