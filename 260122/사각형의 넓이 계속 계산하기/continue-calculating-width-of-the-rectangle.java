import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int w = in.nextInt();
            int h = in.nextInt();
            char c = in.next().charAt(0);

            System.out.println(w * h);

            if (c == 'C') {
                break;
            }
        }
    }
}
