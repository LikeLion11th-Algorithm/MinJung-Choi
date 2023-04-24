import java.util.*;
// 삼각형이 만들어질 조건을 충족해야한다. 
// 가장 긴 변 < 나머지 두 변의 합
public class BOJ_1448 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //ArrayList 사용하여 메모리 효율적으로 사용
        List<Integer> side = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            side.add(sc.nextInt());
        }
        Collections.sort(side); // 정렬

        loopOut:  // 이중반복문 탈출
        for (int i = N; i >=3; i--) {
            for(int j=i; j>=3; j--){
                if (side.get(i - 1) < side.get(j - 2) + side.get(j - 3)) {
                    sum = side.get(i - 1) + side.get(j - 2) + side.get(j - 3);
                    System.out.println(sum);
                    break loopOut;
                }else if(i==3 && j ==3){
                    System.out.println(-1);
                }
            }
        }
    }
}