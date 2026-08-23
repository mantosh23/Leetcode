class Solution {
    public int lowerBound(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int ans = nums.length;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    public int upperBound(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int ans = nums.length;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] > target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int lower = lowerBound(nums, target);

        // target doesn't exist
        if (lower == nums.length || nums[lower] != target) {
            return new int[]{-1, -1};
        }

        int upper = upperBound(nums, target);

        return new int[]{lower, upper - 1};
    }
}