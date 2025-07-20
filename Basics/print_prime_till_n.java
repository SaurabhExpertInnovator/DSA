import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      int low = input.nextInt();
      int high = input.nextInt();
      for( int i=low; i<=high; i++){
        int count=0;
        for(int div=2; div*div<=i; div++){
          if(i % div ==0){
            count++;
            break;
          }
         }
        if(count==0){
            System.out.println(i);
          }
      }
      
  }
}