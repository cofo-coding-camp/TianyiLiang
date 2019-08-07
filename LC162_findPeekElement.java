package com.company.Array;

public class LC162_findPeekElement {
    public int findPeakElement(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(lo == hi) break;
            if(nums[mid] < nums[mid+1]){
                lo = mid + 1;
            }else{
                hi = mid;
            }
        }
        return lo;
    }
}
