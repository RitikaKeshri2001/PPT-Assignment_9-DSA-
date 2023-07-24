public class Q5_MajorityEle {
    public static int majorityElement(int[] nums) {
        //Moore's voting algorithm
        int count = 0;
        int ele = 0;
        for(int i=0; i<nums.length; i++) {
            if(count == 0) {
                count = 1;
                ele = nums[i];
            } else if(nums[i] == ele) {
                count++;
            } else {
                count--;
            }
        }
        return ele;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println(majorityElement(nums));
    }
}
