package BackjunMunjae.TenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class UseSetFindNoHearNoSee {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Set<String> allNoHear = new HashSet<>();
        Set<String> allNoSee = new HashSet<>();
        LinkedList<String> result = new LinkedList<>();

        int noHear = Integer.parseInt(st.nextToken());
        int noSee = Integer.parseInt(st.nextToken());

        for(int i=0; i<noHear;i++)
        {
            allNoHear.add(br.readLine());

        }

        for(int i=0; i<noSee;i++)
        {
            allNoSee.add(br.readLine());
        }

        int cnt =0;

        allNoHear.retainAll(allNoSee);
        for(String element : allNoHear){
            cnt++;
            result.add(element);
        }

        Collections.sort(result);

        sb.append(cnt).append("\n");

        for(String element : result){
            sb.append(element).append("\n");
        }

        System.out.println(sb);

    }
}
