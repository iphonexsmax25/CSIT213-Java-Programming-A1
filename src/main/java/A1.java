import java.util.ArrayList;

/*
Assignment 1 — Practice Questions
Each question is a stand alone function with parameters and a return value.
For every function you will find a question as comments
The first function is provided for your reference with no mark awarded
- A1_Assertion.java is available for testing.
- The first 10 questions Assertion test are available for your reference.
- Work on the rest of the Assertion test to test your assignment.

Message to Students
This assignment is designed to help you revise and become confident with essential Java syntax and problem‑solving. 
While we understand that AI tools can generate answers quickly, your learning comes from attempting each question on your own first.
Please remember:
- Your final exam is handwritten, closed‑book, with no laptop, no IDE, and no AI assistance.
- That means your ability to write Java code from your own understanding is absolutely critical.
- You may score full marks for the assignment with external help, but if you score below 40 marks on the final exam, 
  you will fail the module and will have to repeat it. 
- Copying answers now might feel convenient, but it will not help you when it matters most.
- So, give yourself the chance to truly learn.
- Attempt every question independently first, then use AI only to check, compare, or refine your solution.
- Do it right the first time, your future self will thank you.
*/

public class A1 {

	
	//Q0 - Write a function to return the sum of all numbers in the int array
	public static int Q0(int[] nums) {
		int total = 0;
		for(int i=0;i<nums.length;i++) {
			total+=nums[i];
		}
		return total;
	}
		
	/* =====================================================================
	 *  SECTION A: int[] ARRAY MANIPULATION (Q1 - Q18)
	 * ===================================================================== */

	//Q1 - Write a function to return the sum of all odd numbers in the int array
	public static int Q1(int[] nums) {
		int total = 0;
                for (int i = 0; i < nums.length; i++){
                    if(nums[i] % 2 != 0){
                        total += nums[i];
                    }
                }
		return total;
	}

	//Q2 - Write a function to return the largest value in the int array
	public static int Q2(int[] nums) {
            int max = nums[0];
            for(int i = 1;i < nums.length;i++){
                if(nums [i] > max ){
                    max = nums[i];
                }
            }
		return max;
	}


	//Q3 - Write a function to return a new int array that is the reverse of the input array
	public static int[] Q3(int[] nums) {
            int[] result = new int[nums.length];
            for (int i=0;i<nums.length;i++){
                result[i] = nums[nums.length - 1 - i]; 
                }
            
		return result;
	}

	//Q4 - Write a function to return the index of target in the array, or -1 if it is not found (linear search)
	public static int Q4(int[] nums, int target) {
		for(int i=0;i<nums.length;i++){
                    if(nums[i] == target){
                        return i;
                    }
                }
		return -1;
	}

	

	//Q5 - Write a function to return the product of all elements in the int array
	public static int Q5(int[] nums) {
		int product =1;
                for(int i = 0; i < nums.length; i++){
                    product *= nums[i];
                }
		return product;
	}

	//Q6 - Write a function to return how many times target appears in the array
	public static int Q6(int[] nums, int target) {
		int count = 0;
                for(int i = 0; i < nums.length; i++){
                    if(nums[i] == target){
                        count++;
                    }
                }
		return count;
	}

	//Q7 - Write a function to return a new int array where every element is doubled
	public static int[] Q7(int[] nums) {
            int[] result =new int[nums.length];
            for(int i = 0; i < nums.length; i++){
                result[i]= nums[i] *2;
            }
		return result;
	}

	//Q8 - Write a function to return the second largest distinct value in the array
	public static int Q8(int[] nums) {
		int largest = nums[0];
                for(int i = 1; i < nums.length; i++){
                    largest = nums[i];
                }
                
                int second = Integer.MIN_VALUE;
                for(int i = 0; i < nums.length; i++){
                    if (nums[i] != largest && nums[i] > second){
                        second = nums[i];
                    }
                }
                
		return second;
	}

	//Q9 - Write a function to return the range of the array (largest value minus smallest value)
	public static int Q9(int[] nums) {
            int max = nums[0];
            int min = nums[0];
            for (int i = 1; i < nums.length; i++ ){
                if(nums[i] > max ){
                    max = nums[i];
                }
                if(nums[i] < min){
                    min = nums[i];
                }
            }
		return max - min;
	}

	//Q10 - Write a function to return a new int array sorted in ascending order
	public static int[] Q10(int[] nums) {
            int [] sorted = nums.clone();
            for (int i = 0; i < sorted.length-1; i++){
                for(int j = 0; j > sorted.length-1-i; j++){
                    if(sorted[j] > sorted[j+1]){
                        int temp = sorted[j];
                        sorted[j] = sorted[j+1];
                        sorted[j+1] = temp;
                    }
            }
            }
		return sorted;
	}

	//Q11 - Write a function to return the number of distinct (unique) values in the array
	public static int Q11(int[] nums) {
            int count =0;
            for ( int i = 0; i < nums.length; i++){
                boolean seenBefore = false;
                for (int j = 0; j < i; j++){
                    if(nums[j] == nums[i]){
                        seenBefore = true;
                        break;
                    }
                    if(seenBefore){
                        
                    }else {
                        count++;
                    }
                }
            }

		return count;
	}


