class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int sr=0;
        int sc=0;
        int er=matrix.length -1;
        int ec=matrix[0].length -1;
        
        while(sr<=er && sc<=ec){
            for(int j=sc;j<=ec;j++){
                ans.add(matrix[sr][j]);
            }
             for(int j=sr+1;j<=er;j++){
                ans.add(matrix[j][ec]);
            }
            if(sr<er){
             for(int j=ec-1;j>=sc;j--){
                ans.add(matrix[er][j]);
            }
            }
            if(sc<ec){
            for(int j=er-1;j>=sr+1;j--){
                ans.add(matrix[j][sc]); 
            }
            }
            sr++;
            sc++;
            er--;
            ec--;  
        }
        return ans;
    }
}