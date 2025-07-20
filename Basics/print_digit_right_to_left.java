import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      int n = input.nextInt();
      int temp;
      while(n != 0){
        temp = n%10;
        System.out.println(temp);
        n=n/10;
      }
  }
}