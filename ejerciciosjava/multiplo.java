 //Comprueba si un número es múltiplo de 3 y no es múltiplo de 5.
import java.util.Scanner;
public class multiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero % 3 == 0 && numero % 5 != 0) {
            System.out.println(numero + " es múltiplo de 3 y no es múltiplo de 5.");
        } else {
            System.out.println(numero + " no cumple con las condiciones, ingrese otro número.");
        }
    }
    
}

