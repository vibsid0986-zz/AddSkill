
public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = "A man, a plan, a canal: Panama";
		boolean flag = isPalindrome(ans);
		System.out.println(flag);
	}

	private static boolean isPalindrome(String ans) {
		int i = 0;
		int j = ans.length() - 1;
		boolean flag = true;
		while (i < j && flag) {
			int c1 = ans.charAt(i);
			int c2 = ans.charAt(j);
			if ((c1 >= 65 && c1 <= 90) || (c1 <= 122 && c1 >= 97) || (c1 <= 57 && c1 >= 48)) {
				if ((c2 >= 65 && c2 <= 90) || (c2 <= 122 && c2 >= 97) || (c2 <= 57 && c2 >= 48)) {
					String s1 = ans.charAt(i) + "";
					String s2 = ans.charAt(j) + "";
					if (s1.equalsIgnoreCase(s2)) {
						i++;
						j--;
					} else {
						flag = false;
					}
				} else {
					j--;
				}
			} else {
				i++;
			}
		}
		return flag;
	}
}
