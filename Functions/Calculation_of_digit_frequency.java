//Calculate the frequency of a digit in a given number
import java.util.*;

public class Main {
  
    public static int getDigitFreq(int n, int d){
      int count = 0;
      while(n > 0){
        int rem = n % 10;
        n = n / 10;
        if(rem == d){
          count ++;
        }
      }
      return count;
    }
  
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int dig = scn.nextInt();
      int result = getDigitFreq(n,dig);
      System.out.println(result);
}
}