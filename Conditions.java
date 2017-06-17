public class Conditions {
	public static void main(String[] args) {
		boolean isTrue = true;
		if(isTrue) {
			System.out.println("True is true");
		}

		if(10 > 5) {
			System.out.println("10 is greater than 5");
		} // single line comment
		/* multiline
		comment */
		if(returnTrue()) {
			System.out.println("returnTrue is true");
		}

		if(!returnTrue()) {
			System.out.println("NOT returnTrue is false");
		} else {
			System.out.println("NOT returnTrue was " + 
				"not true");
		}

		if(5 > 10) {
			System.out.println("This will not print");
		} else if(10 > 5) {
			System.out.println("This will print");
		} else {
			System.out.println("This will not print");
		}

		if(true) {
			if(10 > 5) {
				System.out.println("true is true and " +
					"ten is greater than 5");
			} else {
				System.out.println("this won't print");
			}
		}

		int myNumber = 2;
		switch(myNumber) {
			case 1: 
			System.out.println("10 is 1");
			break;
			case 5: 
			System.out.println("10 is 5");
			break;
			case 10: 
			System.out.println("10 is 10");
			break;
			default:
			System.out.println("myNumber was not " +
			"1, 5, or 10");
		}

		if("hi".equals("hi")) {
			System.out.println("This is true");
		}
	}

	public static boolean returnTrue() {
		return true;
	}
}