import java.io.*;
import java.util.*;

public class BOJ_10817 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> arr = new ArrayList<>();

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        for(int i=0; i<3; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr); // 정렬

        bw.write(String.valueOf(arr.get(1)));
        bw.flush();
        bw.close();
    }
}
