package animales;

public class Mascotas {

    private String nombre;
    private String especie;
    private int edad;


    public Mascotas(String nombre, String especie, int edad ){

        this.nombre = nombre ;
        this.especie = especie ;
        this.edad = edad ;

    }

    public String getNombre() { return nombre;}
    public String getEspecie() { return especie;}
    public int getEdad() { return edad;}

}
