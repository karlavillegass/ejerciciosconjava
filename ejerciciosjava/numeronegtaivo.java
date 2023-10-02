 //Comprueba si un número es negativo o si es cero. 
import java.util.Scanner;
public class numeronegtaivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println(numero + " es un número negativo.");
        } else if (numero == 0) {
            System.out.println(numero + " es cero.");
        } else {
            System.out.println(numero + " no cumple con lo solicitado, ingrese otro número.");
        }
    }

}
