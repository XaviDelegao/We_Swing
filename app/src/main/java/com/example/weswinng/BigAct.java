package com.example.weswinng;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.weswinng.fragments.calendari;
import com.example.weswinng.fragments.fragment_filtres;
import com.example.weswinng.fragments.novetatsFragment;

public class BigAct extends AppCompatActivity {

    ImageView reloj,libreta,estrella,calendario,lupa,mensaje;
    TextView dondeEstas;
    Fragment calendariFragment,FiltresFragment,novetatsFragment;
    FrameLayout fLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big);
        initall();
        clicklisteners();

    }

    public void initall(){
        dondeEstas = (TextView) findViewById(R.id.textViewDondeEstas);

        reloj =(ImageView) findViewById(R.id.relojButton);
        libreta = (ImageView) findViewById(R.id.libretaButton);
        estrella = (ImageView) findViewById(R.id.estrellaButton);
        calendario = (ImageView) findViewById(R.id.calendarButton);
        lupa = (ImageView) findViewById(R.id.lupaButton);
        mensaje = (ImageView) findViewById(R.id.bocadilloButton);


    }


    public void changeTitle(String text){
        dondeEstas.setText(text);
    }
    public void clicklisteners(){
        reloj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dondeEstas.setText("Novetats");
                novetatsFragment = new novetatsFragment();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragmentContainer,novetatsFragment);
                ft.commit();

                reloj.setImageResource(R.drawable.relojred);
                libreta.setImageResource(R.drawable.diario);
                estrella.setImageResource(R.drawable.estrella);
                calendario.setImageResource(R.drawable.calendario);
                lupa.setImageResource(R.drawable.lupa);
                mensaje.setImageResource(R.drawable.bocadillo);

            }
        });
        libreta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dondeEstas.setText("Filtres");
                FiltresFragment = new fragment_filtres();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragmentContainer,FiltresFragment);
                ft.commit();

                reloj.setImageResource(R.drawable.reloj);
                libreta.setImageResource(R.drawable.diariored);
                estrella.setImageResource(R.drawable.estrella);
                calendario.setImageResource(R.drawable.calendario);
                lupa.setImageResource(R.drawable.lupa);
                mensaje.setImageResource(R.drawable.bocadillo);
            }
        });
        estrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dondeEstas.setText("Critiques");

                reloj.setImageResource(R.drawable.reloj);
                libreta.setImageResource(R.drawable.diario);
                estrella.setImageResource(R.drawable.estrellared);
                calendario.setImageResource(R.drawable.calendario);
                lupa.setImageResource(R.drawable.lupa);
                mensaje.setImageResource(R.drawable.bocadillo);
            }
        });
        calendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendariFragment = new calendari();
                dondeEstas.setText("Mogudes");
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragmentContainer,calendariFragment);
                ft.commit();

                reloj.setImageResource(R.drawable.reloj);
                libreta.setImageResource(R.drawable.diario);
                estrella.setImageResource(R.drawable.estrella);
                calendario.setImageResource(R.drawable.calendariored);
                lupa.setImageResource(R.drawable.lupa);
                mensaje.setImageResource(R.drawable.bocadillo);
            }
        });
        lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dondeEstas.setText("Buscar");

                reloj.setImageResource(R.drawable.reloj);
                libreta.setImageResource(R.drawable.diario);
                estrella.setImageResource(R.drawable.estrella);
                calendario.setImageResource(R.drawable.calendario);
                lupa.setImageResource(R.drawable.lupared);
                mensaje.setImageResource(R.drawable.bocadillo);
            }
        });
        mensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dondeEstas.setText("Xats");


                reloj.setImageResource(R.drawable.reloj);
                libreta.setImageResource(R.drawable.diario);
                estrella.setImageResource(R.drawable.estrella);
                calendario.setImageResource(R.drawable.calendario);
                lupa.setImageResource(R.drawable.lupa);
                mensaje.setImageResource(R.drawable.bocadillored);
            }
        });

    }

    public void replaceFragmentMoguda(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer,fragment);
        fragmentTransaction.commit();
    }
}