package def.electron.electron;
/**
	 * The crash-reporter module enables sending your app's crash reports.
	 */
@jsweet.lang.Interface
public abstract class CrashReporter extends def.js.Object {
    /**
		 * You are required to call this method before using other crashReporter APIs.
		 *
		 * Note: On macOS, Electron uses a new crashpad client, which is different from breakpad
		 * on Windows and Linux. To enable the crash collection feature, you are required to call
		 * the crashReporter.start API to initialize crashpad in the main process and in each
		 * renderer process from which you wish to collect crash reports.
		 */
    native public void start(CrashReporterStartOptions options);
    /**
		 * @returns The crash report. When there was no crash report
		 * sent or the crash reporter is not started, null will be returned.
		 */
    native public CrashReport getLastCrashReport();
    /**
		 * @returns All uploaded crash reports.
		 */
    native public CrashReport[] getUploadedReports();
}

