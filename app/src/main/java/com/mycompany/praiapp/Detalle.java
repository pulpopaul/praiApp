package com.mycompany.praiapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pulpo on 07/02/16.
 */
public class Detalle extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        //Recibimos el bundle
        Bundle extras = getIntent().getExtras();

        //Insertamos el texto e imagen en la nueva activity
        String nombre = extras.getString("nombre");
        TextView textViewNombre = (TextView) findViewById(R.id.nombreDetalle);
        textViewNombre.setText(nombre);

        String estado = extras.getString("estado");
        TextView textViewEstado = (TextView) findViewById(R.id.estadoDetalle);
        textViewEstado.setText(estado);

        Integer imgId = extras.getInt("imgId");
        ImageView imgView = (ImageView) findViewById(R.id.imgDetalle);
        imgView.setImageResource(imgId);
    }
}
