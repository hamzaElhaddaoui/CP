//package DFS;
//
////https://codeforces.com/problemset/problem/580/C
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class kefaAndPark {
//
//    static int nbVertices = 4;
//    static int nbOkCats = 1;
//    static int [] catsInVertex = {1,1,0,0};
//    static int [][] edgesArray = {{1,2},{1,3},{1,4}};
//    static List<Integer> [] adjacentArray = new ArrayList<> [nbVertices];
//    boolean [] visited = new boolean[nbVertices];
//
//    public static void main(String[] args){
//        // create adjacent array
//        for (int i=0; i<edgesArray.length ; i++){
//            adjacentArray[edgesArray[i][0]].add(edgesArray[i][1]);
//            adjacentArray[edgesArray[i][1]].add(edgesArray[i][0]);
//        }
//        int nbRestaurents = calculateNumberOfRestaurents(nbVertices, nbOkCats, catsInVertex, adjacentArray);
//        System.out.println(nbRestaurents);
//    }
//
//    private static int calculateNumberOfRestaurents(int nbVertices, int nbOkCats, int[] catsInVertex, List<Integer>[] edgesArray) {
//
//
//        return 0;
//    }
//
//    private
//}
