package com.abh.viewmore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.widget.TextView
import com.abh.viewmorelib.ViewMoreHolder


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var description = ""
        for (i in 0..4) {
            description += "This is Long Text This is Long TextThis is Long Text This is Long This is Long Text This is Long TextThis is Long Text This is Long $i"
        }

        val tv_description = findViewById<TextView>(R.id.tv_description)
        //        ViewMoreHolder.load(tv_description,description, Typeface.DEFAULT,true,3,false);
        //        ViewMoreHolder.load(tv_description,description, Typeface.DEFAULT,true,3,false);
        ViewMoreHolder.load(tv_description, description, null, false, 3, true)
    }
}