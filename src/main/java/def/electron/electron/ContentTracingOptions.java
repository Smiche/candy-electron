package def.electron.electron;
@jsweet.lang.Interface
public abstract class ContentTracingOptions extends def.js.Object {
    /**
		 * Filter to control what category groups should be traced.
		 * A filter can have an optional - prefix to exclude category groups
		 * that contain a matching category. Having both included and excluded
		 * category patterns in the same list is not supported.
		 *
		 * Examples:
		 *   test_MyTest*
		 *   test_MyTest*,test_OtherStuff
		 *   -excluded_category1,-excluded_category2
		 */
    public String categoryFilter;
    /**
		 * Controls what kind of tracing is enabled, it is a comma-delimited list.
		 *
		 * Possible options are:
		 *   record-until-full
		 *   record-continuously
		 *   trace-to-console
		 *   enable-sampling
		 *   enable-systrace
		 *
		 * The first 3 options are trace recoding modes and hence mutually exclusive.
		 * If more than one trace recording modes appear in the traceOptions string,
		 * the last one takes precedence. If none of the trace recording modes are specified,
		 * recording mode is record-until-full.
		 *
		 * The trace option will first be reset to the default option (record_mode set
		 * to record-until-full, enable_sampling and enable_systrace set to false)
		 * before options parsed from traceOptions are applied on it.
		 */
    public String traceOptions;
}

