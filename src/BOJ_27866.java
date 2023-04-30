import java.util.Scanner;
public class BOJ_27866 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = sc.nextInt();

        char ch = str.charAt(num-1);
        System.out.println(ch);
    }
}
