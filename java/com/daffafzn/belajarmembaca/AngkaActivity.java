package com.daffafzn.belajarmembaca;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AngkaActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.tampil_angka);
        show = (ImageButton) findViewById(R.id.satu);
        hide = (ImageButton) findViewById(R.id.dua);

        final Animation animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);

        show.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TampilGambar.setVisibility(View.VISIBLE);
            }
        });

        hide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TampilGambar.setVisibility(View.INVISIBLE);
            }
        });

        //Untuk Menambahkan Button Suara
        final MediaPlayer Suara0 = MediaPlayer.create(this, R.raw.nol); //Memanggil nama lagu
        final MediaPlayer Suara1 = MediaPlayer.create(this, R.raw.satu);
        final MediaPlayer Suara2 = MediaPlayer.create(this, R.raw.dua);
        final MediaPlayer Suara3 = MediaPlayer.create(this, R.raw.tiga);
        final MediaPlayer Suara4 = MediaPlayer.create(this, R.raw.empat);
        final MediaPlayer Suara5 = MediaPlayer.create(this, R.raw.lima);
        final MediaPlayer Suara6 = MediaPlayer.create(this, R.raw.enam);
        final MediaPlayer Suara7 = MediaPlayer.create(this, R.raw.tujuh);
        final MediaPlayer Suara8 = MediaPlayer.create(this, R.raw.delapan);
        final MediaPlayer Suara9 = MediaPlayer.create(this, R.raw.sembilan);
        final MediaPlayer Suara10 = MediaPlayer.create(this, R.raw.sepuluh);
        final MediaPlayer Suara11 = MediaPlayer.create(this, R.raw.sebelas);
        final MediaPlayer Suara12 = MediaPlayer.create(this, R.raw.duabelas);
        final MediaPlayer Suara13 = MediaPlayer.create(this, R.raw.tigabelas);
        final MediaPlayer Suara14 = MediaPlayer.create(this, R.raw.empatbelas);
        final MediaPlayer Suara15 = MediaPlayer.create(this, R.raw.limabelas);
        final MediaPlayer Suara16 = MediaPlayer.create(this, R.raw.enambelas);
        final MediaPlayer Suara17 = MediaPlayer.create(this, R.raw.tujuhbelas);
        final MediaPlayer Suara18 = MediaPlayer.create(this, R.raw.delapanbelas);
        final MediaPlayer Suara19 = MediaPlayer.create(this, R.raw.sembilanbelas);
        final MediaPlayer Suara20 = MediaPlayer.create(this, R.raw.duapuluh);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.nol); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.satu);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.dua);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.tiga);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.empat);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.lima);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.enam);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.tujuh);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.delapan);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.sembilan);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.sepuluh);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.sebelas);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.duabelas);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.tigabelas);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.empatbelas);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.limabelas);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.enambelas);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.tujuhbelas);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.delapanbelas);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.sembilanbelas);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.duapuluh);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.nol);
                TampilGambar.startAnimation(animScale);
                Suara0.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.satu);
                TampilGambar.startAnimation(animScale);
                Suara1.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dua);
                TampilGambar.startAnimation(animScale);
                Suara2.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.tiga);
                TampilGambar.startAnimation(animScale);
                Suara3.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.empat);
                TampilGambar.startAnimation(animScale);
                Suara4.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.lima);
                TampilGambar.startAnimation(animScale);
                Suara5.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.enam);
                TampilGambar.startAnimation(animScale);
                Suara6.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.tujuh);
                TampilGambar.startAnimation(animScale);
                Suara7.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.delapan);
                TampilGambar.startAnimation(animScale);
                Suara8.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sembilan);
                TampilGambar.startAnimation(animScale);
                Suara9.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sepuluh);
                TampilGambar.startAnimation(animScale);
                Suara10.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sebelas);
                TampilGambar.startAnimation(animScale);
                Suara11.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.duabelas);
                TampilGambar.startAnimation(animScale);
                Suara12.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.tigabelas);
                TampilGambar.startAnimation(animScale);
                Suara13.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.empatbelas);
                TampilGambar.startAnimation(animScale);
                Suara14.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.limabelas);
                TampilGambar.startAnimation(animScale);
                Suara15.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.enambelas);
                TampilGambar.startAnimation(animScale);
                Suara16.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.tujuhbelas);
                TampilGambar.startAnimation(animScale);
                Suara17.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.delapanbelas);
                TampilGambar.startAnimation(animScale);
                Suara18.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sembilanbelas);
                TampilGambar.startAnimation(animScale);
                Suara19.start();
            }
        });

        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.duapuluh);
                TampilGambar.startAnimation(animScale);
                Suara20.start();
            }
        });
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);


        pindah = (ImageButton) findViewById(R.id.button_back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(AngkaActivity.this,BelajarActivity.class);
                startActivity(intent);
            }
        });



    }
}