	//Q12 - Write a function to return a new int array rotated one place to the right
	//      e.g. {1,2,3,4} becomes {4,1,2,3}
	public static int[] Q12(int[] nums) {
            int[] result = new int[nums.length];
            if(nums.length == 0){
              return  result;
            }
            result[0] =nums[nums.length - 1];
            for(int i = 1; i < nums.length; i++){
                result[i] = nums [i-1];
            }

		return result;
	}


	/* =====================================================================
	 *  SECTION B: STRING MANIPULATION (Q19 - Q34)
	 * ===================================================================== */

	//Q13 - Write a function to return the number of vowels (a, e, i, o, u) in the string
	public static int Q13(String s) {
            int count= 0;
            for(int i = 0; i < s.length(); i++){
                char c = Character.toLowerCase(s.charAt(i));
                if(c =='a' || c == 'e' || c== 'i' || c== 'o' || c== 'u'){
                    count++;
                }
            }

		return 0;
	}

	//Q14 - Write a function to return the reverse of the string
	public static String Q14(String s) {
            String result ="";
            for(int i = s.length()-1; i <= 0 ; i-- ){
                result += s.charAt(i);
            }
		return result;
	}

	//Q15 - Write a function to return true if the string is a palindrome, otherwise false
	public static boolean Q15(String s) {
            int n = s.length();
            for(int i = 0; i < n / 2; i++){
                if(s.charAt(i) != s.charAt(n - 1 - i)){
                    return false;
                }
            }
		return true;
	}


	//Q16 - Write a function to return the string with every space replaced by an underscore '_'
	public static String Q16(String s) {
            String result = "";
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if (c == ' '){
                    result += '_' ;
            } else{
                    result += c;
                }
            }

