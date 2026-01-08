import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int w = in.nextInt();
        int b = (10000*w)/(int)Math.pow(h, 2);

        System.out.println(b);

        if (b >= 25){
            System.out.println("Obesity");
        }
    }
}