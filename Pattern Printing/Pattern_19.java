//Pattern 19 - Print Swastik
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
          if(n==1){
            if( j<= n/2 + 1 || j==n){
              System.out.print("*\t");
            }else{
              System.out.print("\t");
            }
          }else if(i<=n /2){
            if( j == n / 2 + 1 || j == n){
              System.out.print("*\t");
            }else{
              System.out.print("\t");
            }
            
          }else if(i == n / 2 + 1){
            System.out.print("*\t");
            
          }else if(i < n){
            if ( j == 1 || j == n/2 + 1){
              System.out.print("*\t");
            }else{
              System.out.print("\t");
            }
            
          }else{
            if( j==1 || j>=n/2 + 1){
              System.out.print("*\t");
            }else{
              System.out.print("\t");
            }
            
          }
        }
        System.out.println();
      }
      
}
}