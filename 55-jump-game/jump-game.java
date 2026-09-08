class Solution {
    public boolean canJump(int[] nums) {
        boolean res=false;
        if(nums.length==1)
        {
            return true;
        }
        if(nums[0]==0)
        {
            return false;
        }
        int maxVal=0;
        for(int i=0;i<nums.length-1;i++)
        {
            maxVal=Math.max(maxVal,i+nums[i]);
            if(i+nums[i]==nums.length-1)
            {
                res=true;
                break;
            }
            if(nums[i]==0 && maxVal>i)
            {
                res=true;
            }
            else if(nums[i]==0 && maxVal<=i)
            {
                res=false;
                break;
            }


        }
        if(maxVal>nums.length-1)
        {
            res=true;
        }
        return res;
    }
}