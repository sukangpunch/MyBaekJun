package BackjunMunjae.ThreeWeeks;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class findMoum2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for(;;){
            String str = br.readLine();
            int count =0;
            if(str.equals("#")){
                break;
            }

            str = str.toLowerCase();

            for(int i=0; i<str.length();i++){

                char ch = str.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    count++;
                }
                else{}
            }

            System.out.println(count);
        }

    }
}
