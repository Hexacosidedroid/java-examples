class StringArrays {
	public static void main(String[] args) {
		String strs[] = {"this", "string", "is", "a", "text"};

		System.out.println("strater: ");
		for (String s: strs)
			System.out.print(s + " ");
		System.out.println("\n");

		strs[2] = "also";
		strs[3] = "text!";

		System.out.println("changer: ");
		for(String s: strs)
			System.out.print(s + " ");
	}
}