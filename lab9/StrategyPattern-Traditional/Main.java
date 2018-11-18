
public class Main {
    public static void main(String args[]) {
        String plaintext = "This is sample plaintext";
        HashingContext context = new HashingContext();
        // Calculate MD5 sum
        context.setHashingStrategy(new MD5Sum());
        System.out.println("MD5: " + context.getHash(plaintext));
        
        // Calculate 
        context.setHashingStrategy(new SHA256Sum());
        System.out.println("SHA256: " + context.getHash(plaintext));
    }
}