package ejemplo;

import java.util.List;

public class NumeroPrimo {
    private long number;
    private List<Long> divisores;
    private boolean isPrimo;

    public NumeroPrimo(){
        super();
    }
    public NumeroPrimo(long number, List<Long> divisores,boolean isPrimo){
        super();
        this.number = number;
        this.divisores= divisores;
        this.isPrimo=isPrimo;
    }

    public long getNumber(){
        return number;
    }

    public void setNumber(long number){
        this.number=number;
    }

    public List<Long> getDivisores(){
        return divisores;
    }
    public void setDivisores(List<Long>divisores){
        this.divisores=divisores;
    }

    public boolean isPrimo(){
        return isPrimo;
    }
    public void setEsPrimo(boolean isEsPrimo){
        this.isPrimo=isEsPrimo;
    }
}
