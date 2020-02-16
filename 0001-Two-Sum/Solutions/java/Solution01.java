/*
* @Author: Tony Liu
* @Date:   2020-02-16 22:24:32
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-16 22:34:04
*/


/**
   Brute Force
   Time Complexity: O(n^2)
*/
class Solution01{

	public int[] twoSum(int[] nums, int target){
		for(int i=0; i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[j] == target - nums[i]){
					return new int[] {i,j};
				}
			}

		}
		throw new IllegalArgumentException("No Solution for two Sum !");
	}
}