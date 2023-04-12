
public class Test2 {

	public static String findMissingBinary(int n, String[] binaryNums) {
	    int missingDecimal = -1;
	    boolean[] found = new boolean[n+1];
	    
	    // Mark the integers that are present in binaryNums array
	    for (String binary : binaryNums) {
	        int decimal = Integer.parseInt(binary, 2);
	        found[decimal] = true;
	    }
	    
	    // Find the missing decimal integer
	    for (int i = 0; i <= n; i++) {
	        if (!found[i]) {
	            missingDecimal = i;
	            break;
	        }
	    }
	    
	    // Convert the missing decimal integer to binary representation
	    return Integer.toBinaryString(missingDecimal);
	}

	public static void main(String[] args) {
		
		findMissingBinary(6, args);
	}

}
