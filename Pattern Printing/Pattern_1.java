//Pattern 1 - Pattern printing
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      for (int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
        System.out.print("* ");
      }
      System.out.println();
      }
}
}