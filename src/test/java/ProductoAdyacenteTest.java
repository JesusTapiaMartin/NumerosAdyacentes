import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoAdyacenteTest {

    @Test
    public void testValoresPositivos() {
        int[] arreglo               = {2, 4, 6, 8};
        int primerMayor             = Metodos.primerMayor(arreglo);
        int segundoMayor            = Metodos.segundoMayor(arreglo);
        int resultado               = primerMayor * segundoMayor;
        assertEquals(48, resultado);
    }

    @Test
    public void testValoresNegativos() {
        int[] arregloNegativo       = {-3, -5, -7, -9};
        int primerMayorNegativo     = Metodos.primerMayor(arregloNegativo);
        int segundoMayorNegativo    = Metodos.segundoMayor(arregloNegativo);
        int resultadoNegativo       = primerMayorNegativo * segundoMayorNegativo;
        assertEquals(15, resultadoNegativo);
    }

    @Test
    public void testValoresMixtos() {
        int[] arregloMixto          = {-2, 5, -6, 8};
        int primerMayorMixto        = Metodos.primerMayor(arregloMixto);
        int segundoMayorMixto       = Metodos.segundoMayor(arregloMixto);
        int resultadoMixto          = primerMayorMixto * segundoMayorMixto;
        assertEquals(40, resultadoMixto);
    }

    @Test
    public void testMayoresIguales() {
        int[] arregloIgual          = {10, 10, 5, 8};
        int primerMayorIgual        = Metodos.primerMayor(arregloIgual);
        int segundoMayorIgual       = Metodos.segundoMayor(arregloIgual);
        int resultadoIgual          = primerMayorIgual * segundoMayorIgual;
        assertEquals(100, resultadoIgual);
    }

    @Test
    public void testMayorCero() {
        int[] arregloCero           = {0, -5, -3, 8};
        int primerMayorCero         = Metodos.primerMayor(arregloCero);
        int segundoMayorCero        = Metodos.segundoMayor(arregloCero);
        int resultadoCero           = primerMayorCero * segundoMayorCero;
        assertEquals(0, resultadoCero);
    }
}
