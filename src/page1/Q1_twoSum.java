package page1;
import java.util.HashMap;

public class Q1_twoSum {
	
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i =0;i<nums.length;i++){
            System.out.println(nums[i]+" pos:"+i);
            if(map.containsKey(target-nums[i])) {
            	int pos =  map.get(target-nums[i]);
            	System.out.println("oldpos:"+pos);
            	if(pos!=i) 
            		return new int[] {map.get(target-nums[i]),i};
            }            
            map.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}
