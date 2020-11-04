import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner mike = new Scanner(System.in);
        System.out.print("number : ");
        int n = mike.nextInt();

        if(n % 2 == 0){
            System.out.println("This number is prime");
        }
        else if(n % 3 == 0){
            System.out.println("This number is prime");
        }
        else if(n % 5 == 0){
            System.out.println("This number is prime");
        }
        else{
            System.out.println("This number is not prime");
        }
    }
}