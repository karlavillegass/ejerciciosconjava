//Verifica si un número es primo y menor que 100.
import java.util.Scanner;
public class Comprobarprimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para verificar si es u número primo y menor que 100: ");
        int numero = scanner.nextInt();

        boolean nprimo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                nprimo = false;
            }
        }
        if (nprimo && numero < 100) {
            System.out.println("El número " + numero + " es primo y es menor que 100.");
        } else {
            System.out.println("El número " + numero + " no es primo o es mayor o igual que 100, ingrese otro número.");
        }
    }
}