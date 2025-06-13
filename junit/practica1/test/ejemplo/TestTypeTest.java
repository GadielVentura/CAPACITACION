package ejemplo;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(Lifecycle.PER_CLASS)
public class TestTypeTest {
    @Test
    void test(){
        System.out.println("ejecucion test");
    }
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4})
    void parametrizedTest1(int value){
        System.out.println("valor del parametro: "+value);
    }
    @ParameterizedTest
    @CsvSource({"CDMX,1","Edo Mex,2","Hidalgo,3", "Puebla,4"})
    void parametrizedTest2(String city, int value){
        System.out.println("id: "+value+" ciudad: " +city);
    }

    @RepeatedTest(value=3)
    void repeatedTest(){
        System.out.println("Ejecucion test repetible");
        
    }
}
