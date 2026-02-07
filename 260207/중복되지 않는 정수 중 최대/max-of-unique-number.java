import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cnt = new int[1001]; // 값 범위: 1~1000

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            cnt[x]++;
        }

        int answer = -1;
        for (int i = 1; i <= 1000; i++) {
            if (cnt[i] == 1) {
                answer = i; // 자동으로 가장 큰 값으로 갱신됨
            }
        }

        System.out.println(answer);
    }
}
