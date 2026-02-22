import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        
        while(true){
            String str = in.next();
            
            if(str.equals("0")){
                break;
            }
            
            list.add(str);
        }
        
        System.out.println(list.size());
        
        for(int i = 0; i < list.size(); i += 2){
            System.out.println(list.get(i));
        }
    }
}