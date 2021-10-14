package AlgorithmesTri;

public class TriRapide {

    public static void main(String [] args){
        int [] arrayToSort = new int[]{6,19,18,1,15,17,20,3,8,12,11,16,7,13,14,5,10,2,4,9};

        processTriRapide(arrayToSort, 0, arrayToSort.length);

        for (int i = 0; i < arrayToSort.length ; i++) {
            System.out.print(arrayToSort[i]+"  ");
        }
    }

    public static void processTriRapide(int [] arrayToSort, int startIndex, int length){
        if(length < 2)
            return;

        int pivot = arrayToSort[length-1];
        int mur = startIndex;
        int courant = mur;
        int tmp;

        while (courant < length){
            if (arrayToSort[courant] <= pivot){
                if(mur != courant){
                    tmp = arrayToSort[courant];
                    arrayToSort[courant] = arrayToSort[mur];
                    arrayToSort[mur] = tmp;
                }
                mur++;
            }
            courant++;
        }
        //processTriRapide(arrayToSort , startIndex , mur);
        //processTriRapide(arrayToSort, mur, courant);
    }
}
