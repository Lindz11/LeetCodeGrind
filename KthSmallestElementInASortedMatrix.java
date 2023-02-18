class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> elements = new ArrayList<>(); 
        int row = matrix.length; 
        int col = matrix[0].length;  
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                elements.add(matrix[i][j]);
            }
        }

        Collections.sort(elements); 
        return elements.get(k - 1); 
    }
}
