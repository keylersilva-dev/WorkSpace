package ejecucion;

import dominio.Dificultad;
import dominio.Juego;
import dominio.Personaje;
import dominio.tipoJuego;

public class Principal {

    public static void main(String[] args){

        //System.out.println("App de video juegos");
        Dificultad dificultad = new Dificultad();
        Juego juego = new Juego();
        Personaje Personaje = new Personaje();
        tipoJuego TipoJuego = new tipoJuego();

        Personaje objPersonaje = new Personaje();
        objPersonaje.leerDatos();
        objPersonaje.escribirDatos();
    }



}