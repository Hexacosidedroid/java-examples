class StringSwitch {
	public static void main(String[] args) {
		String command = "cancel";

		switch(command) {
			case "connect":
				System.out.println("Connection");
				break;
			case "cancel":
				System.out.println("Cancel");
				break;
			case "disconnect":
				System.out.println("Disconnect");
				break;
			default:
				System.out.println("not correct command");
				break;
		}
	}
}