package BackjunMunjae.TenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class PoketmonMaster {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int mon = Integer.parseInt(st.nextToken());
        int quiz = Integer.parseInt(st.nextToken());

        String [] arr = new String[mon+1];

        HashMap<String,Integer> hm = new HashMap<>();

        for(int i=1;i<=mon;i++)
        {
            String str = br.readLine();
            hm.put(str,i);
            arr[i] = str;
        }

        for(int i=0; i<quiz;i++)
        {
            String str = br.readLine();
            if(isStringNumber(str))
            {
                int index = Integer.parseInt(str);
                sb.append(arr[index]);
            }else{
                sb.append(hm.get(str));
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
    public static  boolean isStringNumber(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
}
