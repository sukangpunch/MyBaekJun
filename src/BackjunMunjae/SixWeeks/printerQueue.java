package BackjunMunjae.SixWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class printerQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int find = Integer.parseInt(st.nextToken());
            int cnt = 0;

            Queue<int[]> queue = new LinkedList<>();
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j=0; j<n;j++)
            {
                queue.add(new int[]{j,Integer.parseInt(st2.nextToken())});
            }

            while(true)
            {
                int now[] = queue.remove();
                boolean flag = true;

                for(int q[]: queue)
                {
                    if(q[1] > now[1]){
                        flag =false;
                        break;
                    }
                }

                if(flag){
                    cnt++;
                    if(now[0] == find)break;
                }else{
                    queue.add(now);
                }
            }
            System.out.println(cnt);

        }
    }
}

