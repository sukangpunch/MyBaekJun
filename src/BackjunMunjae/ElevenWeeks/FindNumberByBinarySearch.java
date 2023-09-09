package BackjunMunjae.ElevenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// ***** 백준 - No.1920 - *****
public class FindNumberByBinarySearch {
    static int arr[];
    static int n;
    static int m;

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<m;i++)
        {
            int find = Integer.parseInt(st.nextToken());

            if(findNumber(find)){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static boolean findNumber(int find){
        int max = n-1;
        int mid = 0;
        int min = 0;

        while(min <= max){

            mid = (max+min)/2;

            if(arr[mid] > find){
                //이 부분에서 삽질함...
                max = mid-1;
            }else if(arr[mid]< find){
                min = mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}
