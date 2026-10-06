class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]=new int[nums.length];
        int leftProduct=1;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
               {
                res[i]=1;
               }
               else
               {
                 leftProduct*=nums[i-1];
                  res[i]=leftProduct;
               }
        }
        int rightProduct=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            res[i]=res[i]*rightProduct;
            rightProduct*=nums[i];
        }
        return res;
    }
}