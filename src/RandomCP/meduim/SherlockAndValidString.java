package RandomCP.meduim;


import java.util.*;

public class SherlockAndValidString {

    public static void main(String [] args){
        System.out.println(isValidString("aabbcc"));
    }

    public static String isValidString(String s) {
        int[] frequenceCaracter = new int[26];

        for (int i = 0; i < s.length(); i++) {
            frequenceCaracter[s.charAt(i) - 'a']++;
        }

        int cmp = 0;
        Map<Integer, Integer> nbOccrenceDeFrequence = new HashMap<>();

        for (int i = 0; i < frequenceCaracter.length; i++) {
            if(frequenceCaracter[i]!=0){
                nbOccrenceDeFrequence.putIfAbsent(frequenceCaracter[i],0);
                nbOccrenceDeFrequence.put(frequenceCaracter[i],nbOccrenceDeFrequence.get(frequenceCaracter[i])+1);
            }
        }

        if (nbOccrenceDeFrequence.size() > 2) {
            return "NO";
        }else if(nbOccrenceDeFrequence.size()==1){
            return "YES";
        }
        else {
            Set<Integer> keys = nbOccrenceDeFrequence.keySet();
            if (keys.contains(1) && nbOccrenceDeFrequence.get(1) == 1) {
                return "YES";
            }
            Integer[] arrayKeys = keys.toArray(new Integer[keys.size()]);
            if (Math.abs(arrayKeys[0] - arrayKeys[1]) == 1) {
                if (nbOccrenceDeFrequence.get(Math.max(arrayKeys[0], arrayKeys[1])) == 1) {
                    return "YES";
                }else{
                    return "NO";
                }
            } else {
                return "NO";
            }
        }
    }
}
