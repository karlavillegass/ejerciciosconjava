//Verifica si una cadena de texto contiene la palabra "Java" y no contiene la palabra "Python". 
import java.util.Scanner;
public class palabras{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba su opinión sobre Java ");
        String opinion = scanner.nextLine();

        boolean contieneJava = opinion.contains("Java");
        boolean contienePython = opinion.contains("Python");

        if (contieneJava && !contienePython) {
            System.out.println("Usted hablo sobre Java, gracias :)");
        } else {
            System.out.println("Vuelva a ingresar otro comentario sobre Java ya que comento sobre Python.");
        }
    }

}