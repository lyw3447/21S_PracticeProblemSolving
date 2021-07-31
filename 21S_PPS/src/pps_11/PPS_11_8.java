package pps_11;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

public class PPS_11_8 {
	public boolean search(int[] nums, int target) {
		if (nums == null || nums.length < 1)
			return false;
		int left = 0, right = nums.length - 1;
		int mid;
		while (left <= right) {
			mid = left + (right - left) / 2;
			if (target == nums[mid]) {
				return true;
			}
			if (nums[mid] > nums[left]) {
				if (target < nums[mid] && target >= nums[left])
					right = mid - 1;
				else
					left = mid + 1;
			} else if (nums[mid] < nums[left]) {
				if (target > nums[mid] && target <= nums[right])
					left = mid + 1;
				else
					right = mid - 1;
			} else {
				if (nums[right] > nums[mid] && target > nums[mid] && target <= nums[right])
					left = mid + 1;
				else {
					for (int i = left; i <= right; i++)
						if (target == nums[i]) {
							return true;
						}
					break;
				}
			}
		}
		return false;
	}

}
