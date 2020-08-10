package com.example.goldgame

// this import borks the build
// import android.R
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goldGameView = findViewById<WebView>(R.id.goldGameapp)
        goldGameView.webViewClient = WebViewClient()
        goldGameView.loadUrl("https://www.suckerpun.ch/goldgame/")

    }


}