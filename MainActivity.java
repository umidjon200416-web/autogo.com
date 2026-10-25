package uz.autogo.prava;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    private WebView web;

    private static final String BACK_JS =
        "(function(){return (window.__back&&window.__back())?1:0})()";

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        web = new WebView(this);
        setContentView(web);
        WebSettings s = web.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        web.setWebViewClient(new WebViewClient());
        web.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onJsConfirm(WebView v, String url, String msg, final JsResult r) {
                new AlertDialog.Builder(MainActivity.this)
                    .setMessage(msg)
                    .setPositiveButton(android.R.string.ok, (d, w) -> r.confirm())
                    .setNegativeButton(android.R.string.cancel, (d, w) -> r.cancel())
                    .setOnCancelListener(d -> r.cancel())
                    .show();
                return true;
            }
        });
        web.loadUrl("file:///android_asset/index.html");
    }

    @Override
    public void onBackPressed() {
        web.evaluateJavascript(BACK_JS, new ValueCallback<String>() {
            @Override
            public void onReceiveValue(String v) {
                if (!"1".equals(v)) MainActivity.super.onBackPressed();
            }
        });
    }
}
