import java.util.Scanner;

public class decimal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero decimal:");

        double numero = teclado.nextDouble();

        if (numero > 10) {
            System.out.println("El numero es mayor que 10");
        } else if (numero < 10) {
            System.out.println("El numero es menor que 10");
        } else {
            System.out.println("El numero es igual a 10");
        }

    }
}