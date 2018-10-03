package com.elyeproj.webappinteraction

import android.content.pm.ApplicationInfo
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.JavascriptInterface
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.elyeproj.webappinteraction.R.id.*
import kotlinx.android.synthetic.main.activity_main.*

import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WebView.setWebContentsDebuggingEnabled(true)

        my_web_view.settings.javaScriptEnabled = true
        my_web_view.loadUrl(BASE_URL)
    }

    companion object {
        private val BASE_URL = "file:///android_asset/webview.html"
    }
}
