 //Comprueba si un número es mayor que 10 y menor que 20.
import java.util.Scanner;
public class mayormenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero >= 10 && numero <= 20) {
            System.out.println(numero + " es igual o mayor que 10 o menor o igual a 20.");
        } else {
            System.out.println(numero + " el número no cumple con la función, ingrese otro número");
        } 
    }
}
