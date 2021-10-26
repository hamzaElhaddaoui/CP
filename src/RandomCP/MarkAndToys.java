package RandomCP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarkAndToys {
    public static void main(String [] args){
        List<Integer> prices = new ArrayList<>();
        prices.add(1);
        prices.add(12);
        prices.add(5);
        prices.add(111);
        prices.add(200);
        prices.add(1000);
        prices.add(10);
        System.out.println(maximumToys(prices, 50));
    }

    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
        Collections.sort(prices);
        int sum = 0;
        for (int i = 0 ; i < prices.size(); i++) {
            sum += prices.get(i);
            if(sum > k){
                return i;
            }
        }
        return prices.size();
    }
}
