package BackjunMunjae.TenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// ***** 백준 - No.10546 - *****
public class FindMaratonerWithHashMap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<n;i++)
        {
            String str = br.readLine();
            if(!map.containsKey(str)){
                map.put(str,1);
            }else{
                map.put(str,map.get(str)+1);
            }
        }

        for(int i=0; i<n-1;i++)
        {
            String str = br.readLine();
            map.put(str,map.get(str)-1);
        }

        String result;

        for(String value : map.keySet())
        {
            if(map.get(value)>0)
            {
                sb.append(value);
            }
        }

        System.out.println(sb);

    }
}
