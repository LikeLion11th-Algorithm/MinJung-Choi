import java.util.Scanner;

public class BOJ_11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1 ≤ a, b, c ≤ 10^12의 범위
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long total = a + b + c;

        System.out.println(total);
    }
}