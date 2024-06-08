import java.util.Scanner;
import java.io.IOException;
public class Main {
  public static void main(String[] args) {
 System.out.println("podaj a");
    Scanner a = new Scanner(System.in);
float x = a.nextFloat();
    System.out.println("podaj b");
  Scanner b = new Scanner(System.in);
    float y = b.nextFloat();
    System.out.println("podaj C");
    Scanner c = new Scanner(System.in);
    float z = c.nextFloat();

    double delta = (y*y)-4*(x*z);
 if (delta<0){
   System.out.println("nie ma rozwiązania");
 }
   if (delta==0){
     float a0= (-y)/(2*x);
     System.out.println("jedna wartosc zerowa wynosi"+a0);
 }
    if(delta>0){
      double a1= (-y-Math.sqrt(delta))/(2*x);
      double a2= (-y+Math.sqrt(delta))/(2*x);
      System.out.println("dwa rozwiazania wynosza  "+a1+  "oraz" +a2);
    }
  }
}