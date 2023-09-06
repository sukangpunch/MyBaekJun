package BackjunMunjae.TenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class FindDifferentSubstring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> se = new HashSet<>();
        String str = br.readLine();
        int cnt =0;

        for(int i=0; i<str.length();i++)
        {
           for(int j=i+1; j<str.length()+1;j++)
           {
               se.add(str.substring(i,j));
           }
        }

        for(String element : se)
        {
            cnt++;
        }

        System.out.println(cnt);


    }
}
