//Verifica si un número es par o si es múltiplo de 5. 
import java.util.Scanner;
public class ejerciciopar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para comprobar si es u número par o es múltiplo de 5: ");
        int numero = scanner.nextInt();

        boolean numeropar = false;
        boolean multiplocinco = false;
        if (numero % 2 == 0) {
            numeropar = true;
        }
        if (numero % 5 == 0) {
            multiplocinco = true;
        }
        if (numeropar) {
            System.out.println( numero + " es un número par.");
        } else {
            System.out.println( numero + " no es un número par.");
        }
        if (multiplocinco) {
            System.out.println( numero + " es múltiplo de 5.");
        } else {
            System.out.println( numero + " no es múltiplo de 5.");
        }
    }
}