class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        x=0
        y=n
        res=list()
        for i in range(0,2*n):
            if i%2==0:
                res.append(nums[x])
                x+=1
            else:
                res.append(nums[y])
                y+=1
        return res
        