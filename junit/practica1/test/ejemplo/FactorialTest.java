package ejemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("calculo factorial satisfactorio")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FactorialTest {

    @DisplayName("respuesta satisfactoria")
    @ParameterizedTest
    @CsvSource(value={"4,24","9,362880","11,39916800"})
    void test1(int numero, int factorial){
        Assertions.assertEquals(factorial,Factorial.calculaFactorial(numero));
    }




}