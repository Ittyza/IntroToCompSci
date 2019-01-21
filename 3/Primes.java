/* 
Assignment number : 	3.1
File Name : 			Primes.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class Primes {
	public static void main(String[] args) {
		
		int N = Integer.parseInt(args[0]) + 1;
		int runner = 2;
		int i = 2;
		
		// Build array that is size N big
		boolean[] isPrime = new boolean[N];
		
		// Set all values of the array to true
		for (; i < N; i++) {
			isPrime[i] = true;
		}
		
		// Sets all divisors within the array as false to find primes
		while (runner < N) {
			
			for (i = 2 * runner; i < N; i = i + runner) {
				isPrime[i] = false;
			}
			runner++;
		}
		for (i = 0; i < N; i++) {
			
			if (isPrime[i] == true) {
				System.out.println(i);
			}
		}
	}
}