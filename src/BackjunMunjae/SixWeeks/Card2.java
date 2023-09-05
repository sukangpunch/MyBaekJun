package BackjunMunjae.SixWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Card2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> list = new LinkedList<>();

        int num =Integer.parseInt(br.readLine());

        for(int i=0; i<num;i++)
        {
            list.add(i,i+1);
        }


        while (list.size()>1){
            list.removeFirst();

            if(list.size()>1)
            {
                int n = list.getFirst();
                list.removeFirst();
                list.addLast(n);
            }
        }
    System.out.println(list.get(0));
    }
}
