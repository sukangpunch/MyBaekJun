package BackjunMunjae.TenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// ***** 백준 - No.1302 - ****
public class UseHashmapSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> hm = new HashMap<>();


        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n;i++)
        {
            String str = br.readLine();
            if(!hm.containsKey(str)){
                hm.put(str,1);
            }
            else{
                hm.put(str,hm.get(str)+1);
            }
        }
        List<String> list = new ArrayList<>(hm.keySet());

        for(int i=0;i <list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(hm.get(list.get(i))<hm.get(list.get(j)))
                {
                    String tmp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tmp);
                }else if(hm.get(list.get(i))==hm.get(list.get(j)))
                {
                    int compare = list.get(i).compareTo(list.get(j));
                    if(compare >0)
                    {
                        String tmp = list.get(i);
                        list.set(i,list.get(j));
                        list.set(j,tmp);

                    }
                }

            }

        }
        System.out.println(list.get(0));
    }
}
