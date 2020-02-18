/*
* @Author: Tony Liu
* @Date:   2020-02-17 23:33:15
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-18 23:04:59
*/
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

class Solution03{
	public int[] twoSum(int[] nums,int target){
		Map<Integer,Integer> map = new HashMap<>();

		for(int i=0;i<nums.length;i++){
			int elementKey = target - nums[i];
			if(map.containsKey(elementKey)){
				return new int[] {map.get(elementKey),i};
			}
			map.put(nums[i],i);
		}
		throw new IllegalArgumentException("No Two Sum Solution");
	}
}