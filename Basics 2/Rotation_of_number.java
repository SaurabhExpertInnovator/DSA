//Rotation of number which takes two inputs, one is number and other is times of rotation (r in this case)
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int num = scn.nextInt();
      int k = scn.nextInt();
      
      int temp = num;
      int nod = 0;
      while (temp > 0){
        temp = temp / 10;
        nod ++;
      }
      // COnvert the number greater than number of digit within range of less than number of digit
      k = k % nod;
      if (k < 0){
        k = k + nod;
      }
      
      int div = 1;
      int mult = 1;
      for (int i=1; i<=nod; i++){
        if (i <= k){
          div = div * 10;
        }
        else{
          mult = mult * 10;
        }
      }
      int q = num / div;
      int r = num % div;
      int rotated_number = r * mult + q;
      System.out.println(rotated_number);
      
      
}
}