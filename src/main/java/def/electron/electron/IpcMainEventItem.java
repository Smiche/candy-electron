package def.electron.electron;

import jsweet.lang.Interface;

@Interface
public class IpcMainEventItem extends def.js.Object {
    public WebContents sender;
    public Object returnValue;
}

