package RandomCP;

import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/bon-appetit/problem
public class BillDivision {

    public static void main(String [] args){

        bonAppetit(Arrays.asList(new Integer[]{3, 10, 2, 9}),1,12);

    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here

        int anaCost = bill.stream().filter(item -> bill.get(k)!=item).reduce(0,Integer::sum)/2;
        if(b-anaCost==0)
            System.out.println("Bon Appetit");
        else{
            System.out.println(b-anaCost);
        }
    }
}
