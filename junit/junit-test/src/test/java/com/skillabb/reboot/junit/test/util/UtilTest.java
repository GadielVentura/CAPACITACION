package com.skillabb.reboot.junit.test.util;

import com.skillabb.reboot.junit.test.model.PrimeNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;;import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@DisplayName("Util test Class.")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UtilTest {

    @DisplayName("Escenario de exito, numero primo")
    @ParameterizedTest
    @CsvSource(value = {"7-true-17","8-false-1248","5-true-15"},delimiterString = "-")
    void test1(int number, boolean isPrime, String divisores){

        List<Integer> divisoresEsperados= Arrays.stream(divisores.split("")).map(Integer::parseInt).collect(Collectors.toList());

        PrimeNumber numeroPrimo = Util.getNumber(number);

        Assertions.assertAll(
                ()->Assertions.assertIterableEquals(divisoresEsperados,numeroPrimo.getDividers()),
                ()->Assertions.assertEquals(isPrime,numeroPrimo.isPrime())
        );

    }

    @DisplayName("Escenario satisfactorio, Fibonacci")
    @Test
    void test2(){

        Assertions.assertEquals(5,Util.getFibonacciNumber(5));
        System.out.println("\t");
        Assertions.assertEquals(34,Util.getFibonacciNumber(9));
        System.out.println("\t");
        Assertions.assertEquals(1,Util.getFibonacciNumber(1));

    }

    @DisplayName("Escenario satisfactorio, convertir valor a base")
    @ParameterizedTest
    @CsvSource(value = {"3,O,3","7,B,111","14,H,e","5,F,5"})
    void test3(int number, char caracter, String valor){
        Assertions.assertEquals(valor,Util.convertDecimalToBaseX(number,caracter));
    }

    @DisplayName("Escenario satisfacrotio, palabra invertida")
    @ParameterizedTest
    @CsvSource(value = {"mariposa,asopiram","urgente,etnegru"})
    void test4(String palabra, String reversa){
        Assertions.assertEquals(reversa,Util.reverseString(palabra));
    }

    @DisplayName("Escenario satisfactorio, palindromo")
    @ParameterizedTest
    @CsvSource(value = {"oso,true","salas,true","anita,false"})
    void test5(String palabra,boolean esPalindromo){
        Assertions.assertEquals(esPalindromo,Util.isPalindrome(palabra));
    }

    @DisplayName("Escenario satisfactorio, ordena un arreglo")
    @ParameterizedTest
    @CsvSource(value = {"r,d,t,e,n-false-d,e,n,r,t",
            "MANZANA,PERA,NARANJA-true-PERA,NARANJA,MANZANA"},delimiterString = "-")
    void test6(String Array, boolean reversa,String arrayOrdenado){

        String delimitador = ",";
        String[] partes = Array.split(delimitador);
        String[] partes2= arrayOrdenado.split(delimitador);
        List<String> lista = new ArrayList<>(Arrays.asList(partes));
        List<String> lista2=new ArrayList<>(Arrays.asList(partes2));
        Assertions.assertEquals(lista2,Util.arraySorted(lista,reversa));


    }

}
