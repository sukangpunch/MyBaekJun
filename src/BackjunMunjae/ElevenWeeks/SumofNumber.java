package BackjunMunjae.ElevenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ***** 백준 - No.1789 - *****
public class SumofNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long sum = 0;
        int cnt = 0;

        for(int i=1;; i++)
        {
            if(sum > n) break;
            sum += i;
            cnt++;
        }
        System.out.println(cnt-1);
    }
}
