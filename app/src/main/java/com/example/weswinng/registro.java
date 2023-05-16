package com.example.weswinng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

public class registro extends AppCompatActivity {

    Spinner genero, idioma, pais, ciudad;
    Button upload;
    Button Register;
    EditText nombre,email,password,poblacion;
    Switch Teacher,Dancer,Music;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        init();
    }

    public void init(){
        genero = (Spinner) findViewById(R.id.spinnerGenere);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,
                R.array.generes_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        genero.setAdapter(adapter);


        idioma = (Spinner) findViewById(R.id.spinnerIdioma);

        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(this,
                R.array.idiomas, android.R.layout.simple_spinner_item);

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        idioma.setAdapter(adapter2);



        pais = (Spinner) findViewById(R.id.spinnerPais);

        ArrayAdapter<CharSequence> adapter3=ArrayAdapter.createFromResource(this,
                R.array.paisos, android.R.layout.simple_spinner_item);

        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        pais.setAdapter(adapter3);


        ciudad = (Spinner) findViewById(R.id.spinnerCiutat);

        ArrayAdapter<CharSequence> adapter4=ArrayAdapter.createFromResource(this,
                R.array.ciutats, android.R.layout.simple_spinner_item);

        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        ciudad.setAdapter(adapter4);

    }


}