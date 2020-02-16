/*
* @Author: Tony Liu
* @Date:   2020-02-16 22:52:34
* @Modified by:   Tony Liu
* @Last Modified time: 2020-02-16 22:58:50
*/

#include<vector>
#include<unordered_map>

using namespace std;

class Solution{
public:
	vector<int> twoSum(vector<int>& nums, int target){
		unordered_map<int,int> record;
		for(int i=0; i<nums.size(); i++)
			record[nums[i]] = i;

		for(int i=0;i<nums.size();i++){
			unordered_map<int,int>::iterator iter = record.find(target - nums[i]);
			if(iter != record.end() && iter->second !=i)
				return {i, iter->second};
		}

		throw invalid_argument("No Solution for Two Sum !");
	}
}