package RandomCP;

public class InjectNumber {

    public static void main(String [] args){
        int test1 = 123;
        int test2 = 765;
        int test3 = 890;
        int test0 = 0000;
        int test = -123;
        System.out.println(getNewNumber(test1));
        System.out.println(getNewNumber(test2));
        System.out.println(getNewNumber(test3));
        System.out.println(getNewNumber(test0));
        System.out.println(getNewNumber(test));
    }

    public static int getNewNumber(int number){
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        int i = (number >= 0)? 0:1;
        while(i<sb.length() && sb.charAt(i) - '0' > 5){
            i++;
        }
        sb.insert(i,'5');
        return Integer.parseInt(sb.toString());
    }

}
