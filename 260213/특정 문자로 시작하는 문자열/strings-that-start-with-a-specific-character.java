import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); 

        String[] arr = new String[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextLine();
        }

        char ch = sc.nextLine().charAt(0);

        int count = 0;
        int sum = 0;

        for(int i = 0; i < N; i++){
            if(arr[i].charAt(0) == ch){
                count++;
                sum += arr[i].length();
            }
        }

        double avg = (double) sum / count;

        System.out.printf("%d %.2f", count, avg);
    }
}
