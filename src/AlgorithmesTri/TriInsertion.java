package AlgorithmesTri;

//http://lwh.free.fr/pages/algo/tri/tri_insertion.html
public class TriInsertion {
    public static void main(String [] agrs){
        int [] tmpTab = new int[]{6,19,18,1,15,17,20,3,8,12,11,16,7,13,14,5,10,2,4,9};
        processTriInsertion(tmpTab);
        for (int i = 0; i < tmpTab.length; i++) {
            System.out.print(tmpTab[i]+"   ");
        }
    }
    // place n'eme element dans la n'eme iteration
    public static void processTriInsertion(int [] tabToSort){
        for (int i = 1; i < tabToSort.length ; i++) {
            int tmp = tabToSort[i];
            int j = i;
            for (; j > 0 && tabToSort[j-1]> tmp ; j--) {
                tabToSort[j]=tabToSort[j-1];
            }
            tabToSort[j]=tmp;
        }
    }
}
