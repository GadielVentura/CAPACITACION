package ejemplo;

public class Factorial {

    public static  int calculaFactorial(int numero){
        int factorial=1;


            for (int i = 1;i<=numero;i++) {
                factorial = factorial * i;
            }
                return factorial;

            }
}
