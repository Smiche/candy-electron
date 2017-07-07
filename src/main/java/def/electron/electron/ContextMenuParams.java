package def.electron.electron;
@jsweet.lang.Interface
public abstract class ContextMenuParams extends def.js.Object {
    /**
		 * x coordinate
		 */
    public double x;
    /**
		 * y coordinate
		 */
    public double y;
    /**
		 * URL of the link that encloses the node the context menu was invoked on.
		 */
    public String linkURL;
    /**
		 * Text associated with the link. May be an empty string if the contents of the link are an image.
		 */
    public String linkText;
    /**
		 * URL of the top level page that the context menu was invoked on.
		 */
    public String pageURL;
    /**
		 * URL of the subframe that the context menu was invoked on.
		 */
    public String frameURL;
    /**
		 * Source URL for the element that the context menu was invoked on.
		 * Elements with source URLs are images, audio and video.
		 */
    public String srcURL;
    /**
		 * Type of the node the context menu was invoked on.
		 */
    public Object mediaType;
    /**
		 * Parameters for the media element the context menu was invoked on.
		 */
    public MediaFlags mediaFlags;
    /**
		 * Whether the context menu was invoked on an image which has non-empty contents.
		 */
    public Boolean hasImageContents;
    /**
		 * Whether the context is editable.
		 */
    public Boolean isEditable;
    /**
		 * These flags indicate whether the renderer believes it is able to perform the corresponding action.
		 */
    public EditFlags editFlags;
    /**
		 * Text of the selection that the context menu was invoked on.
		 */
    public String selectionText;
    /**
		 * Title or alt text of the selection that the context was invoked on.
		 */
    public String titleText;
    /**
		 * The misspelled word under the cursor, if any.
		 */
    public String misspelledWord;
    /**
		 * The character encoding of the frame on which the menu was invoked.
		 */
    public String frameCharset;
    /**
		 * If the context menu was invoked on an input field, the type of that field.
		 */
    public Object inputFieldType;
    /**
		 * Input source that invoked the context menu.
		 */
    public Object menuSourceType;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class MediaFlags extends def.js.Object {
        /**
			 * Whether the media element has crashed.
			 */
        public Boolean inError;
        /**
			 * Whether the media element is paused.
			 */
        public Boolean isPaused;
        /**
			 * Whether the media element is muted.
			 */
        public Boolean isMuted;
        /**
			 * Whether the media element has audio.
			 */
        public Boolean hasAudio;
        /**
			 * Whether the media element is looping.
			 */
        public Boolean isLooping;
        /**
			 * Whether the media element's controls are visible.
			 */
        public Boolean isControlsVisible;
        /**
			 * Whether the media element's controls are toggleable.
			 */
        public Boolean canToggleControls;
        /**
			 * Whether the media element can be rotated.
			 */
        public Boolean canRotate;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class EditFlags extends def.js.Object {
        /**
			 * Whether the renderer believes it can undo.
			 */
        public Boolean canUndo;
        /**
			 * Whether the renderer believes it can redo.
			 */
        public Boolean canRedo;
        /**
			 * Whether the renderer believes it can cut.
			 */
        public Boolean canCut;
        /**
			 * Whether the renderer believes it can copy
			 */
        public Boolean canCopy;
        /**
			 * Whether the renderer believes it can paste.
			 */
        public Boolean canPaste;
        /**
			 * Whether the renderer believes it can delete.
			 */
        public Boolean canDelete;
        /**
			 * Whether the renderer believes it can select all.
			 */
        public Boolean canSelectAll;
    }
}

