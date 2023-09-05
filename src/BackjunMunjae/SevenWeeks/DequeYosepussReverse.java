package BackjunMunjae.SevenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class DequeYosepussReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int reverse = Integer.parseInt(st.nextToken());

        Deque<Integer> list = new LinkedList<>();


        for(int i=1; i<size+1; i++)
        {
            list.offer(i);
        }

        int cnt = 1;
        int checkReverse = 0;
        boolean check = true;
       while(list.size() != 0)
       {
           if(checkReverse == reverse){
               check = !check;
               checkReverse=0;
           }

           if(check){
                if(cnt == num)
                {
                    sb.append(list.pollFirst()).append("\n");
                    checkReverse++;
                    cnt=1;
                }
                else{
                    list.offerLast(list.pollFirst());
                    cnt++;
                }
            }else
            {
                if(cnt == num)
                {
                    sb.append(list.pollLast()).append("\n");
                    checkReverse++;
                    cnt=1;
                }else
                {
                    list.offerFirst(list.pollLast());
                    cnt++;
                }
            }
       }
       System.out.println(sb);
       br.close();

    }
}
