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
        if (edad >= 18) {
            System.out.println("Acceso autorizado.");
            if (edad < 18) {
                System.out.println("Estudiante menor de edad.");
            } else if (edad < 25) {
                System.out.println("Estudiante joven.");
            } else {
                System.out.println("Acceso restringido.");
                System.out.println("Estudiante adulto.");
            }
        }
        for (int i=1;i<=5;i++ ){
            System.out.println("Contando al estudiante nro "+i);
        }
        int op = -1;
        while (op != 0) {
            System.out.println("=== SISTEMA DUOC ===");
            System.out.println("1. Mostrar estado");
            System.out.println("2. Procesar operación");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            op = teclado.nextInt();
            if (op == 1) {
                System.out.println("Mostrando Estado.");
                estudiante.mostrarInformacion();
            } else if (op == 2) {
                System.out.println("Procesando Informacion.");
            } else if (op== 0){
                System.out.println("Saliendo del Sistema.");
            } else {
                System.out.println("Ingrese una opcion valida");
            }

        }

    }
}