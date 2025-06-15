package org.example;

public class App {
  public static void main(String[] args) {
    Factorizer factorizer = new Factorizer();

    System.out.println("Prime factors of 0: " + factorizer.primeFactors(0)); // This should print []
    System.out.println("Prime factors of 1: " + factorizer.primeFactors(1)); // This should print []
    System.out.println("Prime factors of 28: " + factorizer.primeFactors(28)); // This should print [2, 2, 7]
    System.out.println("Prime factors of 100: " + factorizer.primeFactors(100)); // This should print [2, 2, 5, 5]

  }
}
