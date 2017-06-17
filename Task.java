public class Task {
	public static void main(String[] args) {
		for(int i = 10; i >= 0; i--) {
			if(i ==0) {
				System.out.println("0 is neither even nor odd");
			} else if(i % 2 == 0) {
				System.out.println("i is even: " + i);
			} else {
				System.out.println("i is not even: " + i);
			}
		}
	}
}