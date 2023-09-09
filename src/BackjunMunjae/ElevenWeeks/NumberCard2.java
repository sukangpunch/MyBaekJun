package BackjunMunjae.ElevenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//***** 백준 - No.10816 - *****
public class NumberCard2 {
    static int n,m;
    static int arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n;i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<m;i++)
        {
            int find = Integer.parseInt(st.nextToken());
            int start = findFNumber(find);
            int end = findENumber(find);

            sb.append((end - start)+1).append(" ");
        }
        System.out.println(sb);

    }

    public static int findFNumber(int find){
        int max = n-1;
        int mid = 0;
        int min = 0;

        while(min <= max){
            mid = (max+min)/2;

            if(arr[mid] < find){
                min = mid + 1;
            }else{
                max = mid - 1;
            }
        }
        return min;
    }

    public static int findENumber(int find){
        int max = n -1;
        int mid = 0;
        int min = 0;

        while(min <= max){
            mid = (max+min)/2;

            if(arr[mid] <= find){
                min = mid+1;
            }else{
                max = mid-1;
            }
        }
        return max;
    }
}
