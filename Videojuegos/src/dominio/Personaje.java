package dominio;

import javax.management.loading.PrivateClassLoader;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Personaje {
    public String alias;
    public String habilidad; //
    public String armamento; //
    public int cantVidas;


    public void leerDatos(){
        Scanner tecla = new Scanner(System.in);
        System.out.println("LEER DATOS DE LOS PERSONAJES");


        System.out.println("ingrese el nombre del personaje");
        this.alias = tecla.nextLine();
        System.out.println(" ingrese la habilidad");
        this.habilidad = tecla.nextLine();
        System.out.println("ingrese el argumento");
        this.armamento = tecla.nextLine();
        System.out.println("ingrese la cantidad de vida");
        this.cantVidas = tecla.nextInt();

    }
    public void escribirDatos(){
        System.out.println("-- Personaje ::" +
                "- Alias: " + this.alias +
                "- habilidad: " + this.habilidad +
                "- Armamento: " + this.armamento +
                "- Cantidad de vidas: " + this.cantVidas
        );



}
}
