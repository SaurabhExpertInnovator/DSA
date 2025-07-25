//Convert the following to decimal numbers
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      
      int p = 1;
      int rv = 0;
      while(n > 0){
        int dig = n % 10;
        n = n / 10;
        
        rv = rv + dig * p;
        p = p * b;
      }
      System.out.println(rv);
  }
}