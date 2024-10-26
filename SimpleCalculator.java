package oopj.java;
import java.util.Scanner;
public class SimpleCalculator{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter first number:");
        double num1=scanner.nextDouble();
        System.out.print("enter second number:");
        double num2=scanner.nextDouble();
        System.out.println("select operation:");
        System.out.println("1.Sum");
        System.out.println("2.Difference");
        System.out.println("3.Product");
        System.out.println("4.Division");
        System.out.println("5.Quotient");
        System.out.println("6.Reminder");
        System.out.println("7.Exponential");
        int choice=scanner.nextInt();
        double result; switch(choice){
            case 1:
                result=num1+num2;
                System.out.println("Sum:"+result);
                break;
            case 2:
                result=num1-num2;
                System.out.println("Difference:"+result);
                break;
            case 3:
                result=num1*num2;
                System.out.println("Product:"+result);
                break;
            case 4:
                if(num2!=0){
                result=num1/num2;
                System.out.println("Division:"+result);}
                else{
                    System.out.println("error:Division by zero");}
                break;
            case 5:
                if(num2!=0){
                result=(int)num1/(int)num2;
                System.out.println("Quotient:"+result);}
                else{
                    System.out.println("error:Division by zero");}
                break;
            case 6:
                if(num2!=0){
                    result=(int)num1%(int)num2;
                    System.out.println("Reminder:"+(int)result);}
                else{
                    System.out.println("error:Division by zero");}
                    break;
            case 7:
                result=Math.pow(num1,num2);
                System.out.println("Exponential:"+result);
                break;
            default:
                System.out.println("invalid choice");}
        scanner.close();}}