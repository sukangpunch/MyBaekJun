package BackjunMunjae.ElevenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ***** 백준 - No.1654 - *****
public class CutLan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr [] = new int[n] ;
        long min=0;
        long max =0;
        long mid = 0;

        for(int i=0;i <n;i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] > max){
                max = arr[i];
            }
        }

        max++;

        while(min < max){
            mid = (max + min) /2;
            long cnt = 0;

            for(int i=0; i<arr.length;i++)
            {
                cnt +=(arr[i]/mid);
            }

            if(cnt < m){
                max = mid;
            }
            else{
                min = mid +1;
            }


        }
        System.out.println(min - 1);

    }
}
