package com.daffafzn.belajarmembaca;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton pindah;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);
        mp = MediaPlayer.create(getBaseContext(),R.raw.backsound);
        mp.start();

        pindah = (ImageButton) findViewById(R.id.button_belajar);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent i = new Intent(MainActivity.this,BelajarActivity.class);
                startActivity(i);
                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.button_exit);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);

            }
        });

    }
}
