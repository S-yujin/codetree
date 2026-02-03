import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = 0, B = 0, C = 0, D = 0;
        boolean emergency = false;

        for (int i = 0; i < 3; i++) {
            String cold = sc.next();
            int temp = sc.nextInt();

            if (temp >= 40) emergency = true;

            if (cold.equals("Y")) {
                if (temp >= 37) A++;
                else C++;
            } else {
                if (temp >= 37) B++;
                else D++;
            }
        }

        System.out.print(A + " " + B + " " + C + " " + D);
        if (emergency) System.out.print(" E");
    }
}
