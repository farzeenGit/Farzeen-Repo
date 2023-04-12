import static org.junit.Assert.*;

import org.junit.Test;

public class SearchRangeTest {

	@Test
	public void testSearchRange() {
		int[] nums1= {5,7,7,8,8,10};
		int target1=8;
		int[] expected= {3,4};
		int[] result1=SearchRange.searchRange(nums1,target1);
		assertArrayEquals(expected, result1);
	}

	@Test
	public void testSearchRange2() {
		int[] nums1= {5,7,7,8,8,10};
		int target1=6;
		int[] expected= {-1,-1};
		int[] result1=SearchRange.searchRange(nums1,target1);
		assertArrayEquals(expected, result1);
	}

	@Test
	public void testSearchRange3() {
		int[] nums1= {};
		int target1=0;
		int[] expected= {-1,-1};
		int[] result1=SearchRange.searchRange(nums1,target1);
		assertArrayEquals(expected, result1);
	}

}
