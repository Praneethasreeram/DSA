class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        boolean res=true;
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])>2)
            {
                res=false;
                break;
            }
        }
        return res;
    }
}