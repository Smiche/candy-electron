package def.electron;
@jsweet.lang.Interface
@jsweet.lang.Mixin(target=def.dom.Document.class)
public abstract class Document extends def.dom.Document {
    native public def.electron.electron.WebViewElement createElement("webview" tagName);
}

