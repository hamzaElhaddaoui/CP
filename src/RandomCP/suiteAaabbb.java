package RandomCP;

public class suiteAaabbb {

    public static void main(String [] args){
        String strToTest = "aaaaaabbbbb";
        String strToTest1 = "aabbaaabb";
        String strToTest2 = "bbbbb a";
        System.out.println(verifyString(strToTest));
        System.out.println(verifyString(strToTest1));
        System.out.println(verifyString(strToTest2));
        System.out.println(validateString(strToTest));
        System.out.println(validateString(strToTest1));
        System.out.println(validateString(strToTest2));
    }

    private static boolean verifyString(String strToTest) {
        boolean isB = false;
        for(int i = 0 ; i<strToTest.length() ; i++){
            if(strToTest.charAt(i)== 'b'){
                isB=true;
            }else if(isB){
                return false;
            }
        }
        return true;
    }

    public static boolean validateString(String strToValidate){
            return (strToValidate.matches("a*b+"))? true: false;
    }
}
