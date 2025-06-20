package ejemplo;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Factorial {

    public static  int calculaFactorial(int numero){
        int factorial=1;


            for (int i = 1;i<=numero;i++) {
                factorial = factorial * i;
            }
                return factorial;

            }

    public static NumeroPrimo getValidationAndFactors (long number){
        List<Long> divisores = new ArrayList<>();
        for (int i=1;i<=number;i++){
            if(number % i==0){
                divisores.add(new Long(i));
            }
        }
        return new NumeroPrimo(number, divisores, divisores.size()>2 ? false:true);
    }
}
