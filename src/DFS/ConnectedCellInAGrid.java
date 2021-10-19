package DFS;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ConnectedCellInAGrid {

    public static void main(String [] args)throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int m = Integer.parseInt(bufferedReader.readLine().trim());

            List<List<Integer>> grid = new ArrayList<>();

            IntStream.range(0, n).forEach(i -> {
                try {
                    grid.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .collect(toList())
                    );
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            int res = maxRegion(grid);

            System.out.println(res);

            bufferedReader.close();
    }

    public static int maxRegion(List<List<Integer>> grid){
        boolean [][] tracking = new boolean [grid.size()][grid.get(0).size()];
        int bigRegion = 0;
        for (int i = 0; i < grid.size(); i++){
            for (int j = 0; j < grid.get(0).size(); j++) {
                bigRegion = Math.max(bigRegion, calculeRegion(i, j, grid, tracking));
            }
        }
        return bigRegion;
    }

    public static int calculeRegion(int row, int column, List<List<Integer>> grid, boolean[][] visiteTracking){
        if( row < 0 || column < 0 || row >= grid.size() || column >= grid.get(0).size() || visiteTracking[row][column] || grid.get(row).get(column)== 0 ){
            return 0;
        }else{
            visiteTracking[row][column] = true;
            int cmp = 1;
            cmp += calculeRegion(row-1,column-1,grid,visiteTracking);
            cmp += calculeRegion(row-1, column, grid, visiteTracking);
            cmp += calculeRegion(row-1, column+1, grid, visiteTracking);
            cmp += calculeRegion(row, column-1, grid, visiteTracking);
            cmp += calculeRegion(row, column+1, grid, visiteTracking);
            cmp += calculeRegion(row+1, column-1, grid, visiteTracking);
            cmp += calculeRegion(row+1, column, grid, visiteTracking);
            cmp += calculeRegion(row+1, column+1, grid, visiteTracking);
            return cmp;
        }
    }
}
