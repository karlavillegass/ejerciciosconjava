 //Determina si una cadena de texto contiene la letra "a" y la letra "b".
import java.util.Scanner;
public class letraayb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto para corroborar si contiene la letra 'a' y la letra 'b': ");
        String text = scanner.nextLine();

        boolean letraA = text.contains("a");
        boolean letraB = text.contains("b");

        if (letraA && letraB) {
            System.out.println("La cadena de texto contiene la letra 'a' y 'b'.");
        } else {
            System.out.println("La cadena de texto no contiene la letra 'a' y 'b'.");
        }
    }
}