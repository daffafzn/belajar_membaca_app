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

public class MengejaActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mengeja);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.tampil_mengeja);
        show = (ImageButton) findViewById(R.id.ejatupai);
        hide = (ImageButton) findViewById(R.id.ejaserigala);

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
        final MediaPlayer SuaraTruk = MediaPlayer.create(this, R.raw.tupai); //Memanggil nama lagu
        final MediaPlayer SuaraAnjing = MediaPlayer.create(this, R.raw.serigala);
        final MediaPlayer SuaraBuku = MediaPlayer.create(this, R.raw.ular);
        final MediaPlayer SuaraBunga = MediaPlayer.create(this, R.raw.sapi);
        final MediaPlayer SuaraDunia = MediaPlayer.create(this, R.raw.rusa);
        final MediaPlayer SuaraEsia = MediaPlayer.create(this, R.raw.gajah);
        final MediaPlayer SuaraGlobe = MediaPlayer.create(this, R.raw.kuda);
        final MediaPlayer SuaraHujan = MediaPlayer.create(this, R.raw.kudanil);
        final MediaPlayer SuaraKapal = MediaPlayer.create(this, R.raw.beruang);
        final MediaPlayer SuaraKopi = MediaPlayer.create(this, R.raw.zebra);
        final MediaPlayer SuaraLonceng = MediaPlayer.create(this, R.raw.rakun);
        final MediaPlayer SuaraMobil = MediaPlayer.create(this, R.raw.domba);
        final MediaPlayer SuaraMusik = MediaPlayer.create(this, R.raw.unta);
        final MediaPlayer SuaraNarator = MediaPlayer.create(this, R.raw.jerapah);
        final MediaPlayer SuaraOlahraga = MediaPlayer.create(this, R.raw.kelinci);
        final MediaPlayer SuaraPayung = MediaPlayer.create(this, R.raw.babi);
        final MediaPlayer SuaraRoket = MediaPlayer.create(this, R.raw.kambing);
        final MediaPlayer SuaraSurat = MediaPlayer.create(this, R.raw.macan);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.ejatupai); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.ejaserigala);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.ejaular);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.ejasapi);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.ejarusa);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.ejagajah);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.ejakuda);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.ejakudanil);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.ejaberuang);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.ejazebra);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.ejarubah);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.ejadomba);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.ejaunta);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.ejajerapah);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.ejakelinci);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.ejababi);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.ejakambing);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.ejamacan);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.poptupai);
                TampilGambar.startAnimation(animScale);
                SuaraTruk.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.popserigala);
                TampilGambar.startAnimation(animScale);
                SuaraAnjing.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.popular);
                TampilGambar.startAnimation(animScale);
                SuaraBuku.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.popsapi);
                TampilGambar.startAnimation(animScale);
                SuaraBunga.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.poprusa);
                TampilGambar.startAnimation(animScale);
                SuaraDunia.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.popgajah);
                TampilGambar.startAnimation(animScale);
                SuaraEsia.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.popkuda);
                TampilGambar.startAnimation(animScale);
                SuaraGlobe.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.popkudanil);
                TampilGambar.startAnimation(animScale);
                SuaraHujan.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.popberuang);
                TampilGambar.startAnimation(animScale);
                SuaraKapal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.popzebra);
                TampilGambar.startAnimation(animScale);
                SuaraKopi.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.poprakun);
                TampilGambar.startAnimation(animScale);
                SuaraLonceng.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.popdomba);
                TampilGambar.startAnimation(animScale);
                SuaraMobil.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.popunta);
                TampilGambar.startAnimation(animScale);
                SuaraMusik.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.popjerapah);
                TampilGambar.startAnimation(animScale);
                SuaraNarator.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.popkelinci);
                TampilGambar.startAnimation(animScale);
                SuaraOlahraga.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.popbabi);
                TampilGambar.startAnimation(animScale);
                SuaraPayung.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.popkambing);
                TampilGambar.startAnimation(animScale);
                SuaraRoket.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.popmacan);
                TampilGambar.startAnimation(animScale);
                SuaraSurat.start();
            }
        });
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);


        pindah = (ImageButton) findViewById(R.id.button_back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(MengejaActivity.this,BelajarActivity.class);
                startActivity(intent);
                finish();
            }
        });



    }
}
