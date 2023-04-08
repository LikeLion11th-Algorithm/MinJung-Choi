import java.util.*;

public class BOJ_1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 시험 본 과목의 개수
        double[] score = new double[N]; // 성적 배열
        double M = 0; // 최댓값
        double sum = 0; // 점수의 합
        double avg = 0; // 점수의 평균

        for(int i=0; i<N; i++){
            score[i] = sc.nextInt();
        }

        M = score[0];

        for(int i =0; i<N; i++){

            if(M <= score[i]) {
                M = score[i];
            }
        }

        for(int i =0; i<N; i++){
            score[i] = score[i] / M * 100;
            sum += score[i];
        }

        avg = sum/N;
        System.out.println(avg);
    }
}
