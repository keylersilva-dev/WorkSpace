public class Operador {

    private String nombreOperador;

    public Operador(String nombreOperador) {
        this.nombreOperador = nombreOperador;
    }

    public void mostrarOperador() {

        System.out.println("Operador: " + nombreOperador);
    }
}