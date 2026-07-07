import java.util.ArrayList;
import java.util.Arrays;

public class A1_Assertion {

	public static void main(String[] args) {

		int score = 0;

		// ---------- Q0 ----------
		try {
			int[] nums = { 1, 2, 3, 4 };
			assert A1.Q0(nums) == 10;
			System.out.println("Q0 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q0 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q0 test failed - Exception");
		}

		// ---------- Q1 ----------
		try {
			int[] nums = { 1, 2, 3, 4 };
			assert A1.Q1(nums) == 4;
			System.out.println("Q1 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q1 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q1 test failed - Exception");
		}

		// ---------- Q2 ----------
		try {
			int[] nums = { 3, 7, 2, 9, 4 };
			assert A1.Q2(nums) == 9;
			System.out.println("Q2 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q2 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q2 test failed - Exception");
		}

		// ---------- Q3 ----------
		try {
			int[] nums = { 1, 2, 3 };
			assert Arrays.equals(A1.Q3(nums), new int[] { 3, 2, 1 });
			System.out.println("Q3 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q3 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q3 test failed - Exception");
		}

		// ---------- Q4 ----------
		try {
			int[] nums = { 4, 8, 15, 16 };
			assert A1.Q4(nums, 15) == 2;
			assert A1.Q4(nums, 99) == -1;
			System.out.println("Q4 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q4 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q4 test failed - Exception");
		}

		// ---------- Q5 ----------
		try {
			int[] nums = { 1, 2, 3, 4 };
			assert A1.Q5(nums) == 24;
			System.out.println("Q5 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q5 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q5 test failed - Exception");
		}

		// ---------- Q6 ----------
		try {
			int[] nums = { 1, 2, 2, 3, 2 };
			assert A1.Q6(nums, 2) == 3;
			System.out.println("Q6 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q6 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q6 test failed - Exception");
		}

		// ---------- Q7 ----------
		try {
			int[] nums = { 1, 2, 3 };
			assert Arrays.equals(A1.Q7(nums), new int[] { 2, 4, 6 });
			System.out.println("Q7 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q7 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q7 test failed - Exception");
		}

		// ---------- Q8 ----------
		try {
			int[] nums = { 4, 1, 7, 3 };
			assert A1.Q8(nums) == 4;
			System.out.println("Q8 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q8 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q8 test failed - Exception");
		}

		// ---------- Q9 ----------
		try {
			int[] nums = { 3, 7, 2, 9 };
			assert A1.Q9(nums) == 7;
			System.out.println("Q9 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q9 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q9 test failed - Exception");
		}

		// ---------- Q10 ----------
		try {
			int[] nums = { 3, 1, 2 };
			assert Arrays.equals(A1.Q10(nums), new int[] { 1, 2, 3 });
			System.out.println("Q10 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q10 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q10 test failed - Exception");
		}

		// ---------- Q11 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q11 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q11 test failed - Exception");
		}

		// ---------- Q12 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q12 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q12 test failed - Exception");
		}

		// ---------- Q13 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q13 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q13 test failed - Exception");
		}

		// ---------- Q14 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q14 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q14 test failed - Exception");
		}

		// ---------- Q15 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q15 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q15 test failed - Exception");
		}

		// ---------- Q16 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q16 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q16 test failed - Exception");
		}

		// ---------- Q17 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q17 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q17 test failed - Exception");
		}

		// ---------- Q18 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q18 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q18 test failed - Exception");
		}

		// ---------- Q19 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q19 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q19 test failed - Exception");
		}

		// ---------- Q20 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q20 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q20 test failed - Exception");
		}

		// ---------- Q21 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q21 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q21 test failed - Exception");
		}

		// ---------- Q22 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q22 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q22 test failed - Exception");
		}

		// ---------- Q23 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q23 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q23 test failed - Exception");
		}

		// ---------- Q24 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q24 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q24 test failed - Exception");
		}

		// ---------- Q25 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q25 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q25 test failed - Exception");
		}

		// ---------- Q26 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q26 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q26 test failed - Exception");
		}

		// ---------- Q27 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q27 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q27 test failed - Exception");
		}

		// ---------- Q28 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q28 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q28 test failed - Exception");
		}

		// ---------- Q29 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q29 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q29 test failed - Exception");
		}

		// ---------- Q30 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q30 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q30 test failed - Exception");
		}

		// ---------- Q31 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q31 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q31 test failed - Exception");
		}

		// ---------- Q32 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q32 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q32 test failed - Exception");
		}

		// ---------- Q33 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q33 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q33 test failed - Exception");
		}

		// ---------- Q34 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q34 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q34 test failed - Exception");
		}

		// ---------- Q35 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q35 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q35 test failed - Exception");
		}

		// ---------- Q36 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q36 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q36 test failed - Exception");
		}

		// ---------- Q37 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q37 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q37 test failed - Exception");
		}

		// ---------- Q38 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q38 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q38 test failed - Exception");
		}

		// ---------- Q39 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q39 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q39 test failed - Exception");
		}

		// ---------- Q40 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q40 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q40 test failed - Exception");
		}

		// ---------- Q41 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q41 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q41 test failed - Exception");
		}

		// ---------- Q42 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q42 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q42 test failed - Exception");
		}

		// ---------- Q43 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q43 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q43 test failed - Exception");
		}

		// ---------- Q44 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q44 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q44 test failed - Exception");
		}

		// ---------- Q45 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q45 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q45 test failed - Exception");
		}

		// ---------- Q46 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q46 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q46 test failed - Exception");
		}

		// ---------- Q47 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q47 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q47 test failed - Exception");
		}

		// ---------- Q48 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q48 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q48 test failed - Exception");
		}

		// ---------- Q49 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q49 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q49 test failed - Exception");
		}

		// ---------- Q50 ----------
		try {
			//Write assertion code to test your function

		} catch (AssertionError ex) {
			System.out.println("Q50 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q50 test failed - Exception");
		}

	}
}