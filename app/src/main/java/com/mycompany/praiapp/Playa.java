package com.mycompany.praiapp;

/**
 * Created by pulpo on 08/01/16.
 */

//Clase Playa, version 1: un solo campo, el nombre, que es lo que vamos a mostrar en la lista

public class Playa {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}





/*
public class Playa {

    private String nombre;
    private int fotoId;
    private int playaId;

    public Playa(String nombre, int fotoId, int playaId) {
        this.nombre = nombre;
        this.fotoId = fotoId;
        this.playaId = playaId;    }

    public String getNombre() {
        return nombre;
    }

    public int getFotoId() {
        return fotoId;
    }

    public int getPlayaId() {
        return playaId;
    }
}
*/