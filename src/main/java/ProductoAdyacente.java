
public class ProductoAdyacente {

    //========== MAIN ==========
    public static void main(String[] args) {
        pruebaMetodo();
    }



    //========== PRODUCTO ADYACENTES ==========
    public static void productoAdyacentes(){
        int[] arreglo           = Metodos.crearArreglo();
        Metodos.llenarArreglo(arreglo);
        Metodos.mostrar(arreglo);
        int primerMayor         = Metodos.primerMayor(arreglo);
        int segundoMayor        = Metodos.segundoMayor(arreglo);
        Metodos.producto(primerMayor,segundoMayor);
    }


    //========= PROBAR METODO ==========
    public static void pruebaMetodo(){
        int[] arreglo       = {1, -4, 2, 2, 5, -1};
        Metodos.mostrar(arreglo);
        int primerMayor     = Metodos.primerMayor(arreglo);
        int segundoMayor    = Metodos.segundoMayor(arreglo);
        Metodos.producto(primerMayor, segundoMayor);
    }
}

