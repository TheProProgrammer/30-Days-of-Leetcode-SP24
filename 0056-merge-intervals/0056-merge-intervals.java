class Solution {
    public int[][] merge(int[][] intervals) 
    {
        if (intervals.length <= 1) 
            return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) 
        {
            int[] nextInterval = intervals[i];

            if (currentInterval[1] >= nextInterval[0]) 
            
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            else 
            {
                merged.add(currentInterval);
                currentInterval = nextInterval;
            }
        }

        merged.add(currentInterval);
    
        return merged.toArray(new int[merged.size()][]);
    }
}