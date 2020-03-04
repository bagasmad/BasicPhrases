package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    static MediaPlayer mediaPlayer;
    List idMedia = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Collections.addAll(idMedia, R.raw.doyouspeakenglish, R.raw.goodevening, R.raw.hello, R.raw.howareyou,
                R.raw.ilivein, R.raw.mynameis, R.raw.please, R.raw.welcome);
        MainActivity.mediaPlayer = MediaPlayer.create(this, (Integer) idMedia.get(0));
    }

    public void ButtonClick(View view)
    {
        if(MainActivity.mediaPlayer.isPlaying())
        {
            MainActivity.mediaPlayer.stop();
        }
            Button button = findViewById(view.getId());
            MainActivity.mediaPlayer = MediaPlayer.create(this, (Integer) idMedia.get(Integer.parseInt(button.getTag().toString())));
            MainActivity.mediaPlayer.start();
    }
}
