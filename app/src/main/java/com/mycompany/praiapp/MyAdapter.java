package com.mycompany.praiapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pulpo on 07/02/16.
 */
public class MyAdapter extends BaseAdapter {

    private ArrayList<Playa> playas;
    private Context context;

    public MyAdapter(Context context, ArrayList<Playa> playas){
        this.playas = playas;
        this.context = context;
    }

    //Ncesitamos este metodo para que el adapter cuente la cant de elem a mostrar.
    @Override
    public int getCount() {

        return playas.size();
    }

    @Override
    public Playa getItem(int position) {

        return playas.get(position);
    }

    /*
    Este metodo hay que implementarlo porque la clase es absracta.
    Android studio lo hace solo con alt + enter sobre la declaracion de la clase.
    */
    @Override
    public long getItemId(int position) {

        return 1;
    }

    //getView es el metodo principal. Es el que nos devuelve una vista armada.

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Inflamos el XML
        View playaView = LayoutInflater.from(context)
                .inflate(R.layout.list_item, parent, false);

        //Obteneos la posicion de un objeto en la lista
        Playa playa = getItem(position);

        //Insertamos los datos del ArrayLis en la vista

        ImageView imgView = (ImageView) playaView.findViewById(R.id.img);
        imgView.setImageResource(playa.getImgId());

        TextView nombreView = (TextView) playaView.findViewById(R.id.nombre);
        nombreView.setText(playa.getNombre());

        TextView estadoView = (TextView) playaView.findViewById(R.id.estado);
        estadoView.setText(playa.getEstado());

        return playaView;
    }
}
