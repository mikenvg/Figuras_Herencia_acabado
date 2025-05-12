import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gestor gestor = new Gestor();
        Scanner sc = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("=== GESTOR DE TIENDA ===");
            System.out.println("01. Registrar tiendas");
            System.out.println("02. Registrar trabajadores");
            System.out.println("03. Registrar productos");
            System.out.println("04. Información de las tiendas");
            System.out.println("05. Información de los trabajadores");
            System.out.println("06. Mostrar los productos disponibles");
            System.out.println("07. Últimos 3 productos añadidos");
            System.out.println("08. Comprar productos");
            System.out.println("09. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("=== Registrar Tiendas ===");
                    break;

                case 2:
                    System.out.println("=== Registrar Trabajadores ===");
                    break;

                case 3:
                    System.out.println("=== Registrar productos ===");
                    break;

                case 4:
                    System.out.println("=== Mostrar información de las tiendas ===");
                    System.out.println("Pulse Enter para continuar...");
                    break;

                case 5:
                    System.out.println("=== Mostrar información de los trabajadores ===");
                    break;

                case 6:
                    System.out.println("=== Mostrar productos disponibles ===");
                    break;

                case 7:
                    System.out.println("=== Últimos 3 productos añadidos ===");
                    break;

                case 8:
                    System.out.println("=== Comprar productos ===");
                    break;

                case 9:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");

            }
        }
    }



}