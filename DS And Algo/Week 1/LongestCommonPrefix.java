
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = { "ab", "a" };
		String res = LongestCommonPrefix(strs);
		System.out.println(res);
	}

	private static String LongestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		String res = "";
		String first = strs[0];
		for (int j = 0; j < first.length(); j++) {
			for (int i = 1; i < strs.length; i++) {
				if (j >= strs[i].length() || strs[i].charAt(j) != first.charAt(j)) {
					return res;
				}
			}
			res = res + first.charAt(j);
		}
		return res;
	}

}
