import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2805 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int treeNum = sc.nextInt();  // 나무의 수
        long goHome = sc.nextInt();  // 집으로 가져가려는 나무 길이
        long[] tree = new long[treeNum];

        for(int i=0; i<tree.length; i++){
            tree[i] = sc.nextInt();
        }
        
        Arrays.sort(tree);  // 이진탐색 배열 정렬

        long start = 0;
        long end = tree[treeNum-1];
        long mid = 0;
        long treeCut = 0; // 절단기에 설정할 수 있는 높이의 최댓값
        long sum=0; // 가져갈 수 있는 나무 길이의 합

        while(start<=end){
            mid = (start+end)/2;
            sum=0;
            for(int i=0; i<tree.length; i++){
                if(tree[i]>mid)
                    sum += tree[i]-mid;
            }
            // 적어도 M미터의 나무를 가져가야하므로 ">="로 해야된다.
            if(sum>=goHome){ // mid 크게 해야됨
                treeCut = mid;
                start = mid+1;
            }else{ // mid 작게 해야됨
                end = mid-1;
            }
        }
        System.out.println(treeCut);
    }
}