package BackjunMunjae.TwoWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsItPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while((str = br.readLine()) !=null){
            System.out.println(str);
        }

    }
}
