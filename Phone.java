class Phone {
	public static void main(String[] args) {
		String numbers[][] = {
			{"Tom", "3124235"},
			{"Mary", "435262"},
			{"John", "3524672"},
			{"Rachel", "453462"},
		};
		int i;

		if(args.length!=1)
			System.out.println("Using: java Phone <name>");
		else {
			for (i=0; i<numbers.length; i++) {
				if(numbers[i][0].equals(args[0])) {
					System.out.println(numbers[i][0] + ": " + numbers[i][1]);
					break;
				}
			}
			if(i == numbers.length)
				System.out.println("Name haven't found");
		}
	}
}