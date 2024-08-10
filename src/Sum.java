import java.util.HashMap;
import java.util.Map;
class Sum {
    public int[] twoSum(int[] nums, int target) {
          Map<Integer,Integer> numToIndex =  new HashMap<>();
          for(int i =0;i<=nums.length;i++){
              int complement = target - nums[i];
              if (numToIndex.containsKey(complement)) {

                  return new int[]{numToIndex.get(complement),i};
              }
              numToIndex.put(nums[i],i);
          }
          return new int[]{};

    }

    public static void main(String[] args) {
        Sum ts = new Sum();
        int [] result1 = ts.twoSum(new int[]{2,7,11,15},9);
        System.out.println("["+result1[0]+","+result1[1]+"]");
        int [] result2 = ts.twoSum(new int []{3,2,4},6);
        System.out.println("["+result2[0]+","+result2[1]+"]");
        int[] result3 = ts.twoSum(new int[]{3,3},6);
        System.out.println("["+result3[0]+","+result3[1]+"]");


    }
}
