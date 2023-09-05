package BackjunMunjae.FiveWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class findManyCard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        HashMap<Long,Integer> map = new HashMap<>();

        int max=0;
        long x =0;
        for(int i=0; i<num;i++)
        {
            long card = Long.parseLong(br.readLine());
                                //card에 해당하는 키가 있으면 card값 출력, 없으면 기본값 0 출력
            map.put(card,map.getOrDefault(card,0)+1);

            if(map.get(card) > max)
            {
                max = map.get(card);
                x=card;
            }else if(map.get(card) == max) {
                    //x와 card값중 작은걸 출력
                x = Math.min(x, card);
            }
        }
        System.out.println(x);





    }
}
