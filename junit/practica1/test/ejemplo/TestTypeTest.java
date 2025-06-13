package ejemplo;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

@DisplayName("tipos test-anotaciones junit")
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TestTypeTest {

    @Order(4)
    @DisplayName("test simple")
    @Test
    void test(){
        System.out.println("ejecucion test");
    }

    @Order(2)
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4})
    void parametrizedTest1(int value){
        System.out.println("valor del parametro: "+value);
    }

    @Order(1)
    @ParameterizedTest
    @CsvSource({"CDMX,1","Edo Mex,2","Hidalgo,3", "Puebla,4"})
    void parametrizedTest2(String city, int value){
        System.out.println("id: "+value+" ciudad: " +city);
    }

    @Order(3)
    @RepeatedTest(value=3)
    void repeatedTest(){
        System.out.println("Ejecucion test repetible");

    }

    @Disabled
    @Test
    void test2(){
        System.out.println("ejecucion test2 ");
    }

    @Test
    @Timeout(unit = TimeUnit.SECONDS, value=3)
    void test3() throws InterruptedException{

        System.out.println("inicia metodo con limite de tiempo");
        Thread.sleep(2000);
        System.out.println("final del metodo con limite de tiempo");
    }
}
