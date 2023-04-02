import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_1002 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[6];
		
		for(int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int i = 0; i <= 5; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			double X =  (arr[0] - arr[3]);
			double Y = (arr[1] - arr[4]);
			double distance = Math.pow(X, 2) + Math.pow(Y, 2); 
			double plus = Math.pow((arr[2] + arr[5]), 2);
			double minus = Math.pow((arr[2] - arr[5]), 2);
				
			if(arr[0] == arr[3] && arr[1] == arr[4] && arr[2] == arr[5]) {
				System.out.println(-1);
			}else if(distance == plus) {
				System.out.println(1);
			}else if(distance < minus) {
				System.out.println(0);
			}else if(distance > plus) {
				System.out.println(0);
			}else if(distance == minus) {
				System.out.println(1);
			}else {
				System.out.println(2);
			}	
		}
	}
}