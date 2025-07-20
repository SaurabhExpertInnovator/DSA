import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      int t = input.nextInt();
      int i=1;
      while( i <= t){
        int no= input.nextInt();
        int count=0;
        int div=2;
        while(div*div<=no){
          if(no % div == 0){
            count++;
            break;
          }
          div++;
        }
        if(count==0){
          System.out.println("Prime");
        }else {
          System.out.println("Not Prime");
        }
       i++; 
      } 
  }
}