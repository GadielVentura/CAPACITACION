package ejemplo;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

@TestInstance(Lifecycle.PER_CLASS)
public class LifeCyclePerClass {
    private int counter=0;

    @BeforeAll
    static void test1(){
        System.out.println("antes de todos los test, solo una vez");
    }
    @BeforeEach
    void test2(){
        System.out.println("antes de cada test, tantas veces como test");
    }
    @Test
    void test3(){
        counter++;
        System.out.println("test 1, valor de contador: "+counter);


    }
    @Test
    void test4(){
        counter++;
        System.out.println("segundo test, valor de contador: "+counter);
    }
    @Test
    void test5(){
        counter++;
        System.out.println("test 3, valor de contador: " +counter);
    }
    @AfterEach
    void test6(){
        System.out.println("despues de cada test, tantas veces como test");
    }
    @AfterAll
    static void test7(){
        System.out.println("despues de todos los test, una sola vez");
    }
}
