package BackjunMunjae.TenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


//***** 백준 - No.17219 - *****
public class findPasswordWithHashmap {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String,String> map = new HashMap<>();

        for(int i=0; i<n;i++)
        {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            map.put(st2.nextToken(),st2.nextToken());
        }

        for(int i=0; i<m;i++)
        {
            String str = br.readLine();
            if(map.containsKey(str)){
                sb.append(map.get(str)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
