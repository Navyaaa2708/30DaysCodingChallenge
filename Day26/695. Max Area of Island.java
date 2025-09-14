class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows=grid.length,cols=grid[0].length,max=0;
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c]==1) max=Math.max(max,dfs(grid,r,c));
            }
        }
        return max;
    }
    private int dfs(int[][] grid,int r,int c){
        if(r<0||r>=grid.length||c<0||c>=grid[0].length||grid[r][c]==0) return 0;
        grid[r][c]=0;
        return 1+dfs(grid,r+1,c)+dfs(grid,r-1,c)+dfs(grid,r,c+1)+dfs(grid,r,c-1);
    }
}