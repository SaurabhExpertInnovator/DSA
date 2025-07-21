//Prime factorization of a number
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      for(int i=2; i*i<=n1; i++){
        while( n1%i == 0){
          n1 = n1 / i;
          System.out.print(i + " ");
        }
      }
      if (n1 != 1){
        System.out.print(n1);
      }
      
}
}