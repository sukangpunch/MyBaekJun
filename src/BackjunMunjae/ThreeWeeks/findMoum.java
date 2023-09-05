package BackjunMunjae.ThreeWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findMoum {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int cnt = 0;

            String str = br.readLine();

            for(int i=0;i<str.length();i++)
            {
                char ch = str.charAt(i);

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
                    cnt++;
                }
            }

            System.out.println(cnt);

    }
}
