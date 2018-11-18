
public class HashingContext
{
    HashAlgorithm hashAlgo = null;
    
    public void setHashingStrategy(HashAlgorithm h) {
        hashAlgo = h;
    }
    
    public String getHash(String input) {
        String hash = hashAlgo.calculateHash(input);
        return hash;
    }
}
