class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length <= 1)
        return intervals;

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] newInter = intervals[0];
        merged.add(newInter);

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= newInter[1]){
                newInter[1] = Math.max(newInter[1], intervals[i][1]);
            }
            else{
                newInter = intervals[i];
                merged.add(newInter);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}