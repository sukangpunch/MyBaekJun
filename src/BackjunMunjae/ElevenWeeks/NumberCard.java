package BackjunMunjae.ElevenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//***** 백준 - No.2805 - *****
public class NumberCard {
    static int n, m;
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
            int num = Integer.parseInt(st.nextToken());
            if(binarySearch(num)){
                sb.append("1"+" ");
            }else{
                sb.append("0"+" ");
            }
        }

        System.out.println(sb);
    }
    public static boolean binarySearch(int num){
        int leftIndex = 0;
        int rightIndex = n - 1;

        while(leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex)/2;
            int mid = arr[midIndex];

            if(num < mid){
                rightIndex = midIndex -1;
            }else if(num > mid){
                leftIndex = midIndex +1;
            }else{
                return true;
            }
        }
        return false;
    }
}
