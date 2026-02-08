import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] price = new long[N];

        for(int i = 0; i < N; i++){
            price[i] = sc.nextLong();
        }

        long minPrice = price[0];
        long maxProfit = 0;

        for(int i = 1; i < N; i++){
            if(price[i] - minPrice > maxProfit){
                maxProfit = price[i] - minPrice;
            }
            if(price[i] < minPrice){
                minPrice = price[i];
            }
        }

        System.out.println(maxProfit);
    }
}
