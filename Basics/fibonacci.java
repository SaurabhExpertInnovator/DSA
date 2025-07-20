import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      int n = input.nextInt();
      int t1=0;
      int t2=1;
      System.out.println(t1);
      System.out.println(t2);
      for(int i=1; i<n-1;i++){
        int t3 = t1+t2;
        t1 = t2;
        t2 = t3;
        System.out.println(t3);
      }
  }
}