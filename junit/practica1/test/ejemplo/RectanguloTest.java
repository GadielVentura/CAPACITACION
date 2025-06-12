package ejemplo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;


class RectanguloTest {
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
        Rectangulo r= new Rectangulo(3,4);
        assertAll(
                ()->assertEquals(12,r.area()),
                ()->assertEquals(14,r.perimetro())
        );
    System.out.println("primer test");


}
@Test
void test4(){
    System.out.println("segundo test");
}
@AfterEach
void test5(){
    System.out.println("despues de cada test, tantas veces como test");
}
@AfterAll
static void test6(){
    System.out.println("despues de todos los test, una sola vez");
}

}