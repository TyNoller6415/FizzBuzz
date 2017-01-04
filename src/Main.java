
public class Main {

	public static void main(String[] args) {
		int counter;
		
		
		for(counter = 0; counter < 100; counter++) {
			
			if(counter %15 == 0){
				System.out.println("fizzbuzz");
			} else if(counter %5 == 0) {
				System.out.println("buzz");
			} else if(counter %3 == 0) {
				System.out.println("fizz");
			} else {
				System.out.println(counter);
			}
			
		}

	}

}
