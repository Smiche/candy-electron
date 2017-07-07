package def.electron.electron;
@jsweet.lang.Interface
public abstract class FoundInPageResult extends def.js.Object {
    public double requestId;
    /**
		 * Indicates if more responses are to follow.
		 */
    public Boolean finalUpdate;
    /**
		 * Position of the active match.
		 */
    @jsweet.lang.Optional
    public double activeMatchOrdinal;
    /**
		 * Number of Matches.
		 */
    @jsweet.lang.Optional
    public double matches;
    /**
		 * Coordinates of first match region.
		 */
    @jsweet.lang.Optional
    public RectangleData selectionArea;
}

