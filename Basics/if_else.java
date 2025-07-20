import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks : ");
        marks = input.nextInt();
        if(marks >90){
            System.out.println("Excellent");
        }else if(marks > 80){
            System.out.println("Good");
        }else if(marks > 70){
            System.out.println("Fair");
        }else if(marks > 60){
            System.out.println("Meets Expectations");
        }else{
            System.out.println("Poor");
        }
    }
}