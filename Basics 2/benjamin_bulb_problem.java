//Benjamin Bulb problem
//In this problem the bulb who is perfect square will be in on state after nth fluctuation of the bulb
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      for(int i=1; i*i <= n; i++){
        System.out.println(i*i);
      }
}
}