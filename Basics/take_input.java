import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int marks=input.nextInt();
        System.out.println("The marks stored is " + marks);


        System.out.println("Enter any Name : ");
        String name = input.nextLine();
        System.out.println("The name is "+ name);
    }

    /*Single input at a time i.e. either integer or string ww can use the program 
    But it will not work for both inputs at a time. Then we have to use Interger.parseInt() method
    the above code will looks like:
    Scanner input= new Scanner (System.in);
        int marks=Integer.parseInt(input.nextInt());
        System.out.println("The marks stored is " + marks);


        System.out.println("Enter any Name : ");
        String name = input.nextLine();
        System.out.println("The name is "+ name); */
}