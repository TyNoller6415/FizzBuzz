
public class Main {

	public static void main(String[] args) {
		int counter;
		
		
		for(counter = 0; counter < 100; counter++) {
			
			System.out.println(counter);
			
			if(counter % 3 == 0) {
				System.out.println("fizz");
			}
			if(counter % 5 == 0) {
				System.out.println("buzz");
			}
			if(counter % 15 == 0) {
				System.out.println("fizzbuzz");
			}
			
		}

	}

}
