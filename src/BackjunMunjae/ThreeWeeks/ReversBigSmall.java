package BackjunMunjae.ThreeWeeks;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReversBigSmall {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();

            for(int i=0; i< str.length();i++)
            {
                char ch = str.charAt(i);

                if(ch - 'a' < 0)
                {
                    ch = (char)(ch + 32);
                    System.out.print(ch);
                }
                else
                {
                    ch = (char)(ch - 32);
                    System.out.print(ch);
                }
            }

    }
}
