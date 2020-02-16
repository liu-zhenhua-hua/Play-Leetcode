/*
* @Author: Tony Liu
* @Date:   2020-02-16 22:40:01
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-16 22:50:33
*/
#include<vector>

using namespace std;

class Solution{
public:
	vector<int> twoSum(vector<int>& nums, int target){
		for(int i=0; i< nums.size(); i++){
			for(int j= i+1;i<nums.size();j++)
				if(nums[j] = target - nums[i])
					return {i,j};		
		}
		return {};
	}
}