import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class BOJ_1004 {

	public static void main(String[] args) throws IOException {
		int[] X =  new int[5];
		int[] C = new int[4];
		int count = 0;
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int k = 1; k <= 4; k++) {
				X[k] = Integer.parseInt(st.nextToken()); //출발점, 도착점
			}
		
			int n = Integer.parseInt(br.readLine());	//행성 개수
			for(int i = 1; i <= n; i++) {
				StringTokenizer ss = new StringTokenizer(br.readLine()," ");
				
				for(int j = 1; j <=3; j++) {
					C[j] = Integer.parseInt(ss.nextToken());
				}	
				double Sdis = Math.pow((X[1]-C[1]), 2) 
						+ Math.pow(X[2] - C[2], 2);
				double Fdis = Math.pow((X[3]-C[1]), 2) 
						+ Math.pow(X[4] - C[2], 2);
				double SFdis = Math.pow(X[1]-X[3], 2)
						+Math.pow(X[2]-X[4], 2);					
				double r = Math.pow(C[3], 2);
		
				if(Sdis <r && Fdis < r) continue;
				if(Sdis < r)
					count ++;
				if(Fdis < r)
					count ++;
			}
		System.out.println(count);
		count = 0;
		}
	}
}