package facturacion;
import animales.Mascotas;

public class Factura {
public void generarRecibo(Mascotas mascota, String servicio, double costo){
    System.out.println("Factura");
    System.out.println("Mascota: "+ mascota.getNombre() + " (" + mascota.getEspecie() + ")  " + "Años  " + mascota.getEdad() );
    System.out.println("Servicio realizado: " + servicio );
    System.out.println("Total a pagar: $ " + costo);

}

}