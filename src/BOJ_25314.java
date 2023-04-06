import java.util.*;

public class BOJ_25314 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String result="";
        int N = sc.nextInt();
        int count = N / 4;
        for(int i = 0; i < count; i++){
            result += "long ";
        }

        result += "int";
        System.out.println(result);
    }
}
