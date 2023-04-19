import java.io.*;
import java.util.*;

public class BOJ_2751 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++)
            arr.add(Integer.parseInt(br.readLine()));

        Collections.sort(arr); // 정렬

        for (int i = 0; i < N; i++) {
            bw.write(String.valueOf(arr.get(i)));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
