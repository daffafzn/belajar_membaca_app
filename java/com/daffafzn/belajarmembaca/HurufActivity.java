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

public class HurufActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.tampil_huruf);
        show = (ImageButton) findViewById(R.id.huruf_a);
        hide = (ImageButton) findViewById(R.id.huruf_b);

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
        final MediaPlayer SuaraA = MediaPlayer.create(this, R.raw.a); //Memanggil nama lagu
        final MediaPlayer SuaraB = MediaPlayer.create(this, R.raw.b);
        final MediaPlayer SuaraC = MediaPlayer.create(this, R.raw.c);
        final MediaPlayer SuaraD = MediaPlayer.create(this, R.raw.d);
        final MediaPlayer SuaraE = MediaPlayer.create(this, R.raw.e);
        final MediaPlayer SuaraF = MediaPlayer.create(this, R.raw.f);
        final MediaPlayer SuaraG = MediaPlayer.create(this, R.raw.g);
        final MediaPlayer SuaraH = MediaPlayer.create(this, R.raw.h);
        final MediaPlayer SuaraI = MediaPlayer.create(this, R.raw.i);
        final MediaPlayer SuaraJ = MediaPlayer.create(this, R.raw.j);
        final MediaPlayer SuaraK = MediaPlayer.create(this, R.raw.k);
        final MediaPlayer SuaraL = MediaPlayer.create(this, R.raw.l);
        final MediaPlayer SuaraM = MediaPlayer.create(this, R.raw.m);
        final MediaPlayer SuaraN = MediaPlayer.create(this, R.raw.n);
        final MediaPlayer SuaraO = MediaPlayer.create(this, R.raw.o);
        final MediaPlayer SuaraP = MediaPlayer.create(this, R.raw.p);
        final MediaPlayer SuaraQ = MediaPlayer.create(this, R.raw.q);
        final MediaPlayer SuaraR = MediaPlayer.create(this, R.raw.r);
        final MediaPlayer SuaraS = MediaPlayer.create(this, R.raw.s);
        final MediaPlayer SuaraT = MediaPlayer.create(this, R.raw.t);
        final MediaPlayer SuaraU = MediaPlayer.create(this, R.raw.u);
        final MediaPlayer SuaraV = MediaPlayer.create(this, R.raw.v);
        final MediaPlayer SuaraW = MediaPlayer.create(this, R.raw.w);
        final MediaPlayer SuaraX = MediaPlayer.create(this, R.raw.x);
        final MediaPlayer SuaraY = MediaPlayer.create(this, R.raw.y);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.huruf_a); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.huruf_b);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.huruf_c);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.huruf_d);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.huruf_e);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.huruf_f);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.huruf_g);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.huruf_h);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.huruf_i);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.huruf_j);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.huruf_k);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.huruf_l);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.huruf_m);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.huruf_n);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.huruf_o);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.huruf_p);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.huruf_q);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.huruf_r);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.huruf_s);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.huruf_t);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.huruf_u);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.huruf_v);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.huruf_w);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.huruf_x);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.huruf_y);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufa);
                TampilGambar.startAnimation(animScale);
                SuaraA.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufb);
                TampilGambar.startAnimation(animScale);
                SuaraB.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufc);
                TampilGambar.startAnimation(animScale);
                SuaraC.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufd);
                TampilGambar.startAnimation(animScale);
                SuaraD.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufe);
                TampilGambar.startAnimation(animScale);
                SuaraE.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.huruff);
                TampilGambar.startAnimation(animScale);
                SuaraF.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufg);
                TampilGambar.startAnimation(animScale);
                SuaraG.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufh);
                TampilGambar.startAnimation(animScale);
                SuaraH.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufi);
                TampilGambar.startAnimation(animScale);
                SuaraI.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufj);
                TampilGambar.startAnimation(animScale);
                SuaraJ.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufk);
                TampilGambar.startAnimation(animScale);
                SuaraK.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufl);
                TampilGambar.startAnimation(animScale);
                SuaraL.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufm);
                TampilGambar.startAnimation(animScale);
                SuaraM.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufn);
                TampilGambar.startAnimation(animScale);
                SuaraN.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufo);
                TampilGambar.startAnimation(animScale);
                SuaraO.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufp);
                TampilGambar.startAnimation(animScale);
                SuaraP.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufq);
                TampilGambar.startAnimation(animScale);
                SuaraQ.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufr);
                TampilGambar.startAnimation(animScale);
                SuaraR.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufs);
                TampilGambar.startAnimation(animScale);
                SuaraS.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.huruft);
                TampilGambar.startAnimation(animScale);
                SuaraT.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufu);
                TampilGambar.startAnimation(animScale);
                SuaraU.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.hurufv);
                TampilGambar.startAnimation(animScale);
                // TODO Auto-generated method stub
                SuaraV.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufw);
                TampilGambar.startAnimation(animScale);
                SuaraW.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufx);
                TampilGambar.startAnimation(animScale);
                SuaraX.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hurufy);
                TampilGambar.startAnimation(animScale);

                SuaraY.start();
            }
        });
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);


            pindah = (ImageButton) findViewById(R.id.button_back);
            pindah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton.start();
                    Intent intent = new Intent(HurufActivity.this,BelajarActivity.class);
                    startActivity(intent);
                }
            });





    }
}
