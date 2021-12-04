package com.abh.viewmore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String description="";
        for(int i=0;i<5;i++)
        {
            description+="This is Long Text This is Long TextThis is Long Text This is Long This is Long Text This is Long TextThis is Long Text This is Long "+i+"";
        }

        TextView tv_description = findViewById(R.id.tv_description);
     //        ViewMoreHolder.load(tv_description,description, Typeface.DEFAULT,true,3,false);
        ViewMoreHolder.load(tv_description,description, null,false,3,true);

    }
}