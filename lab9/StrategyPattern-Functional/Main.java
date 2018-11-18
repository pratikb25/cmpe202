import java.security.*;
import java.math.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
		List <HashAlgorithm> hashingStrategies = null;
		String plaintext = "This is sample plaintext";
		System.out.println("Implementation of Strategy Pattern using Lambda functions in Java");
		
		// Step 1. Create MD5 sum and SHA-256 strategies
		hashingStrategies = Arrays.asList(
			(plainText) -> {
				BigInteger num = null;
				String hash = null;
				try {
					MessageDigest md = MessageDigest.getInstance("MD5");
					System.out.println("Calculating the MD5 hash of String [" + plainText + "]");
					byte[] messageDigest = md.digest(plainText.getBytes());
					num = new BigInteger(1, messageDigest);
					hash = num.toString(16);
					System.out.println("MD5: " + hash + "\n");
				}
				catch(Exception e) {
					System.out.println(e);
				}
			},
			(plainText) -> {
				BigInteger num = null;
				String hash = null;
				try {
					MessageDigest md = MessageDigest.getInstance("SHA-256");
					System.out.println("Calculating the SHA265 hash of String [" + plainText + "]");
					byte[] messageDigest = md.digest(plainText.getBytes());
					num = new BigInteger(1, messageDigest);
					hash = num.toString(16);
					System.out.println("SHA256: " + hash + "\n");
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		);
		
		// Step 2. Calculate hash values
		hashingStrategies.forEach((txt) -> txt.calculateHash(plaintext));
	}
}
