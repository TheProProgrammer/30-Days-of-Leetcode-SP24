class Solution 
{
    public int findMin(int[] nums) 
    {
        int curr = nums[0];
        for(int i = 1; i<nums.length; i++)
        {
            if(nums[i]>curr)
                curr = nums[i];
            else
                return nums[i];
        }
        return nums[0];
    }
}