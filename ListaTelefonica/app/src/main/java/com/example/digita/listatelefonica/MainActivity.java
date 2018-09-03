package com.example.digita.listatelefonica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pessoas> pessoasLista = new ArrayList<Pessoas>();
        ListView lista;

        pessoasLista.add(new Pessoas("Carlos", "969416765"));
        pessoasLista.add(new Pessoas("Carlos", "969416765"));
        pessoasLista.add(new Pessoas("Carlos", "969416765"));
        pessoasLista.add(new Pessoas("Carlos", "969416765"));

        lista = (ListView)findViewById(R.id.lista);
        ArrayAdapter adapter = new ArrayAdapter<Pessoas>(this, android.R.layout.simple_list_item_1, pessoasLista);
        lista.setAdapter(adapter);
    }
}
