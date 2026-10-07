class Solution {
    public void dfs(int[][] image,int i,int j,int original,int color)
    {
        if(i<0 || i==image.length || j<0 || j==image[0].length)
        { 
              return;
        }
        else
        {
            if(image[i][j]==original)
            {
                image[i][j]=color;
            }
            else
            {
                return;
            }
            dfs(image,i-1,j,original,color);
            dfs(image,i+1,j,original,color);
            dfs(image,i,j-1,original,color);
            dfs(image,i,j+1,original,color);
            
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)
        {
            return image;
        }
        else
        {
            dfs(image,sr,sc,image[sr][sc],color);
            return image;
        }
        
    }
}