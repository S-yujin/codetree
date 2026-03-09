import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] cntarr = new int[101];

        while (true) {
            int score = in.nextInt();
            if (score == 0) break;

            if (score >= 10) {
                int band = (score / 10) * 10;
                cntarr[band]++;
            }
        }

        for (int i = 100; i >= 10; i -= 10) {
            System.out.println(i + " - " + cntarr[i]);
        }
    }
}