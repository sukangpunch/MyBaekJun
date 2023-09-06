package BackjunMunjae.TenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// ***** 백준 - No.1269 - *****

public class SymmetryDifferenceSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<Integer> se1 = new HashSet<>();
        Set<Integer> se2 = new HashSet<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        for(int i=0; i<n;i++)
        {
            se1.add(Integer.parseInt(st2.nextToken()));
        }

        for(int i=0; i<m;i++)
        {
            se2.add(Integer.parseInt(st3.nextToken()));
        }

        int cnt = se1.size()+se2.size();

        se1.retainAll(se2);
        cnt -=se1.size()*2;

        System.out.println(cnt);



    }
}
