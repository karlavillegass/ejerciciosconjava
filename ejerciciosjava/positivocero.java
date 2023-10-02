 //Comprueba si un número es positivo y no es igual cero.
import java.util.Scanner;
public class positivocero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println(numero + " es un número positivo.");
        } else if (numero == 0) {
            System.out.println(numero + " es cero, ingrese otro número.");
        } else {
            System.out.println(numero + " es un número negativo, ingrese otro número.");
        }
    }

}
