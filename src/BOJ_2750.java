import java.util.*;
// 수 정렬하기 문제
public class BOJ_2750 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0; i<N; i++){
            System.out.println(arr[i]);
        }
    }
}