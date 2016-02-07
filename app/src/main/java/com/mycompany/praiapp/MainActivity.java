package com.mycompany.praiapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    /*
    Paso 1: definimos el arrayList fuera del onCreate.
    Asi podemos accederlo cuando generamos el toast.
    */
    ArrayList<Playa> listaDePlayas = new ArrayList<Playa>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * Paso 2: definimos la fuente de datos
        * Para este ejemplo intanciamos objetos Playa manualmente.
        *Cada item de la lista tiene 2 strings y una foto
        * VER http://www.pcsalt.com/android/listview-using-baseadapter-android/
        */

        Playa playa1 = new Playa("Ipanema", "Rio", R.drawable.playa1);
        Playa playa2 = new Playa("Itacaré", "Bahia", R.drawable.playa2);
        Playa playa3 = new Playa("Jericocoara", "Ceara", R.drawable.playa3);
        Playa playa4 = new Playa("joaquina", "Santa Catarina", R.drawable.playa4);

        // Paso 3: Generamos un ArrayList con nuestros datos. Cada elem es un objeto Playa

        listaDePlayas.add(playa1);
        listaDePlayas.add(playa2);
        listaDePlayas.add(playa3);
        listaDePlayas.add(playa4);

        /*
        En esta version no nos alcanza un Array adapter.
        Necesitar definir nuestro propio  adapter en una clase aparte para inflar el xml y
        obtener una vista.
        Podemos elegir entre reescribir el metodo getView de ArrayAdapter, o extender de
        BaseAdapter. Vamos a hacer lo segundo.
        */

        ListView listView = (ListView) findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter(this, listaDePlayas);

        //Paso 4: conectamos el adapter a la listView.
        listView.setAdapter(myAdapter);

        //Paso 5: creamos un OnItemClickListener y un toast con el nombre de la playa
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Playa playa = listaDePlayas.get(position);
                Toast.makeText(getBaseContext(), playa.getNombre(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
