public class Q2_StartEndPosition {
    public static int[] searchRange(int[] nums, int target) {
        int left = leftIdx(nums, target);
        int right = rightIdx(nums, target);
        return new int[]{left, right};
    }
    public static int leftIdx(int[] nums, int target) {
        int idx = -1, low = 0, high = nums.length-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            // check in left array
            if(nums[mid] == target) {
                idx = mid;
                high = mid-1;
            } else if(nums[mid] < target) {
                low = mid+1;
            } else {
                high = mid - 1;
            }
        }
        return idx;
    }
    public static int rightIdx(int[] nums, int target) {
        int idx = -1, low = 0, high = nums.length-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            // check in right array
            if(nums[mid] == target) {
                idx = mid;
                low = mid+1;
            } else if(nums[mid] < target) {
                low = mid+1;
            } else {
                high = mid - 1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println(result[0] +" "+ result[1]);
    }
}
