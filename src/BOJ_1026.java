import java.util.Arrays;
import java.util.Scanner;
// B배열의 가장 큰 요소와 A배열의 가장 작은 요소끼리 곱하면된다.
public class BOJ_1026 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 배열의 크기
        int[] A = new int[N];
        int[] B = new int[N];
        int[] max = B;
        int AB = 0;

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            B[i] = sc.nextInt();
        }

        Arrays.sort(A); // A배열 정렬
        Arrays.sort(max); // max배열 정렬

        for(int i=0; i<N; i++){
            AB += A[i] * max[max.length-1-i];
        }
        System.out.println(AB);
    }
}
