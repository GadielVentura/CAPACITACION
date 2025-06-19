package ejemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Assertions and fails")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UtilTest {

    @DisplayName("Test de suma satisfactorio")
    @ParameterizedTest
    @CsvSource(value= {"1,2,3","3,5,8", "12,32,44"})
    void additionTest(String num1, String num2, Double result){
        Assertions.assertEquals(result, Util.addition(num1,num2));
    }

    @DisplayName("Test de suma satisfactorio, error de formato")
    @ParameterizedTest
    @CsvSource(value = {"A,2","e,3","2,H"})
    void additionTest2(String num1,String num2){
       Assertions.assertThrows(NumberFormatException.class,()->Util.addition(num1,num2));

    }

    @DisplayName("Test suma, escenario satisfactorio, error general")
    @ParameterizedTest
    @CsvSource(value = {"null,null",","})
    void additionTest3(String num1,String num2){
        Assertions.assertThrows(RuntimeException.class,()->Util.addition(num1,num2));
    }

    @DisplayName("escenario satisfactorio resta")
    @ParameterizedTest
    @CsvSource(value={"5,2,3","20,10,10","55,32,23"})
    void restaTest1(String num1,String num2, Double resultado){
        Assertions.assertEquals(resultado,Util.subtraction(num1,num2));
    }

    @DisplayName("error de formato, resta")
    @ParameterizedTest
    @CsvSource(value = {"E,5","8,H"})
    void  restaTest2(String num1,String num2){
        Assertions.assertThrows(NumberFormatException.class,()->Util.subtraction(num1,num2));

    }

    @DisplayName("error general, resta")
    @ParameterizedTest
    @CsvSource(value = {"null,null",","})
    void restaTest3(String num1,String num2){
        Assertions.assertThrows(RuntimeException.class,()->Util.subtraction(num1,num2));
    }
}