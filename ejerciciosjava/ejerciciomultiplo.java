//Comprueba si un número es múltiplo de 3 y no es múltiplo de 5. 
import java.util.Scanner;
public class ejerciciomultiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para comprobar si es múltiplo de 3 y no es múltiplo de 5: ");
        int numero = scanner.nextInt();

        boolean multiplotres = false;
        boolean multiplocinco = false;

        if (numero % 3 == 0) {
            multiplotres = true;
        }

        if (numero % 5 == 0) {
            multiplocinco = true;
        }

        if (multiplotres && !multiplocinco) {
            System.out.println(numero + " es múltiplo de 3 y no es múltiplo de 5.");
        } else {
            System.out.println(numero + " no cumple con las condiciones, ingrese otro número.");
        }
    }
}