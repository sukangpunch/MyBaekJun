package BackjunMunjae.ElevenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ***** 백준 - No.2805 - *****
public class CutTree {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[] = new int[n];

        int min = 0;
        int max = 0;

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
            if(max<arr[i])max=arr[i];
        }

        while(min < max){
            int mid = (min + max) / 2;
            //문제에서 단일 나무의 길이의 최대가 10억이라함. 연산을 통해 sum 값이 21억이 넘어갈 수 있으므로 long으로 선언.
            long sum  = 0;
            for(int value : arr){
                if(value - mid > 0){
                    sum += value - mid;
                }
            }
            if(sum < m){
                max = mid;
            }else{
                min = mid +1;
            }
        }

        System.out.println(min -1);


    }
}
