# **ReImplementation of Strategy Pattern using Lambda in Java8**

## Comparison between Strategy Pattern and Lambda Implementation

### Strategy Pattern Implementation
------------------------------------------------------------------------------------------------------------------------------
Strategy Pattern changes the behavior of an algorithm at runtime depending on the context being set. The strategy pattern Java code in 'StrategyPattern-Traditional' directory calculates the MD5 or the SHA-256 hash of the input string. The interface 'HashAlgorithm' declares a method for hash calculation which is then implemented independently by following classes

- MD5Sum
- SHA256Sum

And, the HashingContext class sets appropriate contexts between the two. Depending on current strategy, either MD5 or SHA256 hash of inout plaintext is displayed on screen.

### Lambda Implementation
------------------------------------------------------------------------------------------------------------------------------
In the functional implementation, we define 'HashAlgorithm' interface but provide no implementation to the calculateHash() method. The 'Main' is the driver class here where we create a list of both the Strategies: MD5 and SHA256 and use Java8 lambda function to provide the implementation to each strategy. We can, then, iterate through this list and run each strategy for input plaintext.

Thus, using the Lambda functions, we eliminate the creation of separate implementations for each strategy. Lambda implementation is less verbose as compared to the traditional strategy pattern implementation.
