
public class ProductoAdyacente {

    //========== MAIN ==========
    public static void main(String[] args) {
        productoAdyacentes();
        pruebaMetodo();
    }


    //========== PRODUCTO ADYACENTES ==========
    public static void productoAdyacentes() {
        try {
            System.out.println(" ---------- CASOS ALEATORIOS ---------- ");
            int[] arreglo       = Metodos.crearArreglo();
            Metodos.llenarArreglo(arreglo);
            Metodos.mostrar(arreglo);
            int primerMayor     = Metodos.primerMayor(arreglo);
            int segundoMayor    = Metodos.segundoMayor(arreglo);
            Metodos.producto(primerMayor, segundoMayor);

        } catch (IllegalArgumentException e) {
            System.err.println(" Hubo un error: " + e.getMessage());
        }
    }

    //========= PROBAR METODO ==========
    public static void pruebaMetodo () {
        System.out.println("\n ---------- CASO PRUEBA ---------- ");
        int[] arreglo           = {1, -4, 2, 2, 5, -1};
        Metodos.mostrar(arreglo);
        int primerMayor         = Metodos.primerMayor(arreglo);
        int segundoMayor        = Metodos.segundoMayor(arreglo);
        Metodos.producto(primerMayor, segundoMayor);
    }
}

