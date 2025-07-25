//Calculate square of any number using a function
//This code defines a function to calculate the square of a number and prints the result
import java.util.*;

public class Main {
  
    public static int f(int x){
      int xsquare = x*x;
      return xsquare;
    }
  
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      System.out.println(f(n));
}
}