import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, i, j, cnt;

        cnt = 0;
        
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        int[] a = new int[n1];
        int[] b = new int[n2];

        for(i = 0 ; i < n1 ; i ++){
            a[i] = sc.nextInt();
        }
        for(i = 0 ; i < n2 ; i ++){
            b[i] = sc.nextInt();
        }

        for(i = 0 ; i < n1 ; i ++){
            if(a[i] == b[0]){
                for(j = 0 ; j < n2 ; j ++){
                    if(a[i + j] == b[j]){
                        cnt ++;
                    }
                }
                if(cnt == n2){
                    System.out.print("Yes");
                    break;
                }

                else{
                    cnt = 0;
                }
            }
        }
        
        if(cnt == 0){
            System.out.print("No");
        }

    }
}
