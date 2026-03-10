import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            int type = sc.nextInt();

            if (type == 1) {
                int a = sc.nextInt();
                System.out.println(arr[a - 1]);
            }

            else if (type == 2) {
                int b = sc.nextInt();
                int idx = 0;

                for (int j = 0; j < N; j++) {
                    if (arr[j] == b) {
                        idx = j + 1;
                        break;
                    }
                }
                System.out.println(idx);
            }

            else if (type == 3) {
                int s = sc.nextInt();
                int e = sc.nextInt();

                for (int j = s - 1; j <= e - 1; j++) {
                    System.out.print(arr[j]);
                    if (j < e - 1) System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
