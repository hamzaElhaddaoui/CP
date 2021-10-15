package RandomCP;

public class FindingThePositionAtN {

    public static void main(String [] args){
        System.out.println(findPosition(2147483647));
    }

    public static int findPosition(int n){
        int position = 0;
        int s1 = 1;
        position += s1;
        int s2 = s1;
        s1 = -2;
        position += s1;
        n -=2 ;

        for (int i = 0; i < n; i++) {
            int tmp = s1;
            s1 -= s2;
            s2 = tmp;
            position += s1;
        }

        return position;
    }
}
