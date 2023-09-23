
public class ProductoAdyacente {

    //========== MAIN ==========
    public static void main(String[] args) {
        productoAdyacentes();
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
}
// integer min value
