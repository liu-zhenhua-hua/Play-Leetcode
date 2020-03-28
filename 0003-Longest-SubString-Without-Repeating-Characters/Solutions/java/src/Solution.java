class Solution{
	public int lengthOfLongestSubstring(String s){
		int[] count = new int[128];
		int i = 0;
		int j = 0;
		

	}

	public boolean allUnique(String s,int start,int end){

		Set<Character> set = new HashSet<>();
		for(int i=start; i< end; i++){

			Character ch = s.charAt(i);
			if(set.contains(ch)) return false;
		}

		return true;
	}
}
