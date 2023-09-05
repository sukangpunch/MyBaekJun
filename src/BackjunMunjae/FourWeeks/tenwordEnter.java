package BackjunMunjae.FourWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tenwordEnter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int len = str.length();

        for(int i=0; i<len;i++)
        {
            if(i !=0 && i % 10 == 0)
            {
                System.out.println();
                System.out.print(str.charAt(i));

            }
            else {
                System.out.print(str.charAt(i));
            }
        }

    }
}
