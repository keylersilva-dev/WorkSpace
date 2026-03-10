package servicios;

public class Servicios {

    public double obtenerPrecio(String tipoServicio){
        switch (tipoServicio.toLowerCase()){

            case "consulta": return 30000;
            case "vacunacion": return 45000;
            case "baño": return 20000;
            default: return 0.0;
        }
    }
}
