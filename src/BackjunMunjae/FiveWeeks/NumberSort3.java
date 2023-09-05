package BackjunMunjae.FiveWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberSort3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int []arr = new int[num];

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<num; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int val : arr)
        {
            sb.append(val).append('\n');
        }

        System.out.println(sb);

    }
}
