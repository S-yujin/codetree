import java.util.Scanner;

public class Main {
    public static boolean check(int n) {
        if (n % 3 == 0) {
            return true;
        }
        
        String s = String.valueOf(n);
        
        if (s.contains("3") || s.contains("6") || s.contains("9")) {
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int count = 0;
        
        for (int i = A; i <= B; i++) {
            if (check(i)) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}