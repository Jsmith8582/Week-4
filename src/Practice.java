
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//String Building video exercise
		
		String firstName = "Josh";
		String lastName = "Smith";
		System.out.println(firstName + lastName);
		
		String word = "What's up?";		
		System.out.println(multiplyString(word, 4));
		
		int[] values = {5, 6, 8, 11, 17, 50};
		System.out.println(sumArray(values));
		
		int [] numberList = {10, 15, 11, 19, 20, 17, 9, 14};
		System.out.println(greaterThan100(numberList));
		System.out.println(numberList.length);
		
		int sum = 0;
		for (int i = 0; i < numberList.length; i++) {
			sum += numberList.length;
		}
		System.out.println(sum);
		

		
		
		
		
		
		
		
	}

		public static int sumArray(int[] numeros) {
			int sum = 0;
			for (int numero : numeros) {
				sum += numero;
			}
			return sum;
		}
	
		public static String multiplyString(String str, int num) {
			String result = "";
			for (int i = 0; i < num; i++) {
				result += str;
			}
			return result;
		}
	
		/*Write a method that takes two arrays of double and 
		 * returns true if 
		 * the average of the elements in the first array 
		 * is greater than the 
		 * average of the elements in the second array.
		 * 
		 */
		
		
		
		
		public static boolean greaterThan100(int[] numbers) {
			int sum = 0;
			for (int i = 0; i < numbers.length; i++) {
				sum += numbers[i];
			}
			if (sum > 100) {
				return true;
			} else {
				return false;
			}
		}
		
		
}
