//Conversion of decimal to octate number whose base is 8
import java.util.*;

public class Main {
  
    public static void convertOctal(int n){
      int count = 0;
      int result = 0;
      while( n > 0){
        int rem = n % 8;
        n = n / 8;
        result = result + ( rem * (int)Math.pow(10,count));
        count++;
       
      }
       System.out.print(result);
       
    }
  
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      convertOctal(n);
}
}