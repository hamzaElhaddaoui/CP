package dynamicProgramming;

public class CoinChangeCombinations {

    public static void main(String[] args){
        int sum = 12;
        int [] coins = {1,2,5};
        int comb = calculeCombinations(sum,coins);
        System.out.println(comb);
    }

    public static int calculeCombinations(int n, int [] coins){
        int [] combinations = new int[n+1];
        combinations[0]=1;
        for (int coin: coins) {
            for (int i=0; i<=n ; i++){
                if(coin<=i){
                    combinations[i]+=combinations[i-coin];
                }
            }
        }
        return combinations[n];
    }

}
