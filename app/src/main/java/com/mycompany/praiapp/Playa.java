package com.mycompany.praiapp;

/**
 * Created by pulpo on 08/01/16.
 */

//Clase Playa, version 2: nombre, estado y foto.

public class Playa {

    private String nombre;
    private String estado;
    private int imgId;

    public Playa(String nombre, String estado, int imgId) {
        this.nombre = nombre;
        this.estado = estado;
        this.imgId = imgId;    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public int getImgId() { return imgId; }

}