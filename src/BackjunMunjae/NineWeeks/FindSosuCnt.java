package BackjunMunjae.NineWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindSosuCnt {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt =0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++)
        {
            int value = Integer.parseInt(st.nextToken());
            if(value == 1)continue;
            boolean check = true;

            for(int j=2; j<value;j++)
            {
                if(value % j ==0)
                {
                    check =false;
                }
            }

            if(check)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
