import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float[] score = new float[8];
        float avg = 0;
        float sum = 0;
        float cnt = 0;

        for(int i = 0; i < 8; i++){
            score[i] = in.nextFloat();
            
            sum += score[i];
            cnt ++;
        }
        avg = sum / cnt;

        System.out.print(avg);
    }
}