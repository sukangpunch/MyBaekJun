package BackjunMunjae.NineWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FormationConvert {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String str= st.nextToken();
        int js = Integer.parseInt(st.nextToken());

        int result = 0;
        int len = str.length()-1;

        for(int i=0; i<str.length();i++)
        {
            int n = Character.getNumericValue(str.charAt(len));
            result += n*Math.pow(js,i);
            len--;
        }

        System.out.println(result);




    }
}
