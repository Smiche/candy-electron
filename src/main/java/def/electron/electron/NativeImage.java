package def.electron.electron;
/**
	 * This class is used to represent an image.
	 */
public class NativeImage extends def.js.Object {
    /**
		 * Creates an empty NativeImage instance.
		 */
    native public static NativeImage createEmpty();
    /**
		 * Creates a new NativeImage instance from file located at path.
		 * This method returns an empty image if the path does not exist, cannot be read, or is not a valid image.
		 */
    native public static NativeImage createFromPath(String path);
    /**
		 * Creates a new NativeImage instance from buffer.
		 * @param scaleFactor 1.0 by default.
		 */
    native public static NativeImage createFromBuffer(Buffer buffer, double scaleFactor);
    /**
		 * Creates a new NativeImage instance from dataURL
		 */
    native public static NativeImage createFromDataURL(String dataURL);
    /**
		 * @returns Buffer that contains the image's PNG encoded data.
		 */
    native public Buffer toPNG();
    /**
		 * @returns Buffer that contains the image's JPEG encoded data.
		 */
    native public Buffer toJPEG(double quality);
    /**
		 * @returns Buffer that contains a copy of the image's raw bitmap pixel data.
		 */
    native public Buffer toBitmap();
    /**
		 * @returns Buffer that contains the image's raw bitmap pixel data.
		 *
		 * The difference between getBitmap() and toBitmap() is, getBitmap() does not copy the bitmap data,
		 * so you have to use the returned Buffer immediately in current event loop tick,
		 * otherwise the data might be changed or destroyed.
		 */
    native public Buffer getBitmap();
    /**
		 * @returns The data URL of the image.
		 */
    native public String toDataURL();
    /**
		 * The native type of the handle is NSImage* on macOS.
		 * Note: This is only implemented on macOS.
		 * @returns The platform-specific handle of the image as Buffer.
		 */
    native public Buffer getNativeHandle();
    /**
		 * @returns Whether the image is empty.
		 */
    native public Boolean isEmpty();
    /**
		 * @returns The size of the image.
		 */
    native public SizeData getSize();
    /**
		 * Marks the image as template image.
		 */
    native public void setTemplateImage(Boolean option);
    /**
		 * Returns a boolean whether the image is a template image.
		 */
    native public Boolean isTemplateImage();
    /**
		 * Creates a new NativeImage instance from buffer.
		 * @param scaleFactor 1.0 by default.
		 */
    native public static NativeImage createFromBuffer(Buffer buffer);
}

