package BackjunMunjae.FourWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class firstlastword {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num;i++)
        {
            String str = br.readLine();
            int len = str.length();

            String result = str.substring(0,1) + str.substring(len-1,len);
            System.out.println(result);
        }
    }
}
