import java.math.BigDecimal;
import java.util.Scanner;
public class BOJ_1010 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int west=0, east=0;
        BigDecimal[] result = new BigDecimal[testCase];

        for(int k=0; k<testCase; k++){
            west = sc.nextInt();  // 강 서쪽
            east = sc.nextInt();  // 강 동쪽
            result[k] = nCr(east, west);
        }
        for(int k=0; k<testCase; k++) {
            System.out.println(result[k]);
        }
    }

    static BigDecimal nCr(int n, int r){
        if(n == r)
            return BigDecimal.ONE;
        if(r == 1)
            return new BigDecimal(n);

        double numerator = 1; // 분자
        double denominator = 1; // 분모

        for(int i=n; i>n-r; i--){
            numerator *= i;
        }
        for(int i=r; i>0; i--){
            denominator *= i;
        }
        return new BigDecimal(numerator).divide(new BigDecimal(denominator));
    }
}
