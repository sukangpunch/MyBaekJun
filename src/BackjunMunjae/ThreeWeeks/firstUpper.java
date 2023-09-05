package BackjunMunjae.ThreeWeeks;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class firstUpper {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int num = Integer.parseInt(br.readLine());

            for(int i=0; i<num;i++)
            {
                String str = br.readLine();

                char ch = str.charAt(0);

                if(ch -'a' >= 0 )
                {
                    ch = (char)(ch -32);
                }
                else{}

                str = ch + str.substring(1);

                System.out.println(str);
            }

    }
}
