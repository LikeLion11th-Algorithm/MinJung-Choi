import java.util.*;
import java.io.IOException;
public class BOJ_4344 {
	static double student(int [] a) {
		int sum = 0, avg = 0, count = 0;
		double rate = 0;
		for(int i = 1; i <= a[0]; i++) {
			sum += a[i];
		}
		avg = sum / a[0];
		for(int i = 1; i <= a[0]; i++)
			if(a[i] > avg) {
				count++;
			}
		rate = (double)count/(double)a[0];
		return rate;
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //테스트케이스
		
		for(int i = 0; i < T; i++) {
			int [] score = new int[1001];
			score[0] = sc.nextInt();
			for(int j = 1; j <= score[0]; j++) {
				score[j] = sc.nextInt();
			}
			double ans = student(score);
			System.out.println(String.format("%.3f",ans*100)+"%");	
		}
	}
}