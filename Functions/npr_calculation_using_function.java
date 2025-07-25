//Calculate the n p r which is equal to n factorial divide by n minus r factorial using function
import java.util.*;

public class Main {
  
    public static int fact(int x){
      int rv = 1;
      for(int i=1; i<=x; i++){
        rv = rv*i;
      }
      return rv;
    }
  
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int r = scn.nextInt();
      int npr = fact(n)/fact(n-r);
      System.out.println(n + "p" + r + "=" + npr);
}
}