package BackjunMunjae.NineWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CommonDivisor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<num; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i=1; i<=arr[0]; i++)
        {
            int cnt = 0;

            for(int j=0; j<num;j++)
            {
                if(arr[j] % i ==0)
                    cnt++;
            }

            if(cnt == num)
            {
                System.out.println(i);
            }

        }

    }
}
