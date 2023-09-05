package BackjunMunjae.FiveWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class NumberSort4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        Integer []arr = new Integer[num];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<num;i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        //내림차순을 위한 Collections
        Arrays.sort(arr, Collections.reverseOrder());

        for(int val : arr)
        {
            sb.append(val).append('\n');
        }

        System.out.println(sb);



    }
}
