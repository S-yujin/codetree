import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i <= n1 - n2; i++) {
            int cnt = 0;

            for (int j = 0; j < n2; j++) {
                if (a[i + j] == b[j]) {
                    cnt++;
                } else {
                    break;
                }
            }

            if (cnt == n2) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
