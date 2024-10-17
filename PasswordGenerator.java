import java.util.Random;
public class PasswordGenerator{
public static void genPwd(int size){
String upper= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String lower= "abcdefghijklmnopqrstuvwxyz";
String digits = "0123456789";
String all=upper+lower+digits;
String s1="";
Random rand1=new Random();
int r1=0;
r1=rand1.nextInt(25);
s1=s1+upper.substring(r1,r1+1);
r1=rand1.nextInt(25);
s1=s1+lower.substring(r1,r1+1);
r1=rand1.nextInt(9);
s1=s1+digits.substring(r1,r1+1);
for(int i=0;i<size-3;i++){
r1=rand1.nextInt(61);
s1=s1+all.substring(r1,r1+1);}
System.out.println(s1);
}
public static void main(String[]args){
for(int i=0;i<20;i++){
genPwd(15);}
}
}


