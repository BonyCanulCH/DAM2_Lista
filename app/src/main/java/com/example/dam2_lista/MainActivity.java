package com.example.dam2_lista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerAsig;
    private ListView listaTareas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerAsig = (Spinner)findViewById(R.id.spinasig);
        listaTareas = (ListView) findViewById(R.id.listareas);

        ArrayAdapter spinAdapter = ArrayAdapter.createFromResource(this, R.array.Asig, android.R.layout.simple_spinner_item);
        spinnerAsig.setAdapter(spinAdapter);

        spinnerAsig.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> lista, View view, int pos, long l) {
                if(lista.getItemAtPosition(pos).equals("Analisis_y_Diseño_de_Sistemas")){
                    ArrayAdapter listaAdapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.Analisis_y_Diseño_de_Sistemas, android.R.layout.simple_list_item_1);
                    listaTareas.setAdapter(listaAdapter);
                }
                if(lista.getItemAtPosition(pos).equals("Investigacion_de_Operaciones")){
                    ArrayAdapter listaAdapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.Investigacion_de_Operaciones, android.R.layout.simple_list_item_1);
                    listaTareas.setAdapter(listaAdapter);
                }
                if(lista.getItemAtPosition(pos).equals("Desarrollo_de_App_Moviles_2")){
                    ArrayAdapter listaAdapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.Desarrollo_de_App_Moviles_2, android.R.layout.simple_list_item_1);
                    listaTareas.setAdapter(listaAdapter);
                }
                if(lista.getItemAtPosition(pos).equals("Administracion_de_Redes")){
                    ArrayAdapter listaAdapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.Administracion_de_Redes, android.R.layout.simple_list_item_1);
                    listaTareas.setAdapter(listaAdapter);
                }
                if(lista.getItemAtPosition(pos).equals("Administracion_de_BD")){
                    ArrayAdapter listaAdapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.Administracion_de_BD, android.R.layout.simple_list_item_1);
                    listaTareas.setAdapter(listaAdapter);
                }
                if(lista.getItemAtPosition(pos).equals("Competencias")){
                    ArrayAdapter listaAdapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.Competencias, android.R.layout.simple_list_item_1);
                    listaTareas.setAdapter(listaAdapter);
                }
                if(lista.getItemAtPosition(pos).equals("Economia")){
                    ArrayAdapter listaAdapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.Economía, android.R.layout.simple_list_item_1);
                    listaTareas.setAdapter(listaAdapter);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}