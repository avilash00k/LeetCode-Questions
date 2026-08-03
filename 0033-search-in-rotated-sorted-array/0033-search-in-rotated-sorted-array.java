class Solution {
    public int search(int[] nums, int target) {
        return sol(nums, target, 0, nums.length-1);
    }
    public static int sol(int arr[], int tar, int st, int end){
        if(st>end) return -1;
        int mid=st+(end-st)/2;
        if(arr[mid]==tar) return mid;
        if(arr[st]<=arr[mid]){
            if(arr[st]<=tar && tar<=arr[mid]){
                return sol(arr, tar, st, mid-1);
            }
            else return sol(arr, tar, mid+1, end);
        }
        else{
            if(arr[mid]<=tar &&tar<=arr[end]){
                return sol(arr, tar, mid+1, end);
            }
            else return sol(arr, tar, st, mid-1);
        }
    }
}