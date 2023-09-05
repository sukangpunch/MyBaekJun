package BackjunMunjae.SevenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BalloonDeque {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<int[]> dq = new ArrayDeque<>();

        int arr[] = new int[num];

        for(int i=0; i<num;i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sb.append("1 ");
        int number = arr[0];

        for(int i=1; i<num; i++)
        {
            dq.add(new int[]{(i+1),arr[i]});
        }

        while(!dq.isEmpty())
        {

            if(number > 0)
            {
                for(int j=1; j<number;j++)
                {
                    dq.add(dq.poll());
                }
                int []nxt = dq.poll();
                number = nxt[1];
                sb.append(nxt[0]+" ");

            }
            else
            {
                for(int j=1; j<-number;j++)
                {
                    dq.addFirst(dq.pollLast());
                }

                int []nxt = dq.pollLast();
                number = nxt[1];
                sb.append(nxt[0]+" ");
            }
        }
        System.out.println(sb);
    }
}
