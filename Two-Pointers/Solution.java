//Problem: Container With Most Water
//Approach: Two Pointers
//Difficulty: Medium
//Time Complexity: O(n)
//Space Complexity: O(1)

public class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int n = height.length;

        int lp = 0, rp = n-1;

        while(lp<rp){
            int w = rp-lp;
            int ht = Math.min(height[lp],height[rp]);
            int currWater = w * ht;
            maxWater = Math.max(currWater,maxWater);

             if(height[lp]<height[rp]){
                lp++;
            }
            else{
                rp--;
            }

        }
        return maxWater;
    }
}
