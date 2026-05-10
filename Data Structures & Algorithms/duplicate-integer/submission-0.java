class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashMap<Integer,Integer> resMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(resMap.containsKey(nums[i])){
                return true;
            }
            resMap.put(nums[i],1);
            
        }
       return false; 
    }
}