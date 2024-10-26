//Problem 3: (https://leetcode.com/problems/find-peak-element/)
//A peak element is an element that is greater than its neighbors.
//
//Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.
//
//The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
//
//You may imagine that nums[-1] = nums[n] = -∞.
//
//Example 1:
//
//Input: nums = [1,2,3,1] Output: 2 Explanation: 3 is a peak element and your function should return the index number 2. Example 2:
//
//Input: nums = [1,2,1,3,5,6,4] Output: 1 or 5 Explanation: Your function can return either index number 1 where the peak element is 2,

public class problem3 {
    public int findPeakElement(int[] nums) {

        int low=0, high= nums.length-1;
        // int res=-1;

        while(low<high)
        {
            int mid= low+(high-low)/2;
            if(nums[mid] > nums[mid+1])
            {
                high= mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;

    }
}
