class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int val=0;
        List<Integer> list=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            val=val+nums[i];
            sum=sum-nums[i];
            list.add(nums[i]);
            if(val>sum){
                break;
            }
        }
        return list;
    }
}