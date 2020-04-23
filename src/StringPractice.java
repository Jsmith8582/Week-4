
public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName = "Josh";
		String lastName = "Smith";
		System.out.println(firstName + lastName);
		
		String word = "What's up?";		
		System.out.println(multiplyString(word, 4));
		
		int[] values = {5, 6, 8, 11, 17, 50};
		System.out.println(sumArray(values));
		
		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith");
		System.out.println(fullName.toString());
		
		System.out.println(fullName.charAt(5));
//		System.out.println(fullName.deleteCharAt(5));
//		System.out.println(fullName.delete(1, 3));
		
		System.out.println(fullName.indexOf("it"));
		System.out.println(fullName.replace(4, 9, "Thompson"));
		System.out.println(fullName.reverse());
		
		String timesWords = "Hey There!";
		System.out.println(timesStrings(timesWords, 10));
		
		
	}

		public static int sumArray(int[] numeros) {
			int sum = 0;
			for (int numero : numeros) {
				sum += numero;
			}
			return sum;
		}
	
		public static String multiplyString(String str, int num) {
			StringBuilder result = new StringBuilder();
			for (int i = 0; i < num; i++) {
				result.append(str);
			}
			return result.toString();
		}
	
		public static String timesStrings(String str, int num) {
			String results = new String();
			for (int i = 0; i < num; i++) {
				results += str;
			}
			return results;
		}
	

}
