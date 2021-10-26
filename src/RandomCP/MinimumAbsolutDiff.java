package RandomCP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumAbsolutDiff {
    public static void main(String [] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(-3);
        arr.add(71);
        arr.add(68);
        arr.add(17);
        arr.add(1000);
        System.out.println(minimumAbsoluteDifference(arr));
    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        int minDiff = Integer.MAX_VALUE;
        Collections.sort(arr);
        int diff = 0;
        for (int i = 0; i < arr.size()-1; i++) {
            diff = Math.abs(arr.get(i)-arr.get(i+1));
            if(minDiff > diff)
                minDiff = diff;
        }
        return minDiff;
    }
}
