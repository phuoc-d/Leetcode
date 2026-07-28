import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        int curr = 0;
        for (int i = 1 ; i < nums.length ; i ++ ){
            curr = target - nums[i];
            System.out.println(curr);
            if ( map.containsKey(curr) ){
                return new int[]{map.get(curr), i};
            }
            map.put(nums[i], i);
        }
        System.out.println(map);
        return null;
    }
}