import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        StringBuilder result = new StringBuilder();
        
        char prev = A.charAt(0);
        int count = 1;

        for(int i = 1; i < A.length(); i++) {
            if(A.charAt(i) == prev) {
                count++;
            } else {
                result.append(prev).append(count);
                prev = A.charAt(i);
                count = 1;
            }
        }

        result.append(prev).append(count);

        System.out.println(result.length());
        System.out.println(result.toString());
    }
}
