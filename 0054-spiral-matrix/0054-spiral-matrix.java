class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int strow = 0;
        int endrow = matrix.length - 1;
        int stcol = 0;
        int endcol = matrix[0].length - 1;

        while (strow <= endrow && stcol <= endcol) {

            for (int j = stcol; j <= endcol; j++) {
                ans.add(matrix[strow][j]);
            }

            for (int i = strow + 1; i <= endrow; i++) {
                ans.add(matrix[i][endcol]);
            }

            if (strow < endrow) {
                for (int j = endcol - 1; j >= stcol; j--) {
                    ans.add(matrix[endrow][j]);
                }
            }

            if (stcol < endcol) {
                for (int i = endrow - 1; i > strow; i--) {
                    ans.add(matrix[i][stcol]);
                }
            }

            strow++;
            endrow--;
            stcol++;
            endcol--;
        }

        return ans;
    }
}