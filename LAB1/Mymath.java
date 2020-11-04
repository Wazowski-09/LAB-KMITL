import java.util.*;
public class Mymath {
    public static double seq(int n){
        double ans_fact = 1; double ans_pow = 1; double sum = 0;
        for(int i = 1 ;i <= n ;i++){
            ans_fact *= i;
            ans_pow = Math.pow(i,2);
            sum += (ans_fact / ans_pow);          
    }
        return sum;
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n => ");
    int n = input.nextInt();
    System.out.printf("Answer = " + seq(n));
}    
}