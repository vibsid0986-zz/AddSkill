
public class AddDigits {

	public static void main(String[] args) {
		int num = 38;
		int res = addDigits(num);
		System.out.println(res);
	}

	private static int addDigits(int num) {
		while (num > 9) {
			int temp1 = num;
			int temp2 = 0;
			while (temp1 != 0) {
				temp2 = temp2 + temp1 % 10;
				temp1 = temp1 / 10;
			}
			num = temp2;
		}

		return num;
	}

}
