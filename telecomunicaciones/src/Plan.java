public class Plan {

    private String nombre;
    private double precio;
    private int datosGB;

    public Plan(String nombre, double precio, int datosGB) {
        this.nombre = nombre;
        this.precio = precio;
        this.datosGB = datosGB;
    }

    public void mostrarPlan() {
        System.out.println("Plan: " + nombre);

        System.out.println("Precio: $" + precio);
        System.out.println("Datos: " + datosGB + "GB");
    }

    public String getNombre() {


        return nombre;
    }
}