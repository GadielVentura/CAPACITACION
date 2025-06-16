package ejemplo;

public class Util {

    public static double addition(String num1, String num2) {
        double result = 0;
        try {
            result = Double.parseDouble(num1) + Double.parseDouble(num2);
        } catch (NumberFormatException ex) {
            System.out.println("error en formato numerico: " + ex.getMessage());
            throw ex;
        } catch (Exception ex) {
            System.out.println("error en la suma " + ex.getMessage());
            throw ex;
        }
        return result;

    }

    public static double subtraction(String num1, String num2){
        double result=0;
        try{
            result=Double.parseDouble(num1)-Double.parseDouble(num2);
        } catch (NumberFormatException ex){
            System.out.println("error en formato numerico "+ex.getMessage());
            throw ex;
        } catch (Exception ex){
            System.out.println("error en la suma "+ex.getMessage());
            throw ex;
        }
        return result;
    }

    public static double multiplica(String num1, String num2){
        double result=0;
        try{
            result=Double.parseDouble(num1)*Double.parseDouble(num2);
        } catch (NumberFormatException ex){
            System.out.println("error en formato numerico "+ex.getMessage());
            throw ex;
        } catch (Exception ex){
            System.out.println("error en la suma "+ex.getMessage());
            throw ex;
        }
        return result;
    }

    public static double divide(String num1, String num2){
        double result=0;
        try{
            result=Double.parseDouble(num1)/Double.parseDouble(num2);
        } catch (NumberFormatException ex){
            System.out.println("error en formato numerico "+ex.getMessage());
            throw ex;
        } catch (Exception ex){
            System.out.println("error en la suma "+ex.getMessage());
            throw ex;
        }
        return result;
    }

}
