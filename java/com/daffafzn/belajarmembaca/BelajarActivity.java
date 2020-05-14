package com.daffafzn.belajarmembaca;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class BelajarActivity extends AppCompatActivity {
    ImageButton pindah;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);


        pindah = (ImageButton) findViewById(R.id.menu_huruf);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,HurufActivity.class);
                startActivity(intent);
                finish();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_mengeja);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,MengejaActivity.class);
                startActivity(intent);
                finish();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_angka);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,AngkaActivity.class);
                startActivity(intent);
                finish();
            }
        });

        pindah = (ImageButton) findViewById(R.id.button_back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });




    }
}
