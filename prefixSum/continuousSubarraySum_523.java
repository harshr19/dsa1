import java.util.HashMap;
//import java.util.Map; 
public class continuousSubarraySum_523{
    
    public Boolean main(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int prefSum = 0;
        for(int i = 0; i < n; i++){
            prefSum += nums[i];
            int rem = prefSum % k;
            if(!map.containsKey(rem)){
                map.put(rem,i);
            }
            else if(i - map.get(rem) > 1) return true;
        }
        return false;

    }
    
}