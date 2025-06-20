package ejemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    @DisplayName("numero primo satisfactorio")
    @ParameterizedTest
    @CsvSource(value =
            {"7-true-1,7",
             "9-false-1,3,9",
            "11-true-1,11"},delimiterString = "-")
    void test2(long num, boolean esPrimoEsperado, String divisores){
        List<Long> divisoresEsperados= Arrays.stream(divisores.split(",")).map(Long::parseLong).collect(Collectors.toList());

        NumeroPrimo numeroPrimo = Factorial.getValidationAndFactors(num);

        Assertions.assertAll(
                ()->Assertions.assertIterableEquals(divisoresEsperados,numeroPrimo.getDivisores()),
                ()->Assertions.assertEquals(esPrimoEsperado, numeroPrimo.isPrimo())
        );

    }




}