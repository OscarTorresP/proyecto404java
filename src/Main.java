import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese carrera: ");
        String carrera = teclado.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = teclado.nextInt();
        Estudiante estudiante = new Estudiante(
                nombre,
                carrera,
                edad
        );
        estudiante.mostrarInformacion();


    }
}