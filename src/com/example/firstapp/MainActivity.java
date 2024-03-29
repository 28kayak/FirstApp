package com.example.firstapp;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity 
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    protected void onResume()
    {
    	super.onResume();
    	Log.d("MainActivity", "onResume");
    }
    protected void onPause()
    {
    	super.onPause();
    	Log.d("MainActivity", "onPause");
    }
}
