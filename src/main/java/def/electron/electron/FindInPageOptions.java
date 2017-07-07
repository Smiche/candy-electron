package def.electron.electron;
@jsweet.lang.Interface
public abstract class FindInPageOptions extends def.js.Object {
    /**
		 * Whether to search forward or backward, defaults to true
		 */
    @jsweet.lang.Optional
    public Boolean forward;
    /**
		 * Whether the operation is first request or a follow up, defaults to false.
		 */
    @jsweet.lang.Optional
    public Boolean findNext;
    /**
		 * Whether search should be case-sensitive, defaults to false.
		 */
    @jsweet.lang.Optional
    public Boolean matchCase;
    /**
		 * Whether to look only at the start of words. defaults to false.
		 */
    @jsweet.lang.Optional
    public Boolean wordStart;
    /**
		 * When combined with wordStart, accepts a match in the middle of a word
		 * if the match begins with an uppercase letter followed by a lowercase
		 * or non-letter. Accepts several other intra-word matches, defaults to false.
		 */
    @jsweet.lang.Optional
    public Boolean medialCapitalAsWordStart;
}

