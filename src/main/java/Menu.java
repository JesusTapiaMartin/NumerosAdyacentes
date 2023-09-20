import java.util.Scanner;

public class Menu {
    public static void interfazSME () {
        Scanner lector = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("========================================");
            System.out.println("                 Números                ");
            System.out.println("                adyacentes              ");
            System.out.println("========================================");
            System.out.println("        [1] Crear arreglo               ");
            System.out.println("        [2] Llenar arreglo              ");
            System.out.println("        [3] Verificar largos            ");
            System.out.println("        [4] Producto adyacente          ");
            System.out.println("        [5] Salir                       ");
            System.out.println("========================================");
            System.out.print("            Ingrese su opción  : ");
            opcion = lector.nextLine();
            System.out.println("========================================");

            switch (opcion) {
                case "1":
                    break;

                case "2":
                    break;

                case "3":
                    break;

                case "4":
                    break;

                case "5":
                    System.out.println("    Hata luego... ");

                default:
                    System.out.println("    Ingrese una opcion valida... ");
                        break;
            }
        } while (opcion.equals("5"));
    }
}