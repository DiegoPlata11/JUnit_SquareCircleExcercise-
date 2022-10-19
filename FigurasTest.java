import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigurasTest {
    @Test

    public void calcularAreaCirculo_SeEsperaElCalculoCorrectoDeArea(){
    //GIVEN
        Figuras figura1 = new Figuras("circulo", 10);
        String resultadoEsperado = "El área del circulo es de 314.1592653589793 unidades";

    //WHEN
        String resultado = figura1.calcularArea();

    //THEN
        Assertions.assertEquals(resultadoEsperado, resultado);
    }
    @Test
    public void calcularAreaCuadrado_SeEsperaElCalculoCorrectoDeArea(){
    //GIVEN
        Figuras figura2 = new Figuras("cuadrado", 8);
        String resultadoEsperado = "El área del cuadrado es de 64.0 unidades";

    //WHEN
        String resultado = figura2.calcularArea();

    //THEN
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

}