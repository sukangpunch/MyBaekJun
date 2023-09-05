package BackjunMunjae.FiveWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class NumberSort2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<num;i++)
        {
            list.add(Integer.parseInt(br.readLine()));
        }

        //Array.sort() -> 퀵정렬 알고리즘
        Collections.sort(list); //-> Timesort정렬(합병,삽입정렬 알고리즘)

        for(int val : list){
            sb.append(val).append("\n");
        }

        System.out.println(sb);


    }
}
