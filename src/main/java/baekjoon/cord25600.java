package baekjoon;

import java.io.*;
import java.util.*;
public class cord25600 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int max = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int score;

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == (b + c)) {
                score = (a * (b+c)) * 2;
            } else {
                score = a * (b+c);
            }
            max = Math.max(score,max);
        }
        System.out.println(max);
    }
}