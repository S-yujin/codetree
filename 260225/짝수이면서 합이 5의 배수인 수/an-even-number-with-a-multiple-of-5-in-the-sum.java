import java.util.Scanner;

public class Main {

    public static String checkNumber(int n) {
        int tens = n / 10;
        int ones = n % 10; 
        int sum = tens + ones; 
        
        if (n % 2 == 0 && sum % 5 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println(checkNumber(n));
    }
}