/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/

class Solution {
    public static void main(String args[]){
       int nums[]={3,5,8,9,10};
       int target=8;
       int[] result=twoSum(nums,target);
       System.out.println(result[0] + " " + result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int indices[]=new int[2];
        for(int i=0; i<nums.length; i++){
          for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                indices[0]=i;
                indices[1]=j;
                return indices;
            }
          }
        }
        return null;
    }
}
