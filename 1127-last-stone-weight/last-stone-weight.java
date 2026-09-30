class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        int f=0;
        for(int i=0;i<stones.length;i++)
        {
            maxHeap.add(stones[i]);
        }
        if(maxHeap.size()>=2)
        {
        while(!maxHeap.isEmpty())
        {
            int y=maxHeap.poll();
            int x=maxHeap.poll();
            if(x!=y)
            {
                maxHeap.add(y-x);
            }
            if(maxHeap.size()==1)
            {
                f=1;
                break;
            }
        }
        }
        else
        {
            return maxHeap.peek();
        }
        if(f==0)
        {
            return 0;
        }
        else
        {
            return maxHeap.peek();
        }

    }
}