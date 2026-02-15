import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        if(str.contains("ee")) {
            System.out.printf("Yes ");
        } else {
            System.out.printf("No ");
        }
        
        if(str.contains("ab")) {
            System.out.printf("Yes");
        } else {
            System.out.printf("No");
        }
    }
}
