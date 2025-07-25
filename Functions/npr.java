//Calculate the n p r which is equal to n factorial divide by n minus r factorial
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int r = scn.nextInt();
      
      int nfact = 1;
      for(int i=1; i<=n; i++){
        nfact *=i;
      }
      int nmrfact = 1;
      for (int j=1; j<=n-r; j++){
        nmrfact *= j;
      }
      int npr = nfact/nmrfact;
      System.out.println(n + "P" + r + " = " + npr);
      
      
}
}