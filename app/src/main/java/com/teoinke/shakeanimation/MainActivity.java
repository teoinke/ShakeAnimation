package com.teoinke.shakeanimation;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shake(View v) {
        // Create shake effect from xml resource
        Animation shake = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
        // View element to be shaken
        TextView s = (TextView) findViewById(R.id.testView);
        // Perform animation
        s.startAnimation(shake);
    }

}
