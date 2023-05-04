import java.util.Scanner;

public class BOJ_2675 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int count=0;
        String[] str = new String[testCase];
        String[] result = new String[testCase];

        for(int i=0; i<testCase; i++){
            count = sc.nextInt();
            sc.nextLine();
            str[i] = sc.nextLine();
        }
        // JDK 11 이상부터는 repeat 메소드 사용하면 됨
        for(int i=0; i<testCase; i++){
            result[i] = "";
            for(int j=0; j<count; j++){
                char ch = str[i].charAt(j);
                result[i] += ch;
            }
        }
        for(int i=0; i<testCase; i++){
            System.out.println(result[i]);
        }
    }
}
