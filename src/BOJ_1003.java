import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BOJ_1003 {

	public static void main(String[] args)throws IOException {
		int[] F0 = new int[44];
		int[] F1 = new int[44];
		
		F0[0] = 1;
		F1[0] = 0;
		F0[1] = 0;
		F1[1] = 1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int k = 1; k <= T; k++) {
			int N = Integer.parseInt(br.readLine());
			
			for(int i = 0; i <= N; i++) {
				F0[i+2] = F0[i] + F0[i+1]; 
				F1[i+2] = F1[i] + F1[i+1];
			}
			System.out.printf("%d %d\n", F0[N], F1[N]);
		}
	}
}