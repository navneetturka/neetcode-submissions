class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums.length == 0) return 0;

        // Arrays.sort(nums);

        // int longest = 1;
        // int count = 1;

        // for(int i = 0; i < nums.length - 1; i++){
        //     if(nums[i+1] == nums[i] + 1){
        //         count++;
        //     }
        //     else if(nums[i+1] != nums[i]){
        //         count = 1;
        //     }
        //     longest = Math.max(longest, count);
        // }
        // return longest;

        HashSet<Integer> set= new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        
        for(int i:nums){
            if(!set.contains(i-1)){
               int current=i;
               int count=1;
                while(set.contains(current+1)){
                    count++;
                    current++;
                } 
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
