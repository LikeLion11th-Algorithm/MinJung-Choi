import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class BOJ_10818 {

	static int minof(int[] b) {
		int min = 0;
		min = b[0];
		for(int i = 0; i <= b.length-1; i++) {
			if(b[i] < min) 
				min = b[i];
		}
		return min;
	}
	
	static int maxof(int[] a) {
		int max = 0;
		max = a[0];
		for(int i = 0; i <= a.length-1; i++) {
			if(a[i] > max)
				max = a[i];	
		}
		return max;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] Num = new int[N];
				
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i <= Num.length-1; i++) {
			Num[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(minof(Num) +" "+ maxof(Num));
	}
}