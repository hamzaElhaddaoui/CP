package RandomCP.meduim;

import java.util.Stack;

//https://www.hackerrank.com/challenges/balanced-brackets/problem
public class BalancedBrackets {
    public static void main (String [] args){
        System.out.println(isBalanced("{{[[(())]]}}"));
    }

    public static String isBalanced(String s){
        Stack<Character> openedHistory = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if( openedHistory.empty() && (s.charAt(i) == '}'
                    || s.charAt(i) == ')'
                    || s.charAt(i) == ']')){
                return "NO";
            }

            if( s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(' ){
                openedHistory.push(s.charAt(i));
            }
            else if((openedHistory.peek() == '(' && s.charAt(i) != ')')
                    || (openedHistory.peek() == '{' && s.charAt(i) != '}')
                    || (openedHistory.peek() == '[' && s.charAt(i) != ']') ){
                return "NO";
            }else{
                openedHistory.pop();
            }

        }
        if(openedHistory.empty()){
            return "YES";
        }else{
            return "NO";
        }

    }
}
