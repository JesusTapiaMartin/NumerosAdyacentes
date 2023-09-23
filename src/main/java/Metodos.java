
import java.util.Random;

public class Metodos {


    //========== MAIN ==========
    public static void main(String[] args) {

    }


    //========== CREAR ARREGLO ==========
    public static int[] crearArreglo(){
        Random random   = new Random();

            // "+2" para escoger valores randoms entre 2 y 20
        int Largo       = random.nextInt(19) + 2;
        int[] arreglo   = new int[Largo];
        return arreglo;
    }


    //========== LLENAR ARREGLO ==========
    public static void llenarArreglo(int[] arreglo){
        Random random = new Random();

            // "-1000" para escoger valores randoms entre 1000 y -1000
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
//        int[] arreglo = crearArreglo();
//        llenarArreglo(arreglo);
//        mostrar(arreglo);
