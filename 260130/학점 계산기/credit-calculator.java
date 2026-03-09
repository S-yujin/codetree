import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        float[] arr = new float[n];
        float sum = 0.0f;

        for(int i = 0; i < n; i++){
            arr[i] = in.nextFloat();

            sum += arr[i];
        }
        double avg = (double) sum / n;
        System.out.printf("%.1f\n", avg);

        if(avg >=4.0){
            System.out.print("Perfect");
        }
        else if (avg >=3.0){
            System.out.print("Good");
        } 
        else {
            System.out.print("Poor");
        }
    }
}