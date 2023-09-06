package BackjunMunjae.TenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

// ***** 백준 - No.9375 - *****
public class FationKingWithHashMap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int cnt=0;


        for(int i=0; i<n; i++)
        {
            int m = Integer.parseInt(br.readLine());
            HashMap<String,String> map = new HashMap<>();
            HashMap<String,Integer> map2 = new HashMap<>();

            for(int j=0; j<m;j++)
            {
                StringTokenizer st = new StringTokenizer(br.readLine());
                map.put(st.nextToken(), st.nextToken());
            }

            List<String> list = new ArrayList<>(map.keySet());

            for(String value : list)
            {
                if(!map2.containsKey(map.get(value))){
                    map2.put(map.get(value),1);
                }
                else{
                    map2.put(map.get(value),map2.get(map.get(value))+1);
                }
            }

            List<String> list2 = new ArrayList<>(map2.keySet());
            int result = 1;
            for(String value : list2)
            {
                result *= map2.get(value)+1;
            }

            sb.append(result-1).append("\n");

        }
        System.out.println(sb);
    }
}
