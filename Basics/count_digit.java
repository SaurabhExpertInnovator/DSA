import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      int n = input.nextInt();
      int dig = 0;
      while(n!=0){
        n=n/10;
        dig++;
      }
      System.out.println("The count of digit in a number is " + dig);
  }
}