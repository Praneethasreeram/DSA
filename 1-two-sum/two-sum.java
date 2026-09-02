class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int array[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int diff=target-nums[i];
            if(map.containsKey(diff))
            {
                array[0]=i;
                array[1]=map.get(diff);
            }
            else
            {
                map.put(nums[i],i);
            }
            
            
        }
        
        return array;
    }
}