import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class BOJ_2075 {
	
	static int sort(int[][] a, int key) {
		int []b = new int[key * key ];
		int temp = 0;
		int k = 0;
		//2차원 배열을 1차원 배열로 전환
		for(int i = 0; i <= a.length-1; i++) 
			for(int j = 0; j <= a[i].length-1; j++) {
				b[k] = a[i][j]; 
				k++;
			}
		//선택정렬_내림차순
		for(int i = 0; i < k-2; i++) {
			for(int j = i+1; j < k; j++) {
				if(b[i] < b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				} 
			}
		}
		return b[key-1]; 
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] Num = new int[N][N];

		for(int i = 0; i <= N-1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j = 0; j <= N-1; j++) {
				Num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int ord = sort(Num, N);
		System.out.println(ord);	
	}
}