package com.mycompany.praiapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * Paso 1: definimos la fuente de datos
        * Para este ejemplo ingresamos datos manualmente.
        *
        * En la version 2 vamos a hacer que en cada item de la lista haya una descripcion y una foto
        * VER http://www.pcsalt.com/android/listview-using-baseadapter-android/
        */

        String[] playa = new String[] {"Ipanema", "Leblon", "Barra", "Prainha", "Buzios",
        "Lopes Mendes", "Trindade", "Morro de Sao Pablo", "Itacare", "Boipeba",
                "Cueira", "Bainema", "Tapus da Fora"};

        /* Paso 2:
        Definimos una listView  y un Array adapter.

        El arrayAdapter inserta cada uno de los elem del array en una vista XML.
        Llama al metodo toString() para cada elem del array, y espera que la
        vista XML sea un simple TextView.

        En la verion 2 vamos a necesitar definir nuestro propio inflater para hacer esto.
        Podemos elegir entre reescribir el metodo getView de ArrayAdapter, o extender de
        BaseAdapter. Vamos a hacer lo segundo.
        */

        ListView listView = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, R.layout.list_item, playa);

        //Paso 3: conectamos el adapter a la listView.
        listView.setAdapter(myAdapter);
    }
}
