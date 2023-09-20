
import java.util.Random;

public class Metodos {
    public static void main(String[] args) {

    }
    //========== CREAR ARREGLO ==========
    public static int[] crearArreglo(){
        Random random   = new Random();

            // "+2" para que escoga un valor random entre 2 y 20
        int Largo       = random.nextInt(19) + 2;
        int[] arreglo   = new int[Largo];
        return arreglo;
    }



    //========== MOSTRAR ARREGLO ==========
    public static void mostrar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
// integer min value
