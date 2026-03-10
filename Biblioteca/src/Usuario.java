import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private String identificacion;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, String identificacion) {
        this.nombre = nombre;


        this.identificacion = identificacion;



        this.librosPrestados = new ArrayList<>();
    }

    public boolean solicitarPrestamo(Libro libro) {



        if (librosPrestados.size() >= 3) {



            System.out.println("No puede tener más de 3 libros.");


            return false;


        }

        if (libro.prestar()) {
            librosPrestados.add(libro);




            System.out.println("Libro prestado correctamente.");
            return true;
        } else {


            System.out.println("El libro no está disponible.");
            return false;


        }
    }




    public void devolverLibro(Libro libro) {



        if (librosPrestados.remove(libro)) {

            libro.devolver();


            System.out.println("Libro devuelto correctamente.");
        }
    }





    public String getNombre() {
        return nombre;
    }
}