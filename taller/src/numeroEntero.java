import java.util.Scanner;

public class numeroEntero {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite un numero entero:");

        int numero = teclado.nextInt();

        System.out.println("El numero que ingresaste es: " + numero);

    }
}