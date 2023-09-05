package BackjunMunjae.ThreeWeeks;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sumNumber {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int num = Integer.parseInt(br.readLine());

            int cnt = 0;

            String str = br.readLine();

                for(int j=0;j<num;j++)
                {
                    cnt += str.charAt(j) -'0';
                }

                System.out.println(cnt);
    }
}
