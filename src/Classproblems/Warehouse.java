package Classproblems;

class Result {
    int totalItems;
    int maxRow;
    int maxCol;

    public Result(int totalItems, int maxRow, int maxCol) {
        this.totalItems = totalItems;
        this.maxRow = maxRow;
        this.maxCol = maxCol;
    }

    @Override
    public String toString() {
        return "(" + totalItems + ", (" + maxRow + ", " + maxCol + "))";
    }
}

public class Warehouse {

    public static Result warehouseSummary(int[][] grid) {
        int totalItems = 0;
        int maxItems = -1;
        int maxRow = -1;
        int maxCol = -1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                totalItems += grid[i][j];

                if (grid[i][j] > maxItems) {
                    maxItems = grid[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        return new Result(totalItems, maxRow, maxCol);
    }

    public static void main(String[] args) {
        int[][] grid = {
                {4, 9, 2},
                {7, 1, 6},
                {3, 12, 5}
        };

        System.out.println(warehouseSummary(grid));
    }
}