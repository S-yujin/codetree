import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] count = new int[B];  // 나머지 등장 횟수 저장

        // A가 1이 되기 "전까지" 반복
        while (A > 1) {
            int remainder = A % B; // 나머지 먼저 구하고
            count[remainder]++;    // 등장 횟수 증가
            A /= B;                // 그 다음 나눔
        }

        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += count[i] * count[i];
        }

        System.out.println(sum);
    }
}
