class ErrorMsg {
	String msgs[] = {
		"Output Error",
		"Input Error",
		"Haven't empty space",
		"Out of range"
	};

	String getErrorMsg(int i) {
		if(i>=0 & i<msgs.length)
			return msgs[i];
		else
			return "Error unknown";
	}
}

class ErrMsg {
	public static void main(String[] args) {
		ErrorMsg err = new ErrorMsg();

		System.out.println(err.getErrorMsg(2));
		System.out.println(err.getErrorMsg(0));
	}
}