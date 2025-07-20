import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      int n = input.nextInt();
      int dig=0;
      int temp=n;
      while(temp != 0){
        temp = temp/10;
        dig++;
      }
      int div=(int)Math.pow(10, dig-1);
      while(n!=0){
        int q=n/div;
        System.out.println(q);
        
        n=n%div;
        div=div/10;
      }
  }
}