package oopj;
class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message){
        super(message);
    }
}
public class Exception_DivByZero{
    public static void main(String[]args){
        int numerator=10;
        int denominator=0;
        try{
            if(denominator==0){
                throw new
                    DivisionByZeroException("Division by zero is not allowed");
            }
            int reminder=10%0;
            System.out.println("result of modulus:"+reminder);
            int result=numerator/denominator;
            System.out.println("result of division:"+result);
        }
        catch(DivisionByZeroException e){
            System.out.println("Error:"+e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("Error:Division By Zero occured");
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}
