package RandomCP;

import java.util.Arrays;
//https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
public class MakingAnagrams {

    public static void main(String [] args){
        String str1 = "cde";
        String str2 = "abc";

        System.out.println(makeAnagram(str1,str2));
    }

    public static int makeAnagram(String a, String b) {
        // Write your code here
        char[] tA = a.toCharArray();
        char[] tB = b.toCharArray();

        Arrays.sort(tA);
        Arrays.sort(tB);
        int i=0, j=0;
        int nbDelete=0;
        while(i<tA.length && j<tB.length){
            if(tA[i]<tB[j]){
                i++;
                nbDelete++;
            }else if(tB[j]<tA[i]){
                j++;
                nbDelete++;
            }else{
                i++;
                j++;
            }
        }
        return nbDelete+(tB.length-j)+(tA.length-i);
    }
}
