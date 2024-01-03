package examplesLeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class    TwoSumClass{

    public static void main(String[] args){
     int[] nums_example = {2,7,11,15};
     int target_example = 9;


     System.out.println(
             Arrays.toString(
                     twoSum(nums_example, target_example)
             ));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length; i++){
            int current = nums[i];
            int x = target - current;
            if(map.containsKey(x)){
                return new int[]{map.get(x),i};
            }
            map.put(current,i);
        }
        return null;
    }
}
