// Determina si un estudiante ha aprobado si su nota es mayor o igual a 60 y menor o igual a 100. 
import java.util.Scanner;
public class calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la calificación del estudiante: ");
        int calificacion = scanner.nextInt();

        if (calificacion >= 60 && calificacion <= 100) {
            System.out.println("Estudiante aprobado.");
        } else {
            System.out.println("Estudiante no aprobado.");
        }
    }
}
