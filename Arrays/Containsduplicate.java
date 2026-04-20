//Problem: Contains Duplicate
//Approach: Brute Force
//Time Complexity: O(n^2)
//Space Complexity: O(1)

public class Containsduplicate {
    public boolean containsDuplicate(int[] nums) {

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
            if(nums[i] == nums[j]){
                return true;
            }
            }
        }
        return false;
    }
} 

//problem: Contains Duplicate
//Approach: HashSet
//Time Complexity: O(n)
//Space Complexity: O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>set = new HashSet<>();

        for(int num:nums){
            if(set.contains(num)){
            return true;
        }
        set.add(num);
    }
    return false;
    }
}

