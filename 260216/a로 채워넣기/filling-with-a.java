import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] arr = s.toCharArray();
        int n = arr.length;

        arr[1] = 'a';        // 앞에서 2번째
        arr[n - 2] = 'a';    // 뒤에서 2번째

        System.out.println(new String(arr));
    }
}