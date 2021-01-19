
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sarr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(sarr));
	}

	private static int removeDuplicates(int nums[]) {
		if (nums.length == 0) {
			return 0;
		}
		int j = 1, i, k = 0;
		for (i = 0; i < nums.length; i++) {
			while (j < nums.length && nums[i] == nums[j]) {
				j++;
			}
			if (i + 1 < nums.length && j < nums.length) {
				nums[i + 1] = nums[j];
				k = i + 1;
			}
		}
		return k + 1;
	}

}
