package BackjunMunjae.TenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// ***** 백준 - No.14425 - *****
public class StrSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt =0;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> se = new HashSet<>();

        for(int i=0; i<n;i++)
        {
            se.add(br.readLine());
        }

        for(int i=0; i<m;i++)
        {
            String str = br.readLine();
            if(se.contains(str)){
                cnt++;
            }

        }

        System.out.println(cnt);

    }
}
