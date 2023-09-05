package BackjunMunjae.ThreeWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countAlphabet {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int [] arr = new int[26];

        for(int i=0; i<arr.length;i++)
        {
            arr[i] = 0;
        }

        String str = br.readLine();

        for(int i=0; i<str.length();i++)
        {
            char ch = str.charAt(i);
            arr[ch - 'a'] +=1;
        }

        for(int val : arr)
        {
            System.out.print(val + " ");
        }


    }
}
