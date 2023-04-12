import java.util.Arrays;

/*Given an array of integers nums sorted in non-decreasing order, 
find the starting and ending position of a given target value.  
If target is not found in the array, return [-1, -1].  
You must write an algorithm with O(log n) runtime complexity. 
Example 1:  Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4] 
Example 2:  Input: nums = [5,7,7,8,8,10], target = 6 Output: [-1,-1] 
Example 3:  Input: nums = [], target = 0 Output: [-1,-1]    
Constraints:  0 <= nums.length <= 105 -109 <= nums[i] <= 109 nums 
is a non-decreasing array. -109 <= target <= 109*/


public class SearchRange {

	public static int[] searchRange(int[]nums, int target) {
		int[] result= {-1,-1};
		if(nums==null || nums.length==0) {
			return result;
		}
		
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(nums[mid]==target) {
			int i=mid;
			int j=mid;
			while(i>=0 && nums[i]==target) {
				i--;
				
			}
			while(j<nums.length && nums[j]==target) {
				j++;
			}
			result[0]=i+1;
			result[1]=j-1;
			break;
			}else if(nums[mid]<target) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums1= {5,7,7,8,8,10};
		int target1=8;
		int[] result1=searchRange(nums1,target1);
		System.out.println(Arrays.toString(result1));
		
		int[] nums2= {5,7,7,8,8,10};
		int target2=6;
		int[] result2=searchRange(nums2,target2);
		System.out.println(Arrays.toString(result2));
		
		int[] nums3= {};
		int target3=0;
		int[] result3=searchRange(nums3,target3);
		System.out.println(Arrays.toString(result3));
	}

}
