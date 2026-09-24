class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];
        Map<Integer,Integer> map=new HashMap<>();
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
        List<Integer> list=new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));
        for(int i=0;i<k;i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
}