package dominio;

public class Juego {

   public String nombre;
    public String calidad;
    public String estilo;
    public String acceso;
    public  double version = 1.0;
    public static final String Fabricante = "Midway Games" ;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public Juego() {


    }
}
