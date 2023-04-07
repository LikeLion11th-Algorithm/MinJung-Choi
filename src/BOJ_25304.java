import java.util.*;

public class BOJ_25304 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();  // 영수증 총 금액
        int N = sc.nextInt(); // 구매 수
        int price, num, realTotal=0;

        for(int i =0 ; i <N; i++){
            price = sc.nextInt();
            num = sc.nextInt();
            realTotal += price * num;
        }
        if(realTotal != total)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
