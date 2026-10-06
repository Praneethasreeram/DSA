class NumArray {

    int pre[];
    public NumArray(int[] nums) {
        pre=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            pre[i]=pre[i-1]+nums[i];
        }
        
    }
    
    public int sumRange(int left, int right) {

       int res=0;
       for(int i=right;i>=left;i--)
       {
         if(i!=0)
         {
          res=res+pre[i]-pre[i-1];
         }
         else
         {
            res+=pre[i];
         }
       }
        return res;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */