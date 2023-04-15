import java.util.Scanner;
public class BOJ_5597 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[28]; //0번부터 27번
        int[] None = new int[2]; //과제 안 낸 2명
        int k=0; // None 배열의 인덱스

        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt(); //제출 학번 입력
        }
        for(int i =1; i<31; i++) {
            boolean submitted = false;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    submitted = true;
                    break;
                }
            }
            //제출하지 않은 학생의 학번 저장
            if (!submitted) { 
                None[k] = i;
                k++;
            }
        }
        System.out.println(None[0]+"\n"+None[1]);
    }
}
