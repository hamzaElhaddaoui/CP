package RandomCP.meduim;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
public class SherlockAndAnagrams {

    public static void main(String [] args){
        System.out.println(getNumberOfAnagrams(new String("kkkk")));
    }

    public static int getNumberOfAnagrams(String s){
        Map<String,Integer> subSCount = new HashMap<>();

        // get all possible subString
        for (int i = 0; i < s.length() ; i++) {
            for (int j = i+1; j <= s.length() ; j++) {

                char [] sortedArray = s.substring(i,j).toCharArray();
                // add substring to maps with sorted key
                Arrays.sort(sortedArray);

                String sortedKey = new String(sortedArray);

                subSCount.putIfAbsent(sortedKey,0);
                subSCount.put(sortedKey, subSCount.get(sortedKey)+1);
            }
        }

        int nbAnagrams = 0;

        Iterator<String> it = subSCount.keySet().iterator();
        while(it.hasNext()){
            // get the key
            String key = (String) it.next();
            System.out.println("key: "+key+" value: "+subSCount.get(key));

            if(subSCount.get(key)>1){
                nbAnagrams += (subSCount.get(key)*(subSCount.get(key)-1))/2;
            }
        }

        return nbAnagrams;
    }
}
