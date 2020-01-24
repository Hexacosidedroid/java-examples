class StrOps {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = new String(str1);
		String str3 = "java1";
		int result, idx;
		char ch;

		System.out.println("str1: " + str1.length());

		for (int i=0; i<str1.length(); i++) {
			System.out.print(str1.charAt(i));
		}
		System.out.println();

		if (str1.equals(str2)) {
			System.out.println("str1 = str2");
		}
		else
		{
			System.out.println("str1 != str2");
		}
		if (str1.equals(str3)) {
			System.out.println("str1 = str3");
		}
		else
		{
			System.out.println("str1 != str3");
		}

		result = str1.compareTo(str3);
		if (result == 0) System.out.println("str1 = str3");
		else if(result < 0) System.out.println("str1 < str3");
			else System.out.println("str1 > str3");

		str2 = "one two";

		idx = str2.indexOf("one");
		System.out.println("Index = " + idx);
	}
}