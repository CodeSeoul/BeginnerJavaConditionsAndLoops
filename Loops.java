public class Loops {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) { // i++ ==== i = i + 1
			System.out.println("i is " + i);
		}

		int j = 0;
		while(true) {
			System.out.println("j is " + j);
			j++;
			if(j >= 10) {
				break;
			}
		}

		j = 0;
		do {
			System.out.println("second j is " + j);
			j++;
		} while(j < 0);
	}
}