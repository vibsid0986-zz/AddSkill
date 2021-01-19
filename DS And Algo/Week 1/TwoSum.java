import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int target = scn.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		int res[] = new int[2];
		for (int i = 0; i < n; i++) {
			if (map.containsKey(target - arr[i])) {
				res[0] = i;
				res[1] = map.get(target - arr[i]);
				break;
			} else {
				map.put(arr[i], i);
			}
		}
		for (int i = 0; i < 2; i++) {
			System.out.println(res[i]);
		}
		scn.close();
	}

}
