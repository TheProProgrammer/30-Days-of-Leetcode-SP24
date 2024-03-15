class Solution 
{
    public boolean isPerfectSquare(int num) 
    {
        if(num == 1)
            return true;
        
        int start = 1;
        int end = num;
       
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(mid*mid==num)
                return true;
            else if(mid<num/mid )
                start  = (int)mid+1;
            else
                end = (int)mid-1;
        }
        
        return false;
    }
}