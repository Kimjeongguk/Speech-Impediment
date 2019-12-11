package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.ex.R;

public class MainActivity extends AppCompatActivity {
    private SoundPool sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton b1 = (ImageButton)findViewById(R.id.t11);
        ImageButton b2 = (ImageButton)findViewById(R.id.t22);
        ImageButton b3 = (ImageButton)findViewById(R.id.t33);
        ImageButton b4 = (ImageButton)findViewById(R.id.t44);



        sound = new SoundPool(4, AudioManager.STREAM_MUSIC,0);

        final int soundID1 = sound.load(this,R.raw.t1,1);
        final int soundID2 = sound.load(this,R.raw.t2,2);
        final int soundID3 = sound.load(this,R.raw.t3,3);
        final int soundID4 = sound.load(this,R.raw.t4,4);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.play(soundID1,1,1,0,0,0);
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.play(soundID2,1,1,0,0,0);
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.play(soundID3,1,1,0,0,0);
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.play(soundID4,1,1,0,0,0);
            }
        });

    }

}
