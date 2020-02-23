/*
* @Author: Tony Liu
* @Date:   2020-02-16 23:04:19
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-23 21:37:24
*/

import java.util.HashMap;


class Solution02{

	public int[] twoSum(int[] nums,int target){

		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
			map.put(nums[i],i);


		for(int i=0; i<nums.length;i++){
			Integer index = map.get(target - nums[i]);
			if(index != null && index != i){
				return new int[] {i,index};
			}
		}

		throw new IllegalArgumentException("No Solution for Two Sum !");
	}

}