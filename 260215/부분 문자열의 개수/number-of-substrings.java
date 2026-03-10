import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String A = in.nextLine();
        String B = in.nextLine();

        int count = 0;

        for(int i = 0; i <= A.length() - B.length(); i++) {
            if(A.substring(i, i + B.length()).equals(B)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
