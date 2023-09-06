package BackjunMunjae.TenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//***** 백준 - No.7785 - *****
public class UseHashmapReverseSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashMap<String,String> map = new HashMap<>();

        for(int i=0; i<n;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(),st.nextToken());
        }

        List<String> list = new ArrayList<>();

        for(String value : map.keySet())
        {
            if(map.get(value).equals("enter")){
                list.add(value);
            }
        }

        Collections.sort(list);
        Collections.reverse(list);

        for(int i=0; i<list.size();i++)
        {
            sb.append(list.get(i)).append("\n");
        }

        System.out.println(sb);

    }
}
