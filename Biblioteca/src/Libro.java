public class Libro{


    private String titulo;
    private String autor;
    private int anio;
    private String isbn;
    private boolean disponible;


    public Libro(String titulo,String autor,int anio, String isbn){

        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.isbn = isbn;
        this.disponible = true;
}


public boolean prestar(){

    if (disponible){

     disponible = false;
     return true;
    }
    return true;
}

    public void devolver(){

        disponible = true;
}
    public boolean isDisponible() {
        return disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + (disponible ? "Disponible" : "Prestado") + ")";
    }


}