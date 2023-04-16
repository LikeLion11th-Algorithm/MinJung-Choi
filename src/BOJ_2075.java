import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class BOJ_2075 {
	
	static int sort(int[][] arr, int N) {
		int[] newArr = new int[N * N];
		int tmp = 0;
		int k = 0;
		//2차원 배열을 1차원 배열로 전환
		for(int i = 0; i <= arr.length-1; i++)
			for(int j = 0; j <= arr[i].length-1; j++) {
				newArr[k] = arr[i][j];
				k++;
			}
		//선택정렬_내림차순
		for(int i = 0; i < k-2; i++) {
			for(int j = i+1; j < k; j++) {
				if(newArr[i] < newArr[j]) {
					tmp = newArr[i];
					newArr[i] = newArr[j];
					newArr[j] = tmp;
				} 
			}
		}
		return newArr[N-1];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][N];

		for(int i = 0; i <= N-1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j = 0; j <= N-1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int ord = sort(arr, N);
		System.out.println(ord);	
	}
}