		return result;
	}

	//Q17 - Write a function to return the number of uppercase letters in the string
	public static int Q17(String s) {
            int count = 0;
            for(int i = 0;i < s.length(); i++) {
                if(Character.isUpperCase(s.charAt(i))) {
                    count++;
                }
	    }
            return count;
	}

	//Q18 - Write a function to return the string with all vowels removed
	public static String Q18(String s) {
            String result = "";
            for(int i = 0; i < s.length(); i++){
                char c = Character.toLowerCase(s.charAt(i));
                if ( c!='a' && c!='e' && c!='i' && c!= 'o' && c!= 'u' ){
                    result += s.charAt(i);
                }
            }

		return result;
	}

	//Q19 - Write a function to return true if the two strings are anagrams of each other, otherwise false
	//      (an anagram uses exactly the same letters the same number of times)
	public static boolean Q19(String a, String b) {
            if(a.length() != b.length()){
                return false;
            }
            int[] counts = new int[256];
            for(int i = 0; i < a.length(); i++){
                counts[a.charAt(i)]++;
                counts [b.charAt(i)]--;
            }
            for(int i = 0; i < counts.length; i++){
                if(counts[i] != 0 ){
                    return false;
                }
            }

		return true;
	}

	//Q20 - Write a function to return the first character that does not repeat in the string
	//      e.g. "swiss" returns 'w'. Return a space ' ' if every character repeats.
	public static char Q20(String s) {
            for(int i = 0; i < s.length(); i++){
                int count = 0;
                for(int j = 0; j < s.length(); j++){
                    if(s.charAt(j) == s.charAt(i)){
                        count++;
                    }
                    if (count ==1){
                        return s.charAt(i);
                    }
                }
            }

		return ' ';
	}

	//Q21 - Write a function to return the string in title case
	//      (the first letter of each word is uppercase, the rest are lowercase)
	public static String Q21(String s) {
            String result = "";
            boolean startOfWord = true;
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == ' '){
                    result += c;
                    startOfWord = true; 
                } else if(startOfWord){
                    result += Character.toUpperCase(c);
                    startOfWord = false;
                } else{
                    result += Character.toLowerCase(c);
                }
            }

		return result;
	}

	//Q22 - Write a function to return the character that appears most often in the string
	//      (if there is a tie, return the one that reaches the highest count first)
	public static char Q22(String s) {
		char best = s.charAt(0);
		int bestCount = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			int count = 0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)==c) {
					count++;
				}
			}
			if(count>bestCount) {
				bestCount = count;
				best = c;
			}
		}
		return best;
	}

	//Q23 - Write a function to return how many times the substring sub appears in s (non-overlapping)
	public static int Q23(String s, String sub) {
            int count = 0;
            int nextAllowed = 0;
            for(int i = 0; i <= s.length() - sub.length(); i++){
                if( i <= nextAllowed && s.substring(i, i+ sub.length()).equals(sub)){
                    count++;
                    nextAllowed = i + sub.length();
                }
            }
		return count;
	}

	//Q24 - Write a function to return true if the string contains only digit characters (0-9), otherwise false
	//      (an empty string should return false)
	public static boolean Q24(String s) {
            if(s.length() == 0){
                return false;
            }
            for(int i = 0; i <= s.length(); i++){
                char c = s.charAt(i);
                if( c < '0' || c > '9'){
                    return false;
                }
            }

		return true;
	}

	//Q25 - Write a function to return the string with duplicate characters removed, keeping the first occurrence
	//      e.g. "banana" returns "ban"
	public static String Q25(String s) {
            String result = "";
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                boolean seenBefore = false;
                for(int j = 0; j< i; j++){
                    if(s.charAt(j) == c){
                        seenBefore = true;
                        break;
                    }
                }
                if(!seenBefore){
                    result += c;
                }
            }

		return result;
	}


	/* =====================================================================
	 *  SECTION C: NUMBERS, LOOPS AND IF/ELSE (Q35 - Q44)
	 * ===================================================================== */

	//Q26 - Write a function to return true if n is a prime number, otherwise false
	public static boolean Q26(int n) {
	
		return false;
	}

	//Q27 - Write a function to return the factorial of n (n! = 1 * 2 * 3 * ... * n). Assume n >= 0.
	public static int Q27(int n) {

		return 0;
	}

	//Q28 - Write a function to return the nth Fibonacci number where fib(0)=0, fib(1)=1
	public static int Q28(int n) {

		return 0;
	}

	//Q29 - Write a function to return the sum of the digits of a positive integer n
	public static int Q29(int n) {

		return 0;
	}

	//Q30 - Write a function to return how many digits are in a positive integer n
	public static int Q30(int n) {

		return 0;
	}

	//Q31 - Write a function to return the integer formed by reversing the digits of a positive integer n
	//      e.g. 1234 returns 4321
	public static int Q31(int n) {

		return 0;
	}

	//Q32 - Write a function to return true if year is a leap year, otherwise false
	//      (a leap year is divisible by 4, except century years which must be divisible by 400)
	public static boolean Q32(int year) {

		return false;
	}

	//Q33 - Write a function to return the greatest common divisor (GCD) of two positive integers a and b
	public static int Q33(int a, int b) {

		return 0;
	}

	//Q34 - Write a function to return how many multiples of 3 there are from 1 to n (inclusive)
	public static int Q34(int n) {

		return 0;
	}


	/* =====================================================================
	 *  SECTION D: ArrayList MANIPULATION (Q45 - Q49)
	 * ===================================================================== */

	//Q35 - Write a function that takes an int array and returns an ArrayList<Integer> containing only the even numbers
	public static ArrayList<Integer> Q35(int[] nums) {

		return null;
	}

	//Q36 - Write a function to return the sum of all numbers in an ArrayList<Integer>
	public static int Q36(ArrayList<Integer> list) {

		return 0;
	}

	//Q37 - Write a function to return a new ArrayList<Integer> with duplicates removed, keeping the original order
	public static ArrayList<Integer> Q37(ArrayList<Integer> list) {

		return null;
	}

	//Q38 - Write a function to return a new ArrayList<Integer> containing only the elements greater than threshold
	public static ArrayList<Integer> Q38(ArrayList<Integer> list, int threshold) {

		return null;
	}

	//Q39 - Write a function to return the largest number in an ArrayList<Integer>
	public static int Q39(ArrayList<Integer> list) {

		return 0;
	}


	/* =====================================================================
	 *  SECTION E: 2D ARRAY
	 * ===================================================================== */

	//Q40 - Write a function to return the sum of all elements in a 2D int array (a grid)
	public static int Q40(int[][] grid) {

		return 0;
	}

	//Q41 - Write a function to return the sum of all elements in a given row of the grid
	public static int Q41(int[][] grid, int row) {

		return 0;
	}

	//Q42 - Write a function to return the sum of all elements in a given column of the grid
	public static int Q42(int[][] grid, int col) {

		return 0;
	}

	//Q43 - Write a function to return the largest value in the whole 2D array
	public static int Q43(int[][] grid) {

		return 0;
	}

	//Q44 - Write a function to return the sum of the main diagonal of a square grid
	//      (the main diagonal runs from the top-left corner to the bottom-right corner)
	public static int Q44(int[][] grid) {

		return 0;
	}

	//Q45 - Write a function to return the sum of the anti-diagonal of a square grid
	//      (the anti-diagonal runs from the top-right corner to the bottom-left corner)
	public static int Q45(int[][] grid) {

		return 0;
	}

	//Q46 - Write a function to return how many times target appears in the 2D array
	public static int Q46(int[][] grid, int target) {

		return 0;
	}

	//Q47 - Write a function to return an int array where each element is the sum of that row in the grid
	public static int[] Q47(int[][] grid) {

		return new int[]{0};
	}

	//Q48 - Write a function to return an int array where each element is the largest value in that row
	public static int[] Q48(int[][] grid) {

		return new int[]{0};
	}

	//Q49 - Write a function to return the transpose of a rectangular grid
	//      (the transpose turns rows into columns, so element [r][c] becomes [c][r])
	public static int[][] Q49(int[][] grid) {

		return new int[][] {{0}};
	}

	//Q50 - Write a function to return true if the grid is rectangular (every row has the same length),
	//      otherwise false
	public static boolean Q50(int[][] grid) {

		return false;
	}

}
