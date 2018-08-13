package com.nfviktor.mvcexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val cont = Controller()
        setContentView(R.layout.activity_main)
        sendButton.setOnClickListener { cont.addItem(writeText.text.toString()) }
        recieveButton.setOnClickListener { showText.text = cont.returnItem() }
    }
}
