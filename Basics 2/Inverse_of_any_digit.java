//The inverse of a number is defined as the number formed by replacing each digit of the number with its position in the number.
//For example, the inverse of 3214 is 2143 because:
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int num = scn.nextInt();
      int inv = 0;
      int op = 1;
      while(num != 0){
        int od = num % 10;
        int id = op;
        int ip = od;
        
        //make changes to inv using ip and id
        inv = inv + id * (int)Math.pow(10, ip-1);
        num = num/10;
        op++;
      
  }
  System.out.println(inv);
}
}