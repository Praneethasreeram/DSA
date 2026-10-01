class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            if(minHeap.size()<k)
            {
                minHeap.add(nums[i]);
            }
            else if(minHeap.size()>k)
            {
                int removed=minHeap.poll();
            }
            else
            {
                if(minHeap.peek()<nums[i])
                {
                    int removed=minHeap.poll();
                    minHeap.add(nums[i]);
                }
            }
        }
        return minHeap.peek();
        
    }
}