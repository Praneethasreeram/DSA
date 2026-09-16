class Solution {
    // public int fact(int n)
    // {
    //     if(n==1 || n==0)
    //     {
    //         return 1;
    //     }
    //     else
    //     {
    //         return n*fact(n-1);
    //     }
    // }
    public int uniquePaths(int m, int n) 
    {
        int l=m+n-2;
        

        
        int r=Math.min(m-1,n-1);
    
        long res=1;
       
        for(int i=1;i<=r;i++)
        {
            
            res=res * (l-r+i)/i;

        
        }
        return(int) res;
    }
}