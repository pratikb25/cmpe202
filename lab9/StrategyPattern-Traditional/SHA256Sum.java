import java.security.*;
import java.math.*;

public class SHA256Sum implements HashAlgorithm
{
    /**
     * Calculates SHA256 sum of given string
     *
     * @param  plainText  String to be hashed
     * @return            The hashed string
     */
    public String calculateHash(String plainText)
    {
        BigInteger num = null;
        String hash = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            System.out.println("Calculating the SHA256 hash of String [" + plainText + "]");
            byte[] messageDigest = md.digest(plainText.getBytes());
            num = new BigInteger(1, messageDigest);    
            hash = num.toString(16);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return hash;
    }
}
