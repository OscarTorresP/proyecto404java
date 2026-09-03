import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int op = -1;
        while (op != 0) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("=== SISTEMA DUOC ===");
            System.out.println("1. Mostrar estado");
            System.out.println("2. Procesar operación");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            op = teclado.nextInt();

            if (op == 1) {
                System.out.println("Mostrando Estado.");
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