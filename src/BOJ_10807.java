import java.util.Scanner;

public class BOJ_10807 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //정수의 개수
        int[] arr = new int[N];
        int count = 0;

        for(int i =0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        for(int i=0; i<N; i++){
            if(arr[i] == key)
                count++;
        }
        System.out.println(count);
    }
}
