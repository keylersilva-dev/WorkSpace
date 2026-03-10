import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        libros = new ArrayList<>();


        usuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {



        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Libro buscarPorTitulo(String titulo) {


        for (Libro l : libros) {

            if (l.getTitulo().equalsIgnoreCase(titulo)) {

                return l;

            }
        }
        return null;
    }

    public void mostrarLibrosDisponibles() {
        for (Libro l : libros) {

            if (l.isDisponible()) {

                System.out.println(l);
            }
        }
    }
}