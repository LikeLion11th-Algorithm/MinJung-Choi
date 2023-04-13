import java.util.Scanner;
public class BOJ_10870 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibo(n));
    }

    static int Fibo(int N){
        if(N == 0) {
            return 0;
        }
        if(N == 1) {
            return 1;
        }
        return Fibo(N-1) + Fibo(N-2);
    }
}
