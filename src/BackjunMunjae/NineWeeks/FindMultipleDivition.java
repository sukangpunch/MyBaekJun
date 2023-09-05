package BackjunMunjae.NineWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindMultipleDivition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[2];

        for(int i=0; i<2;i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int big = 0;

        for(int i=1;i<=arr[0];i++)
        {
           int cnt=0;

            for(int j=0; j<2;j++)
            {
                if(arr[j] % i == 0){
                    cnt++;
                }
            }

            if(cnt == 2)
            {
                if(big<i)
                {
                    big = i;
                }
            }
        }

        int small = (arr[0]*arr[1])/big;

        sb.append(big).append("\n");
        sb.append(small).append("\n");

        System.out.println(sb);

    }
}
