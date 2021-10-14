package RandomCP;

import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class NewYearChaos {

    public static void main(String [] args){
        List<Integer> file = new ArrayList<>();
        file.add(2);
        file.add(5);
        file.add(1);
        file.add(3);
        file.add(4);
        minimumBribes(file);
    }

    public static void minimumBribes(List<Integer> q) {
        int [] tabBribeCount = new int[q.size()+1];
        for(int j = q.size()-1; j > 0;j-- ) {
            for (int i = 0; i < j; i++) {
                if (q.get(i) > q.get(i + 1)) {
                    tabBribeCount[q.get(i)]++;
                    if (tabBribeCount[q.get(i)] == 3) {
                        System.out.println("Too chaotic");
                        return;
                    }
                    Integer tmp = q.get(i);
                    q.set(i, q.get(i + 1));
                    q.set(i + 1, tmp);
                }
            }
        }
        int sum=0;
        for (int i = 1; i < tabBribeCount.length ; i++){
            sum+=tabBribeCount[i];
        }
        System.out.println(sum);
    }

}
