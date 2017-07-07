package def.electron.electron;
@jsweet.lang.Interface
public abstract class JumpListSettings extends def.js.Object {
    /**
		 * The minimum number of items that will be shown in the Jump List.
		 */
    public double minItems;
    /**
		 * Items that the user has explicitly removed from custom categories in the Jump List.
		 */
    public JumpListItem[] removedItems;
}

