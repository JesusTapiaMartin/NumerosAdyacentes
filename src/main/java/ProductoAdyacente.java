
import java.util.Random;

public class ProductoAdyacente {


    //========== MAIN ==========
    public static void main(String[] args) {
        int[] arreglo = crearArreglo();
        llenarArreglo(arreglo);
        mostrar(arreglo);

    }


    //========== CREAR ARREGLO ==========
    public static int[] crearArreglo(){
        Random random   = new Random();
        // "+2" para que escoga un valor random entre 2 y 20
        int Largo       = random.nextInt(19) + 2;
        int[] arreglo   = new int[Largo];
        return arreglo;
    }


    //========== LLENAR ARREGLO ==========
    public static void llenarArreglo(int[] arreglo){
        Random random = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(2001) - 1000;
        };
    }


    //========== MOSTRAR ARREGLO ==========
    public static void mostrar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ",");
        }
    }
}
// integer min value
