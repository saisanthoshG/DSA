class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        boolean findStartIndex = false;

        int startIndex = fbsearch(nums, target, findStartIndex=true);
        int endIndex = fbsearch(nums, target, findStartIndex = false);

        ans[0] = startIndex;
        ans[1] = endIndex;
        return ans;

    }

    public int fbsearch(int[] nums, int target, boolean findStartIndex){
        int start =0;
        int end = nums.length-1;
        int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid +1;
            }else{
                ans=mid;
                if(findStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }













        
    //     int[] range = {-1,-1};
    //     boolean firstOccurence;
    //     int last=-1;
    //     int first = findIndex(nums,target,firstOccurence=true);
    //     if(first!=-1){
    //      last =  findIndex(nums,target,firstOccurence=false);
    //     }
    //     range[0]=first;
    //     range[1]=last;
    //     return range;

    // }
    // public int findIndex(int[] nums, int target, boolean firstOccurence){
    //     int s=0;
    //     int e=nums.length-1;
    //     int ans=-1;
    //     while(s<=e){
    //     int mid = s+(e-s)/2;

    //     if(target<nums[mid]){
    //         e=mid-1;
    //     }else if(target>nums[mid]){
    //         s=mid+1;
    //     }else{
    //         ans = mid;
    //         if(firstOccurence){
    //             e=mid-1;
    //         }else{
    //             s=mid+1;
    //         }
    //     }
    //     }
    //     return ans;
    // }
    
}