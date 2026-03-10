import java.util.UUID;

public class Usuario {

    private UUID id;
    private String nombre;
    private String email;
    private long telefono;
    private Plan plan;

    public Usuario(String nombre, String email, long telefono, Plan plan) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.plan = plan;
    }

    public void mostrarDatos() {

        System.out.println("DATOS DEL USUARIO");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Telefono: " + telefono);

        System.out.println("Plan contratado:");


        plan.mostrarPlan();
    }
}