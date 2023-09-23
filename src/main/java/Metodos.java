
import java.util.Random;

public class Metodos {

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


    //========== PRIMER MAYOR ==========
    public static int primerMayor(int[] arreglo){
        int primerMayor         = arreglo[0];

        for (int i = 0; i < arreglo.length ; i++) {
            if (arreglo[i] > primerMayor){
                primerMayor     = arreglo[i];
            }
        }
        return primerMayor;
    }


    //========= SEGUNDO MAYOR =========
    public static int segundoMayor(int[] arreglo){
        int mayor           = arreglo[0];
        int segundoMayor    = Integer.MIN_VALUE;

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                segundoMayor = mayor;
                mayor = arreglo[i];

            } else if (arreglo[i] > segundoMayor) {
                segundoMayor = arreglo[i];

            }
        }
        return segundoMayor;
    }


    //========== PRODUCTO ADYACENTE ==========
    public static void producto(int primerMayor,int segundoMayor){
        int resultado = primerMayor * segundoMayor;
        System.out.println(" El numero adyacente del arreglo es : " + resultado);
    }
}

