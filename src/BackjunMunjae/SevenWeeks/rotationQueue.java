package BackjunMunjae.SevenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class rotationQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt =0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();

        for(int i=1 ;i<= size;i++)
        {
            list.offer(i);
        }

        int arr[] = new int[num];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<num;i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<num; i++)
        {
           
            //arr[i] 에 해당하는 값이 list의 어느 인덱스에 위치해있는지 출력
            int target_idx = list.indexOf(arr[i]);
            int half_idx;

            if(list.size() % 2 ==0){
                half_idx = list.size()/2 -1;
            }else{
                half_idx = list.size()/2;
            }

            if(target_idx <= half_idx)
            {
                for(int j= 0; j<target_idx;j++)
                {
                    int temp = list.pollFirst();
                    list.offerLast(temp);
                    cnt++;
                }
            }
            else{
                for(int j =0; j<list.size() - target_idx; j++)
                {
                    int temp = list.pollLast();
                    list.offerFirst(temp);
                    cnt++;
                }
            }
            list.pollFirst();

        }
        System.out.println(cnt);


    }
}
