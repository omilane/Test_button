package com.example.test_button;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CambiaTesto(View v){
        /*
        v.setEnabled(false);
        Log.d("fatto", "bottone sparito");
         */

        /*
        Button oggetto_nome = (Button) v;
        oggetto_nome.setText("Ciao Mondo");
        */
        /*
        View pippo = findViewById(R.id.testo_prova);
        TextView centrale = (TextView) pippo;
        ((TextView) pippo).setText("Ciao");
        */

        //creo l'oggetto testoIn a cui dò l'id del testo in input
        View testoIn = findViewById(R.id.testoIn);
        EditText testoInput = (EditText) testoIn;

        //creo l'oggetto testoOUt a cui do l'id di dove voglio scrivere
        View testoOut = findViewById(R.id.testo_prova);
        TextView testoMostrato = (TextView) testoOut;

        //Salvo il testo in una string e poi uso l'oggetto creato per visualizzare
        String prova = String.valueOf(testoInput.getText());
        testoMostrato.setText(prova);

        //scrivi un messaggio di popup
        Toast.makeText(this, "Modifica effettuata", Toast.LENGTH_LONG).show();

    }

}