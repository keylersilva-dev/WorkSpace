public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // Registrar usuarios
        Usuario u1 = new Usuario("keyler silva", "123");
        biblioteca.registrarUsuario(u1);

        // Agregar libros
        Libro l1 = new Libro("programacion", "julanito", 2020, "111");
        Libro l2 = new Libro("POO en Java", "pepito perex", 2021, "222");

        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);

        // Mostrar libros disponibles
        System.out.println("Libros disponibles:");
        biblioteca.mostrarLibrosDisponibles();

        // Realizar préstamo
        System.out.println("\n keyler solicita préstamo:");
        u1.solicitarPrestamo(l1);

        // Intentar prestar el mismo libro otra vez
        System.out.println("\nIntentar prestar el mismo libro:");
        u1.solicitarPrestamo(l1);

        // Mostrar disponibles después del préstamo
        System.out.println("\nLibros disponibles ahora:");
        biblioteca.mostrarLibrosDisponibles();

        // Devolver libro
        System.out.println("\nDevolviendo libro:");
        u1.devolverLibro(l1);

        // Mostrar disponibles otra vez
        System.out.println("\nLibros disponibles después de devolver:");
        biblioteca.mostrarLibrosDisponibles();
    }
}